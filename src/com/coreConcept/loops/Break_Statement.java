package com.coreConcept.loops;

public class Break_Statement {
    public static void main(String[] args) {
        //when break statement is encountered inside a loop, the control directly comes out of the loop and loop gets terminated
        //break statement for loop
        /*for (int var = 10; var>0; var--){
            System.out.println("value is :"+var);
            if (var==7){
                break;
            }
        }
       // System.out.println("out of for loop");*/

        //break statement while loop
        int i = 0;
        while (i<5){
            System.out.println("value is :"+i);
            if (i==2){
                break;
            }
            i++;
        }
        // System.out.println("out of for loop");



    }
}
