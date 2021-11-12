package com.compagnie;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCharacterList extends Character {
    private static String pseudo = getName();

    public static List grosslist = new ArrayList();

    private static String classVerif() {
        String archetype;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the class");
        archetype = scanner.nextLine();
        System.out.println(archetype);
        if (archetype.equals("Warrior") || archetype.equals("Mage") || archetype.equals("Thief")) {
            return archetype;
        } else {
            classVerif();
            return "";
        }
    }

    public static void main() {
    }

    public static void createcharacter() {

        int check = 0;
        String name = getName();
        int health = getHealth();
        int damage = getDamage();
        int speed = getSpeed();
        int defense = Warrior.getDefense();
        int magicDamage = Mage.getMagicDamage();
        int dodge = Thief.getDodge();
        int critRate = Thief.getCriticalHit();

        Scanner scanner = new Scanner(System.in);



        System.out.println("Choose the name");
        pseudo= name = scanner.nextLine();
        String archetype = classVerif();
        classValues();
        System.out.println("Choose the health");
        List indexplace = new ArrayList();

        while(check == 0) {
            try {
                health = scanner.nextInt();
                check = 1;
            }
            catch (Exception e) {
                health = scanner.nextInt();
            }
        }

        System.out.println("Choose the damage");

        while (check == 1) {
            try {
                damage = scanner.nextInt();
                check = 2;
            }
            catch (Exception e) {
                damage = scanner.nextInt();
            }
        }

        System.out.println("Choose the speed");

        while ( check == 2)
        try {
            speed = scanner.nextInt();
            check = 3;
        }
        catch (Exception e) {
            speed = scanner.nextInt();
        }

        indexplace.add(name);
        indexplace.add(archetype);
        indexplace.add(health);
        indexplace.add(damage);
        indexplace.add(speed);

        if (archetype.equals("Warrior")) {
            System.out.println("Choose the defense");

            while ( check == 3) {
                try {
                    defense = scanner.nextInt();
                    check = 4;
                }
                catch (Exception e) {
                    defense = scanner.nextInt();
                }
            }

            indexplace.add(defense);
        }

        if (archetype.equals("Mage")) {
            System.out.println("Choose the magic damage");

            while (check == 3) {
                try {
                    magicDamage = scanner.nextInt();
                }
                catch (Exception e) {
                    magicDamage = scanner.nextInt();
                }
            }

            indexplace.add(magicDamage);
        }

        if (archetype.equals("Thief")) {
            System.out.println("Choose the dodge rate");

            while ( check == 3) {
                try {
                    dodge = scanner.nextInt();
                    check = 4;
                }
                catch (Exception e) {
                    dodge = scanner.nextInt();
                }
            }

            System.out.println("Choose the critical rate");

            while (check == 4) {
                try {
                    critRate = scanner.nextInt();
                    check = 5;
                }
                catch (Exception e) {
                    critRate = scanner.nextInt();
                }
            }

            indexplace.add(critRate);
            indexplace.add(dodge);
        }


        System.out.println(indexplace);
        grosslist.add(indexplace);


    }

    public static void ListPrint() {
        System.out.println(grosslist);
    }



    public static void ShowList() {
        for (int i = 0; i < grosslist.size(); i++) {
            System.out.println("Personnage " + (i + 1) + " index :" + (i+1));


        }
    }
    public static void DeletedCharacter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index for delete ");

        for (int i = 0; i < grosslist.size(); i++) {
           int index = scanner.nextInt();
           grosslist.get(index - 1);
           grosslist.remove(index -1);


        }
    }
}






// List GrosseList = new ArrayList();


//   GrosseList.add(myList);

//         for(int i=0;i<4;i++){
//System.out.println(myList.get(i));

