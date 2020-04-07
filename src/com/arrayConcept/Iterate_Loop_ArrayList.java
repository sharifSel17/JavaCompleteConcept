package com.arrayConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_Loop_ArrayList {
    public static void main(String[] args) {
        //There are four ways to loop ArrayList:
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);

        //For Loop for iterating ArrayList
        System.out.println("For Loop :");
        for (int count = 0;count<arrList.size();count++)
        System.out.println(arrList.get(count));

        /* Advanced For Loop*/
        System.out.println("Enhanced for each loop");
        for (Integer val:arrList){
            System.out.println(val);
        }

        /* While Loop for iterating ArrayList*/
        System.out.println("While Loop :");
        int var = 0;
        while (arrList.size()>var){
            System.out.println(arrList.get(var));
            var++;
        }

        /*Looping Array List using Iterator*/
        System.out.println("Iterator");
        Iterator ir = arrList.iterator();//
        //Iterator is used for iterating (looping) various collection classes such as HashMap, ArrayList, LinkedList etc.
        while (ir.hasNext()){
            System.out.println(ir.next());

        }

    }
}
