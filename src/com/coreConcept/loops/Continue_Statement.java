package com.coreConcept.loops;

public class Continue_Statement {

    public static void main(String[] args) {
        //continue statement with for loop
        //this is particularly useful when you want to skipping current execution of statement inside loop's body for the current iteration
        for (int i=0;i<=5;i++){
            System.out.println("value is :"+i);

            //continue statement is used for skipping current execution of statement
            if (i==4){
                continue;
            }
            System.out.println(i+" ");
        }
        //continue statement with while loop
        int j = 10;
        while (j>5){
            if (j==7) {
                j--;
                continue;
            }
            System.out.println("value is :" + j);
            j--;
        }
        //continue statement for do-while loop
        int k =0;
        do {
            if (k==3){
                k++;
                continue;
            }
            System.out.println("value is :"+k);
            k++;
        }while (k<10);
    }
}
