package com.frequentlyAskedJavaProgram;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        int number = 0;
        int reverseNum = 0;
        System.out.println("Enter Your number :");
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();
        //While Loop: Logic to find out the reverse number
        while(number!=0){
            reverseNum = reverseNum*10;
            reverseNum = reverseNum+number%10;// [%]The modulus operator returns the remainder of the two numbers after division
            number=number/10;
        }
        System.out.println("Reverse number is :"+reverseNum);
    }
}
