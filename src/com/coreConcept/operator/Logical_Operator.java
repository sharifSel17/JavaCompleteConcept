package com.coreConcept.operator;

public class Logical_Operator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 would false if b1 && b2 :"+(b1&&b2));
        System.out.println("b1 would true if b1 || b2 :"+(b1 || b2));
        System.out.println("b1 would true if !(b1 && b2) :"+!(b1 && b2));
    }
}
