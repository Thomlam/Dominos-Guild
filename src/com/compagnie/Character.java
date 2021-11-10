package com.compagnie;

public class Character {
    private String name = "Pradish";
    private int health = 50;
    private int damage = 5;
    private int speed = 3;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int takeDamage(int opponentDamage) {
        int characterHealth = getHealth() - opponentDamage;
        return characterHealth;
    }

    public String toString(int attribute) {
        return "" + attribute;
    }
}
