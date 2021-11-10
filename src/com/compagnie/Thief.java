package com.compagnie;

public class Thief extends Character{
    private static int dodge = 50;
    private static int criticalHit = 50;

    public static int getDodge() {
        return dodge;
    }

    public static int getCriticalHit() {
        return criticalHit;
    }

    public static int Damage(int opponentDamage) {
        if (Math.random() * 10 > getDodge()) {
            return getHealth();
        }
        else {
            return getHealth() - opponentDamage;
        }
    }

    public static int CriticalDamage(int opponentHealth) {
        if(Math.random() * 10 < getCriticalHit()) {
            return opponentHealth - (getDamage() * 2);
        }
        else {
            return opponentHealth - getDamage();
        }
    }
}
