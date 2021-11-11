package com.compagnie;

import java.util.Scanner;

public class Fight extends Game_Main {

    private static String name = "Pradish";
    private static int health = 50;
    private static int damage = 5;
    private static int speed = 5;
    private static String j1_name;
    private static int j1_health;
    private static int j1_damage;
    private static int j1_speed;
    private static String j2_name;
    private static int j2_health;
    private static int j2_damage;
    private static int j2_speed;


    public static String getName() {
        return name;
    }

    public static int getHealth() {
        return health;
    }

    public static int getDamage() {
        return damage;
    }

    public static int getSpeed() {
        return speed;
    }

    public static int takeDamage(int opponentDamage, int characterHealth) {
        characterHealth -= opponentDamage;
        return characterHealth;
    }

    public static void choice() {

        System.out.println("Joueur 1 choisit le nom de son combattant ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Vous avez entré : " + name);
        j1_name = name;
        j1_health = health;
        j1_damage = damage;
        j1_speed = speed;

        System.out.println("Joueur 2 choisit le nom de son combattant ");
        Scanner sc2 = new Scanner(System.in);
        String name2 = sc2.nextLine();
        System.out.println("Vous avez entré : " + name2);
        j2_name = name2;
        j2_health = health;
        j2_damage = damage;
        j2_speed = speed;

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
                        j2_health = takeDamage(j1_damage, j2_health);
                        turn = false;
                    }
                    else {
                        j1_health = takeDamage(j2_damage, j1_health);
                        turn = true;
                    }

                }
                else {  //  used to know if it's gonna be the second player who will play first
                    if (turn) {
                        j1_health = takeDamage(j2_damage, j1_health);
                        turn = false;
                    }
                    else {
                        j2_health = takeDamage(j1_damage, j2_health);
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
