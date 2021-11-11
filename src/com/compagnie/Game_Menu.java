package com.compagnie;
import java.util.Scanner;


public class Game_Menu extends Main{

    public static void ReturnOrNot (int choix2){
        while (choix2 !=0) {
            System.out.println("if you want return to menu, press 0");
            choix2 =VerifCheck();
        }
        System.out.println("return to menu");
        MenuChest();
    }

    public static int VerifCheck(){
        Scanner sc = new Scanner(System.in);
        int choix;
        try {
            choix = sc.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            choix = -1;
        }

        return choix;
    }
    public static void rules() { //Fonction pour les règles


    }

    public static void scores() { //Fonction pour les scores


    }

    public static void start() { //Fonction pour le jeu

        TestCharacterList.main();
    }

    public static void character() { //Fonction pour le jeu
        int choix;
        int choix2;
        choix = VerifCheck();

        switch (choix) {
            //Choix numéro 1
            case 1:
                System.out.println("Create-Player");
                TestCharacterList.createcharacter();
                // Déterminer si on continue dans le jeu ou l'on retourne au menu
                System.out.println("Choisir 0 pour retourner au menu principal.");
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Exit game ");

                break;


            //Choix numéro 2
            case 2:
                System.out.println("List-Player");
                TestCharacterList.ListPrint();

                // Déterminer si on continue dans l'affichage du score ou l'on retourne au menu
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Exit scoring");
                break;



            // Choix par défault si le choix est diffèrent des choix proposés auparavant//
            default:
                System.out.println("Error, Restart input");
                MenuChest();
                break;
        }
    }

    public static void MenuChest() {

        System.out.println("1:Start Game");
        System.out.println();
        System.out.println("2: Draw Scoring");
        System.out.println();
        System.out.println("3:Draw Rules");
        System.out.println();
        System.out.println("4: Start Character Menu");
        System.out.println();
        System.out.println("5: Exit Game");


        int choix; // Variable de type entier qui prend en compte le premier choix de l'utilisateur
        int choix2;// Variable de type entier qui prend en compte le deuxième choix de l'utilisateur

        choix = VerifCheck();


        switch (choix) {
            //Choix numéro 1
            case 1:
                System.out.println("Démarrer le jeu");
                start();

                // Déterminer si on continue dans le jeu ou l'on retourne au menu
                System.out.println("Choisir 0 pour retourner au menu principal.");
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Exit game ");

                break;


            //Choix numéro 2
            case 2:
                System.out.println("Scores");
                scores();

                // Déterminer si on continue dans l'affichage du score ou l'on retourne au menu
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Exit scoring");
                break;


            //Choix numéro 3
            case 3:
                System.out.println("Rules");
                rules();

                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Exit Rules");
                break;

            case 4:
                System.out.println("Press 1 for create character");
                System.out.println("Press 2 for see list character");
                character();
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Exit Rules");
                break;



            //Choix numéro 4//
            case 5:
                System.out.println("Bye.");
                break;

            // Choix par défault si le choix est diffèrent des choix proposés auparavant//
            default:
                System.out.println("Error, Restart input");
                MenuChest();
                break;
        }
    }


    public static void main() {

        MenuChest();
    }




}
