package com.company;
public class Character {

    public String characterName = "Gadalf";
    public int level = 0;
    public int healthPoint = 100;
    public int manaPoint = 200;

    Character(){
    }

    Character(String name, int level, int hp, int mp){
        this.characterName = name;
        this.level =level;
        this.healthPoint = hp;
        this.manaPoint = mp;
    }

    public void displayStatus(){
        System.out.println("\nCharacter Name: " + this.characterName);
        System.out.println("Level: " + this.level);
        System.out.println("Health Points: " + this.healthPoint);
        System.out.println("Mana Points: " + this.manaPoint);
        System.out.println("\n----------------------------");
    }

    public void dispCharName(){
        System.out.println("Character Initialized: " + this.characterName);
    }

    public void recovery(int manaInc, int healthInc){
        this.manaPoint += manaInc;
        this.healthPoint += healthInc;
    }

    public void damageTarget(Character enemyCharacter, int damagePoint){
        enemyCharacter.healthPoint -= damagePoint;
        System.out.println("Character HP dropped to: " + enemyCharacter.healthPoint);
        if (enemyCharacter.healthPoint <= 0) {
            System.out.println("\n----------------------------");
            System.out.println("Opponent Character has been defeated!!");
            System.out.println("Battle is ENDED.\n");
            System.out.println(this.characterName + " leveled up!");
            this.level += 10;
        }
    }

    public void manaCost(int manaPoint){
        this.manaPoint -= manaPoint;
    }
}