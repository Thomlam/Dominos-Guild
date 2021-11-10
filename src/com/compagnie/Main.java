package com.compagnie;

public class Main extends Thief {

    public static void main(String[] args) {
        int opponentHealth = 50;
        for (int i = 0; i < 10; i++) {
            int before = opponentHealth;
            opponentHealth = CriticalDamage(opponentHealth);
            int after = opponentHealth;
            System.out.println("he have now : " + opponentHealth + "hp, he loses : " + (before - after) + "hp");
        }

    }
}

