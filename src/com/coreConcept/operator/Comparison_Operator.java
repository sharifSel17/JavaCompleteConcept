package com.coreConcept.operator;

public class Comparison_Operator {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        if (a==b){
            System.out.println("a==b :"+"a and b are equal");
        }else {
            System.out.println("a==b :"+"a and b are not equal");
        }
        if (a!=b){
            System.out.println("a!=b :"+"a and b are not equal");
        }else{
            System.out.println("a!=b :"+"a and b are equal");
        }if (a>b){
            System.out.println("a>b :"+"a is greater than b");
        }else{
            System.out.println("a>b "+"a is not greater than b");
        }if(a>=b){
            System.out.println("a>=b :"+"a is not greater then or equal");
        }else {
            System.out.println("a>=b :"+"a is less then b");
        }
        if (a<b){
            System.out.println("a<b :"+"a is less than b");
        }else{
            System.out.println("a<b :"+"a is not less than b");
        }if(a<=b){
            System.out.println("a<=b :"+"a is less then or equal");
        }else{
            System.out.println("a<=b :"+"a is less then b");
        }
    }

}
