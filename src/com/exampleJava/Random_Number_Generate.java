package com.exampleJava;

import java.util.Random;

public class Random_Number_Generate {
    //Random class is used to generate random numbers of different data types such as boolean, int, long, float, and double.
    // An object of Random class is initialized and the method nextInt(), nextDouble()
    public static void main(String[] args) {
        int count;
        Random ran = new Random();
        /* Below code would generate 5 random numbers
         * between 0 and 200.
         */
        for (count =0;count<=5;count++){
            System.out.println(ran.nextInt(200));
        }
    }
}
