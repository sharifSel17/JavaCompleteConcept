package com.arrayConcept;

public class ArrayBasic {
    //declaring an array which holds elements of integer type
    //this statement creates an array reference on the stack
    int arr1[];
    //different way of declaring array, both statement is valid
    int arr2[];
    int []arr3;

    //bellow statement will give compilation error, until it is instantiated to an array object
    int arr4[] = new int[6];
    //The above statement creates an array of size 6 on the heap

    public static void main(String[] args) {
        int arr5[] = {2,3,4,5,6};
        //the above statement declare, constructs and instantiated
        for (int i=0;i<arr5.length;i++){
            System.out.println("value is :"+arr5[i]);
        }
    }




}
