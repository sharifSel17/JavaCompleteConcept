package com.exampleJava;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        //prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
        for (int i= 2;i<=num/2;i++){
            temp = num%i; // [%]The modulus operator returns the remainder of the two numbers after division
            if (temp==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num+ " is a prime number");
        else
            System.out.println(num+ " is not a prime number");
    }
}
