package com.compagnie;

public class Warrior extends Character{

    private static int defense = 2;
    private static String archetype = "Warrior";

    public static int getDefense() { return defense; }

    public static String getArchetype() { return archetype; }

    public static int damage(int opponentDamage) {
        int health = getHealth();
        health = getHealth() - (opponentDamage - getDefense());
        return health;
    }

    private static String toString (int attribute) { return "" + attribute; }

    public static void displayWarrior() {
        System.out.println("Class : " + getArchetype());
        displayStats();
        System.out.println("Defense : " + getDefense());
    }

}
