package com.frequentlyAskedJavaProgram;

import java.util.Scanner;

public class Find_Largest_Number_Using_Ternary_Operator {
    public static void main(String[] args) {
        //Ternary operator evaluates a boolean expression and assign the value based on the result
        int num1,num2,num3,result,temp; //declared the variable
        /* Scanner is used for getting user input.
         * The nextInt() method of scanner reads the
         * integer entered by user.
         */
        Scanner sc = new Scanner(System.in); //System.in is an InputStream which is typically connected to keyboard input of console programs.
        System.out.println("Enter first number :");
        num1 = sc.nextInt();
        System.out.println("Enter second number :");
        num2 = sc.nextInt();
        System.out.println("Enter third number :");
        num3 = sc.nextInt();

        sc.close();
        /* In first step we are comparing only num1 and
         * num2 and storing the largest number into the
         * temp variable and then comparing the temp and
         * num3 to get final result.
         */
        temp = num1>num2?num1:num2;
        result = num3>temp?num3:temp;

        System.out.println("Largest number is :"+result);
    }
}
