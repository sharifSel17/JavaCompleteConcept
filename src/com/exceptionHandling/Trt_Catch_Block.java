package com.exceptionHandling;

public class Trt_Catch_Block {
    public static void main(String[] args) {
        int a;
        int b;
        try {
            a = 2;
            b = 20/a;
            System.out.println(b);
        }catch (ArithmeticException aa){
            //this block will execute only if any arithmetic exception occurs in this block
            System.out.println("you cannot divide a number by 0 ");
        }catch (Exception e){
            //this block would execute if there is any exception occur.
            System.out.println("i can handle any kind of exception");
        }
        //System.out.println("i am out of block");
    }
}
