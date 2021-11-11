package com.compagnie;

import java.util.ArrayList;
import java.util.List;

public class TestCharacterList extends Character{

    public static void main() {

        List myList = new ArrayList<Integer>() ;

        List GrosseList = new ArrayList();


        myList.add(Character.getDamage());
        myList.add(Character.getName());
        myList.add(Character.getSpeed());
        myList.add(Character.getHealth());

        GrosseList.add(myList);

        for(int i=0;i<4;i++){
            System.out.println(myList.get(i));
        }
        for(int i=0;i<1;i++){
            System.out.println(GrosseList.get(i));
        }

        Character.getHealth()= Helo;


    }
}
