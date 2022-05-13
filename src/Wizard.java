package com.company;

public class Wizard extends Character{

    Wizard(String name, int level, int hp, int mp) {
        super(name, level, hp, mp);
    }

    public void judgment(Character character){
        int damagePoint = 150;
        int manaCost = 85;
        System.out.println(super.characterName + " used Judgment");
        damageTarget(character, damagePoint);
        manaCost(manaCost);
    }

    public void lunarPurge(Character character){
        int damagePoint = 70;
        int manaCost = 50;
        System.out.println(super.characterName + " used Lunar Purge");
        damageTarget(character, damagePoint);
        manaCost(manaCost);
    }

    public void jungleHealing(){
        int healPoint = 50;
        int manaIncreasement = 50;
        System.out.println(super.characterName + " used Jungle Healing");
        recovery(manaIncreasement, healPoint);
    }
}
