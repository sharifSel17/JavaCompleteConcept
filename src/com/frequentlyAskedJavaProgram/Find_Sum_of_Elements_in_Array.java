package com.frequentlyAskedJavaProgram;

public class Find_Sum_of_Elements_in_Array {
    public static void main(String[] args) {
        int a[] = {10,20,30};

        int sum = 0;
        for (int i = 0; i<=a.length-1;i++){
            sum = sum+a[i];
        }
        System.out.println(" Sum of numbers :" +sum);
    }
}
