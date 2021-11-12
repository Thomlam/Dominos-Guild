package com.compagnie;

public class Mage extends Character{

    private static String archetype = "Mage";
    private static int magicDamage = 12;

    public static int getMagicDamage() {
        return magicDamage;
    }


    public static int magicAttack(int opponentHealth, int charDamage, int charMagicDamage) {
        int damage = opponentHealth - (charDamage + charMagicDamage);
        if (charMagicDamage % 2 == 1) {
            charMagicDamage = (charMagicDamage / 2) - 1;
        }
        else {
            charMagicDamage = charMagicDamage / 2;
        }
        return damage;
    }

    private static String toString(int attribute) {
        return "" + attribute;
    }

    public static void displayMage() {
        System.out.println("Class : " + archetype);
        displayStats();
        System.out.println("Magic Damage : " + getMagicDamage());
    }

}
