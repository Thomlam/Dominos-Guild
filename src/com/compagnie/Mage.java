package com.compagnie;

public class Mage extends Character{

    private static String archetype = "Mage";
    private static int magicDamage = 12;

    private static int getMagicDamage() {
        return magicDamage;
    }

    public static String getArchetype() {
        return archetype;
    }

    public static int magicAttack(int opponentHealth) {
        int damage = opponentHealth - (getDamage() + getMagicDamage());
        if (getMagicDamage() % 2 == 1) {
            magicDamage = getMagicDamage() - 1;
        }
        else {
            magicDamage = getMagicDamage() / 2;
        }
        return damage;
    }

    private static String toString(int attribute) {
        return "" + attribute;
    }

    public static void displayMage() {
        System.out.println("Class : " + getArchetype());
        displayStats();
        System.out.println("Magic Damage : " + getMagicDamage());
    }

}
