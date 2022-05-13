package com.company;

public class Warlock extends Character{

    Warlock(String name, int level, int hp, int mp){
        super(name, level, hp, mp);
    }

    public void darkVoid(Character character){
        int damagePoint = 90;
        int manaCost = 65;
        System.out.println(super.characterName + " used Dark Void");
        damageTarget(character, damagePoint);
        manaCost(manaCost);
    }

    public void doomDesire(Character character){
        int damagePoint = 140;
        int manaCost = 100;
        System.out.println(super.characterName + " used Doom Desire");
        damageTarget(character, damagePoint);
        manaCost(manaCost);
    }

    public void oblivionWing(){
        int healPoint = 50;
        int manaIncreasement = 50;
        System.out.println(super.characterName + " used Oblivion Wing");
        recovery(manaIncreasement, healPoint);
    }
}
