package com.exceptionHandling;

public class Number_Format_Exception {
    public static void main(String[] args) {
        //until use try catch we will get an exception because we are trying to parse a string into integer

       try {
           int num = Integer.parseInt("abc");
           System.out.println(num);
       }catch (NumberFormatException e) {
           System.out.println("we cannot parse String into integer");
       }
    }
}
