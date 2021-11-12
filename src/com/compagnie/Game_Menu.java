package com.compagnie;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
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
    public static void rules() { // Function for the rules
        System.out.println("◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊");
        System.out.println("◊                                                   WELCOME IN THE RULES MENU                                                                                      ◊");
        System.out.println("◊                                                                                                                                                                  ◊");
        System.out.println("◊  Domino's Guild is a kind of RPG game (Role Play Game), that means that you can create characters with different classes to make them fights against each others ◊");
        System.out.println("◊                                                                                                                                                                  ◊");
        System.out.println("◊   ∆ CLASSES:                                                                                                                                                     ◊");
        System.out.println("◊  •MAGE, a weak character who deal a lot of damages in short fights               ◊  •WARRIOR, a strong character who can absorb a lot of damages with his shield ◊");
        System.out.println("◊  Info: He have bonus with a magical attack in addition of the normal attack      ◊   Info: He have shield that provide him a shield that can block a part of the ◊");
        System.out.println("◊  the magical attack is divided per 2                                             ◊   the enemy attacks (1 damage less for each shield point )                    ◊");
        System.out.println("◊  ›  Default:    HP:50    Attack:5    Speed:5    MagicalAttack:12                 ◊    ›  Default: HP:50    Attack:5    Speed:5    Shield:5                        ◊");
        System.out.println("◊                                                                                                                                                                  ◊");
        System.out.println("◊  •THIEF, a stealthy character who can dodge enemies attack or deal extra damages ◊                                                                               ◊");
        System.out.println("◊  Info: He have a chance to avoid all damages from an enemy attack and he have a  ◊                                                                               ◊");
        System.out.println("◊  chance do deal the double of damages in one hit                                 ◊                                                                               ◊");
        System.out.println("◊  ›  Default:   HP:50    Attack:5    Speed:5    crit rate:25%     dodge rate:25%  ◊                                                                               ◊");
        System.out.println("◊                                                                                                                                                                 ◊");
        System.out.println("◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊");
    }

   // public static void scores() { // Function for the score
   //
   // }

    public static void start() { // Function for the game
         Fight.fight();
    }

    public static void character() { // Function for the characters
        int choix;
        int optionNumber2;
        choix = VerifCheck();

        switch (choix) {

            case 1:
                System.out.println("Create-Player");
                TestCharacterList.createcharacter();
                    // Verification to continue the program or return to main menu
                System.out.println("Select 0 to return at the main menu.");
                optionNumber2 = VerifCheck();
                ReturnOrNot(optionNumber2);
                System.out.println("Exit game ");
                break;

            case 2:
                System.out.println("List-Player");
                TestCharacterList.ListPrint();

                // Verify if we have to continue to display the score or return to the main menu
                
                optionNumber2 = VerifCheck();
                ReturnOrNot(optionNumber2);
                System.out.println("Exit scoring");
                break;

            case 3:
                System.out.println("ShowPlayer");
                TestCharacterList.ShowList();

                // Verify if we have to continue to display the score or return to the main menu

                optionNumber2 = VerifCheck();
                ReturnOrNot(optionNumber2);
                System.out.println("Exit scoring");
                break;

            case 4:
                System.out.println("Delete Character");
                TestCharacterList.DeletedCharacter();

                // Verify if we have to continue to display the score or return to the main menu

                optionNumber2 = VerifCheck();
                ReturnOrNot(optionNumber2);
                System.out.println("Exit scoring");
                break;

            // default option if "no one/ good one" has been selected
            default:
                System.out.println("Error, Restart input");
                MenuChest();
                break;
        }
    }

    public static void MenuChest() {

        System.out.println("1:Start Game");
        System.out.println();
        System.out.println("2: Display Scoring");
        System.out.println();
        System.out.println("3: Display Rules");
        System.out.println();
        System.out.println("4: Start Character Menu");
        System.out.println();
        System.out.println("5: Exit Game");


        int firstcase; // An integer who take in consideration the first choice of the user
        int Secondcase; // ----------------------------------- the second choice of the user

        firstcase = VerifCheck();


        switch (firstcase) {
            case 1:
                System.out.println("Start the game");
                start();

                // Verification to continue the program or return to main menu
                System.out.println("Choisir 0 pour retourner au menu principal.");
                Secondcase = VerifCheck();
                ReturnOrNot(Secondcase);
                System.out.println("Exit game ");

                break;

            case 2:
                System.out.println("Scores");


                // Verification to continue the program or return to main menu
                Secondcase = VerifCheck();
                ReturnOrNot(Secondcase);
                System.out.println("Exit scoring");
                break;

            case 3:
                System.out.println("Rules");
                rules();

                Secondcase = VerifCheck();
                ReturnOrNot(Secondcase);
                System.out.println("Exit Rules");
                break;

            case 4:
                System.out.println("Press 1 for create character");
                System.out.println("Press 2 for see list character");
                System.out.println("Press 3 for show list character");

                character();
                Secondcase = VerifCheck();
                ReturnOrNot(Secondcase);
                System.out.println("Exit Rules");
                break;

            case 5:
                System.out.println("Bye.");
                System.exit(1);
                break;

                // default parameter if the "firstcase" is different of  "firstcase" entered before//
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
