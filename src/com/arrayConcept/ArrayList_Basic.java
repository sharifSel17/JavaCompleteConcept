package com.arrayConcept;

import java.util.ArrayList;

public class ArrayList_Basic {

    public static void main(String[] args) {
        //how to creat an arrayList, array-list which is provided java library,
        // than data type and variable name and than new keyword again ArrayList and data type.
        //data type is string
            //ArrayList<String> arrList = new ArrayList<String>();
        //we can create same as for integer
            //ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        //how to add an array in the array-list, we can add a value in various way,
        //if we want to add a value to add in th end we can use just add method simply by
            //arrList.add("sharif");
        //OR we can add using by index to add a value in specific location
            //arrList.add(2,"uddin");

        //First example to add a value in array-list
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Uddin");
        arrList.add("Jasim");
        arrList.add("Sharif");
        arrList.add("Noor");
        //System.out.println(arrList);

        //add a value on specified location using index
        //arrList.add(2,"Saafin");
        //System.out.println(arrList);

        //we can also change a value from array-list, using set-method, as like as add, like index and value
        //arrList.set(0,"Mahtab");
        //System.out.println(arrList);

        //remove element from array-list, same as add() method, remove()
        //arrList.remove("Sharif");
        //System.out.println(arrList);
        //we can remove by index

        //In the above examples, we have displayed the ArrayList elements just by referring the ArrayList instance,
        //which is definitely not the right way to displays the elements
        //The correct way of displaying the elements is by using an advanced for loop like this.
        //for enhanced loop or for each loop the syntax is
        for (String st:arrList){
            //We can use size() method of ArrayList to find the number of elements in an ArrayList.
            System.out.println(st);
        }
        //we have a sort() method in the Collections class

        System.out.println("Array Size :"+arrList.size());

    }


}
