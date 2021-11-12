package com.compagnie;

public class Character {
    private static String archetype = "Pradish";
    private static String name = "Pradish";         // this is a super name
    private static int health = 50;
    private static int damage = 5;
    private static int speed = 3;

    public static String getName() {
        return name;
    }

    public static int getHealth() { return health; }

    public static int getDamage() {
        return damage;
    }

    public static int getSpeed() {
        return speed;
    }

    public static int takeDamage(int damage, int opponentHealth) {
        int characterHealth = opponentHealth - damage;
        return characterHealth;
    }


    public static String classValues() {

        if(archetype == "Warrior") {
            int defense = Warrior.getDefense();
        }
        else if(archetype == "Mage") {
            int magicalAttack = Mage.getMagicDamage();
        }
        else if(archetype == "Thief") {
            int dodge = Thief.getDodge();
            int critRate = Thief.getCriticalHit();
        }
        return archetype;
    }

    public static void displayStats() {

        System.out.println(getName());
        System.out.println("HP : " + toString(getHealth()));
        System.out.println("DMG : " + toString(getDamage()));
        System.out.println("Speed : " + toString(getSpeed()));

    }

    private static String toString(int attribute) {
        return "" + attribute;
    }
}
