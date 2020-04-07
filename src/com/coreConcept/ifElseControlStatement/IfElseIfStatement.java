package com.coreConcept.ifElseControlStatement;

public class IfElseIfStatement {
    public static void main(String[] args) {

        int num = 1245;
        //in if-else-if statement, as soon as condition is met the corresponding sets of statement would executed and rest gets ignored
        if(num<100 && num>=1){
            System.out.println("it's a two digit numbers");
        }else if (num<1000 && num>=100){
            System.out.println("it's a  three digit numbers");
        }else if (num<10000 && num>=1000){
            System.out.println("it's a four digit numbers");
        }else {
            //if none of the condition is met then the statement inside 'else' get executed
            System.out.println("none of is correct");
        }
    }
}
