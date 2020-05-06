package com.frequentlyAskedJavaProgram;

import java.util.Scanner;

/* If number is divisible by 2 then it's an even number
 * else odd number*/

public class Check_Odd_Even_Number {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number :");
        num = sc.nextInt();

        if (num%2==0){
            System.out.println("Entered number is Even :");
        }else {
            System.out.println("Entered Number is Odd :");
        }
    }
}
