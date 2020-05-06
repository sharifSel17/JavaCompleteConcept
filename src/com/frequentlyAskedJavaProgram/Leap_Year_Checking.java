package com.frequentlyAskedJavaProgram;

import java.util.Scanner;

public class Leap_Year_Checking {
    public static void main(String[] args) {
        /*Leap year conditions:
        if (year is not exactly divisible by 4) then (it is a common year)
        else if (year is not exactly divisible by 100) then (it is a leap year)
        else if (year is not exactly divisible by 400) then (it is a common year)
        else (it is a leap year).*/

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year :");
        year = sc.nextInt();
        //sc.close();
        //boolean will return true if the statement is true or false

        boolean isLeapYear = false;
        if (year % 4== 0){
            if (year % 100==0){
                if (year % 400==0)
                    isLeapYear = true;
                else isLeapYear = false;
            }else isLeapYear =true;

        }else{
            isLeapYear = false;
        }
        if (isLeapYear==true)
            System.out.println("This is leap year :");
        else
            System.out.println("This is not a leap year");
    }
}
