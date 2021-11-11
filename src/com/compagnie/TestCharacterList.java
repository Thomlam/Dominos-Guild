package com.compagnie;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCharacterList extends Character {
    private static String pseudo;

    public static List grosslist = new ArrayList();

    private static String classVerif () {
        String archetype;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the class");
        archetype = scanner.nextLine();
        System.out.println(archetype);
        if(archetype.equals("Warrior") || archetype.equals("Mage") || archetype.equals("Thief")) {
            return archetype;
        }
        else {
            classVerif();
            return "";
        }
    }

    public static void main() {
    }

    public static void createcharacter() {

        String name = getName();
        int health = getHealth();
        int damage = getDamage();
        int speed = getSpeed();

        Scanner scanner = new Scanner(System.in);

        List indexplace = new ArrayList();

        System.out.println("Choose the name");
        name = scanner.nextLine();
        String archetype = classVerif();
        classValues(archetype);
        System.out.println("Choose the health");
        health = scanner.nextInt();
        System.out.println("Choose the damage");
        damage = scanner.nextInt();
        System.out.println("Choose the speed");
        speed = scanner.nextInt();

        indexplace.add(name);
        indexplace.add(archetype);
        indexplace.add(health);
        indexplace.add(damage);
        indexplace.add(speed);
        if(archetype.equals("Warrior")) {
            indexplace.add(Warrior.getDefense());
        }
        if(archetype.equals("Mage")) {
            indexplace.add(Mage.getMagicDamage());
        }
        if(archetype.equals("Thief")) {
            indexplace.add(Thief.getDodge());
            indexplace.add(Thief.getDodge());
        }

        System.out.println(indexplace);
        grosslist.add(indexplace);
        CharacterList();

    }

    public static void ListPrint() {
        System.out.println(grosslist);
    }

    public static void CharacterList() {



    }
}






// List GrosseList = new ArrayList();


//   GrosseList.add(myList);

//         for(int i=0;i<4;i++){
//System.out.println(myList.get(i));

