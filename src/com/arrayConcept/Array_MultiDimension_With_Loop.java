package com.arrayConcept;

public class Array_MultiDimension_With_Loop {
    public static void main(String[] args) {

        //method01
        //int arList[][] = {{1,2,3},{4,5,6},{4,5,6},{4,5,6},{4,5,6}};

        //method02
        int[][] arList = new int[4][4];
        for (int row = 0; row < arList.length; row++) {
            for (int col = 0; col < arList[row].length; col++) {
                arList[row][col] = row + col;
                System.out.print(arList[row][col] + " ");//print method is implemented as it prints the text on the console
            }
            System.out.println();//While println adds new line after print text on console
        }
    }
}

