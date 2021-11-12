package com.compagnie;

public class Thief extends Character{
    private static String archetype = "Thief";
    private static int dodge = 100;
    private static int criticalHit = 100;

    public static String getArchetype() { return archetype; }

    public static int getDodge() {
        return dodge;
    }

    public static int getCriticalHit() {
        return criticalHit;
    }

    public static int Damage(int opponentDamage, int charDodge, int charHealth) {

        if (Math.random() * 100 < charDodge) {
            return charHealth;
        }

        else {
            return charHealth - opponentDamage;
        }
    }

    public static int CriticalDamage(int opponentHealth, int charDamage, int charCritRate) {

            if (Math.random() * 100 < charCritRate) {

                return opponentHealth - (charDamage * 2);
            } else {
                return opponentHealth - charDamage;
            }

    }

    public static void displayThief() {
        System.out.println("Class : " + getArchetype());
        displayStats();
        System.out.println("Critical Rate : " + toString(getCriticalHit()));
        System.out.println("Dodge Rate : " + toString(getDodge()));
    }

    private static String toString(int attribute) { return "" + attribute; }
}
