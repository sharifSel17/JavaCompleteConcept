package com.exampleJava;

public class Finding_Factorial {
    //we can find factorial number using for loop or while loop
    //Factorial of a number and n is denoted as n! and the value of n! is: 1 * 2 * 3 * … (n-1) * n
    public static void main(String[] args) {
        //Finding factorial using for loop
        //we need two variable for finding factorial number

        int number = 4;
        long factNumber = 1;

        for (int i=1;i<=number;i++){
            factNumber = factNumber*i;
        }

        //Finding factorial using while loop
        int i=1;
        while (i<=number){
              factNumber = factNumber*i;
              i++;
        }
        System.out.println("Factorial "+number+" is "+factNumber);
    }
}
