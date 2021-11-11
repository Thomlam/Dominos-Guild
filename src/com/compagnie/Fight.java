package com.compagnie;

import java.util.Scanner;

public class Fight extends Game_Main {

    private static String j1_name;
    private static String j1_archetype;
    private static int j1_health = 50;
    private static int j1_damage = 5;
    private static int j1_speed = 5;
    private static int j1_defense = 0;
    private static int j1_magicalAttack = 0;
    private static int j1_dodge = 0;
    private static int j1_critRate = 0;
    private static String j2_name;
    private static String j2_archetype;
    private static int j2_health = 50;
    private static int j2_damage = 5;
    private static int j2_speed = 5;
    private static int j2_defense = 0;
    private static int j2_magicalAttack = 0;
    private static int j2_dodge = 0;
    private static int j2_critRate = 0;

    public static int magicAttack(int magicalAttack ) {
        if (magicalAttack%2 == 0) { magicalAttack = (magicalAttack / 2); }
        else { magicalAttack = ((magicalAttack - 1) / 2); }
        return magicalAttack;
    }

    public static String getJ1_archetype() { return j1_archetype; }
    public static String getJ2_archetype() { return j2_archetype; }
    public static String getJ1_name() { return j1_name; }
    public static int getJ1_health() { return j1_health; }
    public static int getJ1_damage() { return j1_damage; }
    public static int getJ1_speed() { return j1_speed; }
    public static int getJ1_defense() { return j1_defense; }
    public static int getJ1_magicalAttack() { return j1_magicalAttack; }
    public static int getJ1_critRate() { return j1_critRate; }
    public static int getJ1_dodge() { return j1_dodge; }

    public static String getJ2_name() { return j2_name; }
    public static int getJ2_health() { return j2_health; }
    public static int getJ2_damage() { return j2_damage; }
    public static int getJ2_speed() { return j2_speed; }
    public static int getJ2_defense() { return j2_defense; }
    public static int getJ2_magicalAttack() { return j2_magicalAttack; }
    public static int getJ2_dodge() { return j2_dodge; }
    public static int getJ2_critRate() { return j2_critRate; }

    public static int takeDamage(int opponentDamage, int characterHealth, int characterdefense, int magicalAttack) {

        if ((opponentDamage + magicalAttack) > characterdefense) {
            characterHealth -= ((opponentDamage + magicalAttack) - characterdefense);
        }   else   {
            System.out.println("The shield have absorbed all damages");
        }
        magicalAttack = magicAttack(magicalAttack); // the function change the attack for a magician (reduce per 2 the magicalattack)

        return characterHealth;
    }

    private static void classValues(String archetype) {
        if(archetype == "Warrior") {
            j1_defense = 2;
        }
        else if(archetype == "Mage") {
            j1_magicalAttack = 12;
        }
        else if(archetype == "Thief") {
            j1_dodge = 20;
            j1_critRate = 20;
        }
    }

    public static void choice() {

        System.out.println("Player 1 select his brawler ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("You have selected : " + name);
        j1_name = name;
        System.out.println("Player 1 select his class (Warrior/Mage/Thief)");
        Scanner sc3 = new Scanner(System.in);
        String archetype = sc3.nextLine();
        while(archetype != "Warrior" && archetype != "Mage" && archetype != "Thief") {
            System.out.println("Wrong Class. Player 1 select his class (Warrior/Mage/Thief)");
            archetype = sc3.nextLine();
        }
        classValues(archetype);
        System.out.println("You have selected : " + archetype);
        j1_archetype = archetype;


        System.out.println("Player 2 select his brawler ");
        Scanner sc2 = new Scanner(System.in);
        String name2 = sc2.nextLine();
        System.out.println("You have selected : " + name2);
        j2_name = name2;
        System.out.println("Player 1 select his class (Warrior/Mage/Thief)");
        Scanner sc4 = new Scanner(System.in);
        String archetype2 = sc4.nextLine();
        while(archetype2 != "Warrior" && archetype2 != "Mage" && archetype2 != "Thief") {
            System.out.println("Wrong Class. Player 1 select his class (Warrior/Mage/Thief)");
            archetype2 = sc4.nextLine();
        }
        classValues(archetype2);
        System.out.println("You have selected : " + archetype2);
        j2_archetype = archetype2;

    }

    public static String fight() {

        boolean turn = true; // used to switch turn between the different characters
        choice();
        int numberturn = 0; //  used to know on which turn we are

        System.out.println("turn n°" + numberturn);
        System.out.println(j1_name);
        System.out.println("Hp :" + j1_health);
        System.out.println(j2_name);
        System.out.println("Hp :" + j2_health);

        while (j1_health >= 1 && j2_health >= 1) {  // used to make characters fight until one die

                if (j1_speed >= j2_speed) { // used to know if it's gonna be the first player who will play first
                    if (turn) {
                        j2_health = takeDamage(j1_damage, j2_health, j2_defense, magicAttack(j1_magicalAttack));
                        j1_magicalAttack = magicAttack(j1_magicalAttack);
                        turn = false;
                    }
                    else {
                        j1_health = takeDamage(j2_damage, j1_health, j1_defense, magicAttack(j2_magicalAttack));
                        j2_magicalAttack = magicAttack(j2_magicalAttack);
                        turn = true;
                    }

                }
                else {  //  used to know if it's gonna be the second player who will play first
                    if (turn) {
                        j1_health = takeDamage(j2_damage, j1_health, j1_defense, magicAttack(j2_magicalAttack));
                        j2_magicalAttack = magicAttack(j2_magicalAttack);
                        turn = false;
                    }
                    else {
                        j2_health = takeDamage(j1_damage, j2_health, j2_defense, magicAttack(j1_magicalAttack));
                        j1_magicalAttack = magicAttack(j1_magicalAttack);
                        turn = true;
                    }
                }
            numberturn += 1;
            System.out.println("turn n°" + numberturn);
            System.out.println(j1_name);
            System.out.println("Hp :" + j1_health);
            System.out.println(j2_name);
            System.out.println("Hp :" + j2_health);
        }
        if(j1_health <= 0) {
            return j2_name + " won the game ";
        }
        if(j2_health <= 0) {
            return j1_name + " won the game";
        }
        return "Pradish is my new waifu <3 <3 <3";
    }

}