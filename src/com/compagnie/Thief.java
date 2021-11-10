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

    public static int CriticalDamage(int opponentHealth) {

        if(Math.random() * 100 < getCriticalHit()) {
            criticalHit = 0;
            return opponentHealth - (getDamage() * 2);
        } else {
            criticalHit = 35;
            return opponentHealth - getDamage();
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
