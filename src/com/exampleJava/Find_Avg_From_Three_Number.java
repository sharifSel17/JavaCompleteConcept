package com.exampleJava;

import java.util.Scanner;

public class Find_Avg_From_Three_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        //taking double because of user can enter int, float, long and double
        double num1 = sc.nextDouble();
        System.out.println("Enter Your Number :");
        //taking double because of user can enter int, float, long and double
        double num2 = sc.nextDouble();
        System.out.println("Enter Your Number :");
        //taking double because of user can enter int, float, long and double
        double num3 = sc.nextDouble();

        sc.close();
        System.out.println("average three number is :"+avg(num1,num2,num3));
    }
    public static double avg(double a, double b, double c){
        return (a+b+c)/3;
    }
}
