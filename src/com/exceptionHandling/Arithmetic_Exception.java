package com.exceptionHandling;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        //until use try catch we will get an exception because we divided a number zero
        try {
            int num1=20, num2=0;
            int result = num1/num2;
            System.out.println("Output :"+result);
        }catch (ArithmeticException e){
            System.out.println("you should not divide a number by zero 0 ");
        }
    }
}
