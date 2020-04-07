package com.coreConcept.operator;

public class Ternary_Operator {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 10;

        //num1 is not equal to 10 that's why the second value after the colon is assigned to the num 1
        num2 = (num1==10) ? 100:200;
        System.out.println("num2 :"+num2);

        //num1 is equals to 20 that's why the first value is assigned to the variable num2
        num2 = (num1 ==20) ? 100:200;
        System.out.println("num2 :"+num2);
    }
}
