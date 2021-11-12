package com.compagnie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fight extends Game_Menu {

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


    public static void choice() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1 select his brawler in the list");
        TestCharacterList.ListPrint();
        int player = scanner.nextInt();

        for(int i = 0; i < TestCharacterList.grosslist.size(); i++) {
            if(player == i) {
                List littleList = (List) TestCharacterList.grosslist.get(i);
                j1_name = (String) littleList.get(0);
                j1_archetype = (String) littleList.get(1);
                j1_health = (int) littleList.get(2);
                j1_damage = (int) littleList.get(3);
                j1_speed = (int) littleList.get(4);

                if(TestCharacterList.classValues().equals("Warrior")) {
                    j1_defense = (int) littleList.get(5);
                }
                if(TestCharacterList.classValues().equals("Mage")) {
                    j1_magicalAttack = (int) littleList.get(5);
                }
                if(TestCharacterList.classValues().equals("Thief")) {
                    j1_dodge = (int) littleList.get(5);
                    j1_critRate = (int) littleList.get(6);
                }
            }
        }

        System.out.println("Player 2 select his brawler in the list");
        TestCharacterList.ShowList();
        int player2 = scanner.nextInt();
        for(int i = 0; i < TestCharacterList.grosslist.size(); i++) {
            if(player2 == i) {
                List littleList = (List) TestCharacterList.grosslist.get(i);
                j2_name = (String) littleList.get(0);
                j2_archetype = (String) littleList.get(1);
                j2_health = (int) littleList.get(2);
                j2_damage = (int) littleList.get(3);
                j2_speed = (int) littleList.get(4);
                if(TestCharacterList.classValues().equals("Warrior")) {
                    j2_defense = (int) littleList.get(5);
                }
                if(TestCharacterList.classValues().equals("Mage")) {
                    j2_magicalAttack = (int) littleList.get(5);
                }
                if(TestCharacterList.classValues().equals("Thief")) {
                    j2_dodge = (int) littleList.get(5);
                    j2_critRate = (int) littleList.get(6);
                }
            }
        }
    }

    public static String fight() {

        boolean turn = true; // used to switch turn between the different characters
        choice();
        int numberturn = 1; //  used to know on which turn we are

        System.out.println("The pizza power is send to every fighter. Pray the Pizza god.");
        System.out.println("Turn n°" + numberturn);
        System.out.println(j1_name + ":" + j2_name + ":");
        System.out.println("HP :" + j1_health + "HP :" + j2_health);

        while (j1_health >= 1 && j2_health >= 1) {  // used to make characters fight until one die

                if (j1_speed >= j2_speed) { // used to know if it's gonna be the first player who will play first
                    if (turn) {
                        if(j1_archetype.equals("Warrior")) {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = Character.takeDamage(j2_health, j1_damage);
                            }
                        }
                        else if(j1_archetype.equals("Mage")) {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = Mage.magicAttack(j2_health, j1_damage, j1_magicalAttack);
                            }
                        }
                        else if(j1_archetype.equals("Thief")) {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = Thief.CriticalDamage(j2_health, j1_damage, j1_critRate);
                            }
                        }
                        else {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = j2_health - j1_damage;
                            }
                        }

                        turn = false;
                    }
                    else {
                        if(j2_archetype.equals("Warrior")) {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = Character.takeDamage(j1_health, j2_damage);
                            }
                        }
                        else if(j2_archetype.equals("Mage")) {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = Mage.magicAttack(j1_health, j2_damage, j2_magicalAttack);
                            }
                        }
                        else if(j2_archetype.equals("Thief")) {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = Thief.CriticalDamage(j1_health, j2_damage, j2_critRate);
                            }
                        }
                        else {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = j1_health - j2_damage;
                            }
                        }
                        turn = true;
                    }

                }
                else {  //  used to know if it's gonna be the second player who will play first
                    if (turn) {
                        if(j2_archetype.equals("Warrior")) {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = Character.takeDamage(j1_health, j2_damage);
                            }
                        }
                        else if(j2_archetype.equals("Mage")) {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = Mage.magicAttack(j1_health, j2_damage, j2_magicalAttack);
                            }
                        }
                        else if(j2_archetype.equals("Thief")) {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = Thief.CriticalDamage(j1_health, j2_damage, j2_critRate);
                            }
                        }
                        else {
                            if (j1_archetype.equals("Thief")){
                                Thief.Damage(j2_damage, j1_dodge, j1_health);
                            } else {
                                j1_health = j1_health - j2_damage;
                            }
                        }
                        turn = false;
                    }
                    else {
                        if(j1_archetype.equals("Warrior")) {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = Character.takeDamage(j2_health, j1_damage);
                            }
                        }
                        else if(j1_archetype.equals("Mage")) {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = Mage.magicAttack(j2_health, j1_damage, j1_magicalAttack);
                            }
                        }
                        else if(j1_archetype.equals("Thief")) {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = Thief.CriticalDamage(j2_health, j1_damage, j1_critRate);
                            }
                        }
                        else {
                            if (j2_archetype.equals("Thief")){
                                Thief.Damage(j1_damage, j2_dodge, j2_health);
                            } else {
                                j2_health = j2_health - j1_damage;
                            }
                        }
                        turn = true;
                    }
                }
            numberturn += 1;
            if(numberturn % 2 == 0) {
                System.out.println("Pizza god likes the fight. He gave +2 motivation to everyone.");
            }
            else {
                System.out.println("Pizza god want more tomato sauce.");
            }
            System.out.println("");
            System.out.println("Turn n°" + numberturn);
            System.out.println(j1_name + "  HP :" + j1_health);
            System.out.println(j2_name + "  HP :" + j2_health);
        }
        if(j1_health <= 0) {
            return j2_archetype + j2_name + " won the game ";
        }
        if(j2_health <= 0) {
            return j1_archetype + j1_name + " won the game";
        }
        return "Pradish is my new waifu <3 <3 <3";
    }

}