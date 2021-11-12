import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCharacterList extends Character {
    private static String pseudo;

    public static List grosslist = new ArrayList();


    public static void main() {
    }

    public static void createcharacter() {

        Scanner scanner = new Scanner(System.in);

        List indexplace = new ArrayList();

        System.out.println("Définissez votre nom");
        name = scanner.nextLine();
        System.out.println("Définissez votre vie");
        health = scanner.nextInt();
        System.out.println("Définissez votre damage");
        damage = scanner.nextInt();
        System.out.println("Définissez votre speed");
        speed = scanner.nextInt();

        indexplace.add(name);
        indexplace.add(health);
        indexplace.add(damage);
        indexplace.add(speed);
        System.out.println(indexplace);
        grosslist.add(indexplace);



    }

    public static void ListPrint() {
        System.out.println(grosslist);
    }



    public static void ShowCharacterList() {
        for (int i = 0; i < grosslist.size(); i++){
            System.out.println("Personnage 1 :" + i );

        }
    }
}








   // List GrosseList = new ArrayList();


     //   GrosseList.add(myList);

       //         for(int i=0;i<4;i++){
        //System.out.println(myList.get(i));


