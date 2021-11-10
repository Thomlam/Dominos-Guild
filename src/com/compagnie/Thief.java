package com.compagnie;

public class Thief extends Character{
    private static int dodge = 25;
    private static int criticalHit = 25;

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
            return opponentHealth - (getDamage() * 2);
        }
        else {
            return opponentHealth - getDamage();
        }
    }
}
