package com.exceptionHandling;

public class Multiple_Try_Catch_Block {
    public static void main(String[] args) {
       try {
           //first block got executed cuz we divided a number by zero, that's why we got arithmetic exception
           /*int arr[] = new int[5];
           arr[3] = 30/0;*/
           //second block got executed the code throw ArrayIndexOutOfBoundsException,
           //we are trying to access 6th number element of array but we provided the size is 10th
           int arr[] = new int[5];
           arr[6] = 6/4;
       }catch (ArithmeticException a){
           System.out.println("you can not divide a number by zero");

       }catch (ArrayIndexOutOfBoundsException aa){
           System.out.println("Accessing array elements outside of the limit :");
       }
       //but if an exception occurs in above code which is not Arithmetic and ArrayIndexOutOfBounds,
       // then the last generic catch handler would execute.
       //also if we placed generic exception in the first catch block than we will get an error message,
       //because none of the catch blocks placed after this block is reachable.
       // You should always place this block at the end of all other specific exception catch blocks.
       catch (Exception e){
           System.out.println("I am can handle all exception :");
       }
        System.out.println("I am out of try block :");
    }
}
