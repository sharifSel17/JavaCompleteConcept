package com.exceptionHandling;

public class Nested_Ty_Catch_Block {
    public static void main(String[] args) {
        try {
            int num = 123/0;
        }catch (ArithmeticException e){
            System.out.println("number should not divide by zero");
        }
        //finally block will always execute even if there is no exception
        finally {
            System.out.println("I am finally block");
        }
    }
}
