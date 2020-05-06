package com.frequentlyAskedJavaProgram;

public class Swipe_Two_Number {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;

        System.out.println("before swipe : " +a+ " " +b);

        //logic 01
        int t = a;
        a=b;
        b=t;

        System.out.println("after swipe :"+ a +" "+b);
    }


}
