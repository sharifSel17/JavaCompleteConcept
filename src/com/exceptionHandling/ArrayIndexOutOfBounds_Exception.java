package com.exceptionHandling;

public class ArrayIndexOutOfBounds_Exception {
    public static void main(String[] args) {
        //until use try catch we will get an exception because we we are trying to get a index number which doesn't exit in the array list
        try {
            int a[] = new int[5];
            a[6] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
