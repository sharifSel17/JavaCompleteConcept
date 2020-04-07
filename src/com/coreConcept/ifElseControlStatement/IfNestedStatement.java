package com.coreConcept.ifElseControlStatement;

public class IfNestedStatement {
    public static void main(String[] args) {
        int val = 20;
        //first statement will be executed if the first condition is true
        if (val<=30){
            System.out.println("value is less then 30");
        }
        //if first and second statement is true then the second statement will be executed otherwise not
        if (val>15){
            System.out.println("value is greater then 15");
        }
    }
}
