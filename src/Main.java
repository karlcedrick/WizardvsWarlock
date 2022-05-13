package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wizards vs Warlocks");

        Wizard Merlin = new Wizard("Merlin", 0, 300, 200);
        Warlock Saruman = new Warlock("Saruman", 0, 300, 200);

        System.out.println("Select your Character.");
        System.out.println("1 - Wizard");
        System.out.println("2 - Warlock");

        Scanner select = new Scanner(System.in);
        int option;
        option = select.nextInt();
        if (option == 1){
            System.out.println("You selected Wizard.");
            System.out.println("Wizard will do the first attack.");

            System.out.println("Let the battle begin!");

            do{
                System.out.println("\nMerlin's turn.");
                System.out.println("1 - Judgement\t2 - Lunar Purge\t3 - Jungle Healing");
                option = select.nextInt();
                if (option == 1) {
                    Merlin.judgment(Saruman);
                    Merlin.displayStatus();
                } else if (option == 2){
                    Merlin.lunarPurge(Saruman);
                    Merlin.displayStatus();
                }else{
                    Merlin.jungleHealing();
                    Merlin.displayStatus();
                }
                System.out.println("\nSaruman's turn.");
                System.out.println("1 - Dark Void\t2 - Doom Desire\t3 - Oblivion Wing");
                option = select.nextInt();
                if (option == 1) {
                    Saruman.darkVoid(Merlin);
                    Saruman.displayStatus();
                } else if (option == 2){
                    Saruman.doomDesire(Merlin);
                    Saruman.displayStatus();
                }else if (option == 3){
                    Saruman.oblivionWing();
                    Saruman.displayStatus();
                }
            }while ((Merlin.healthPoint >= 0) && (Saruman.healthPoint >= 0));

        }else if (option == 2){
            System.out.println("You selected Warlock.");
            System.out.println("Warlock will the first attack.");

            System.out.println("Let the battle begin!");

            do{
                System.out.println("\nSaruman's turn.");
                System.out.println("1 - Dark Void\t2 - Doom Desire\t3 - Oblivion Wing");
                option = select.nextInt();
                if (option == 1) {
                    Saruman.darkVoid(Merlin);
                    Saruman.displayStatus();
                } else if (option == 2){
                    Saruman.doomDesire(Merlin);
                    Saruman.displayStatus();
                }else{
                    Saruman.oblivionWing();
                    Saruman.displayStatus();
                }
                System.out.println("\nMerlin's turn.");
                System.out.println("1 - Judgement\t2 - Lunar Purge\t3 - Jungle Healing");
                option = select.nextInt();
                if (option == 1) {
                    Merlin.judgment(Saruman);
                    Merlin.displayStatus();
                } else if (option == 2){
                    Merlin.lunarPurge(Saruman);
                    Merlin.displayStatus();
                }else if (option == 3){
                    Merlin.jungleHealing();
                    Merlin.displayStatus();
                }

                if (Merlin.healthPoint >= 0){
                    Saruman.dispCharName();
                }else{
                    Merlin.dispCharName();
                }
            }while ((Merlin.healthPoint >= 0) || (Saruman.healthPoint >= 0));
        }
    }
}
