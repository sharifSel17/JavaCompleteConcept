package com.arrayConcept;

public class Array_MultiDimension_Without_Loop {
    public static void main(String[] args) {
        //declare and syntax a multi-dimension array
        //row and column

        //we can initializing an array in many way
        //method01
        //int arr[][] = { {}, {} };
        //two dimensional array using method 01
        int a[][] = {{0,1,2},{3,4,5},{6,7,8}};
        //without loop we can access 2-dimensional array using both index or just one
        System.out.println("Row :"+a[0][0]+" "+a[1][0]+" "+a[2][0]);
        System.out.println("Row :"+a[0][1]+" "+a[1][1]+" "+a[2][1]);
        System.out.println("Row :"+a[0][2]+" "+a[1][2]+" "+a[2][2]);

        System.out.println("==============");

        String aa[][] = {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
        //without loop we can access 2-dimensional array using both index or just one
        System.out.println("Row :"+aa[0][0]+" "+aa[1][0]+" "+aa[2][0]);
        System.out.println("Row :"+aa[0][1]+" "+aa[1][1]+" "+aa[2][1]);
        System.out.println("Row :"+aa[0][2]+" "+aa[1][2]+" "+aa[2][2]);






        //method 02
        int arr1[][] = new int[2][];//you must specify first dimension
        //OR
        String[][] st = new String[3][4];//or specify both dimension




    }
}
