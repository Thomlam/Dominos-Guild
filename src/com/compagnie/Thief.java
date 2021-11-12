package com.compagnie;

public class Thief extends Character{
    private static String archetype = "Thief";
    private static int dodge = 25;
    private static int criticalHit = 35;

    public static String getArchetype() { return archetype; }

    public static int getDodge() {
        return dodge;
    }

    public static int getCriticalHit() {
        return criticalHit;
    }

    public static int Damage(int opponentDamage) {

        if (Math.random() * 100 > getDodge()) {
            return getHealth();
        }

        else {
            return getHealth() - opponentDamage;
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
