package com.compagnie;

public class Thief extends Character{
    private static String archetype = "Thief";
    private static int dodge = 25;
    private static int criticalHit = 25;

    public static String getArchetype() { return archetype; }

    private static int getDodge() {
        return dodge;
    }

    private static int getCriticalHit() {
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


    boolean crit=false;

    public int CriticalDamage(int opponentHealth) {
        
        if((Math.random() * 100 < getCriticalHit()) && crit == false) {
            return opponentHealth - (getDamage() * 2);
            //crit = true;
            
        }
        else {
            return opponentHealth - getDamage();
            //crit = false;
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
