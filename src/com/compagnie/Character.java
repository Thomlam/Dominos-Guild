package com.compagnie;

public class Character {
    private static String name = "Pradish";
    private static int health = 50;
    private static int damage = 5;
    private static int speed = 3;

    public static String getName() {
        return name;
    }

    public static int getHealth() {
        return health;
    }

    public static int getDamage() {
        return damage;
    }

    public static int getSpeed() {
        return speed;
    }

    public int takeDamage(int opponentDamage) {
        int characterHealth = getHealth() - opponentDamage;
        return characterHealth;
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
