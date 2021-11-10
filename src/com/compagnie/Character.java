package com.compagnie;

public class Character {
    private String name;
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

    public int takeDamage(opponentDamage) {
        characterHealth = getHealth() - opponentDamage
        return characterHealth
    }

    public void String displayStats() {

        String characterName = getName();
        System.out.println(characterName);

        String characterHealth = toString(getHealth());
        System.out.println(characterHealth);

        String characterDamage = toString(getDamage());
        System.out.println(characterDamage);

        String characterSpeed = toString(getSpeed());
        System.out.println(characterSpeed);

    }

    displayStats()
}
