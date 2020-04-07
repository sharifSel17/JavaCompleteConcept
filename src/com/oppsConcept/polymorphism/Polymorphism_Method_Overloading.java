package com.oppsConcept.polymorphism;

public class Polymorphism_Method_Overloading {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymorphism_Method_Overloading ob = new Polymorphism_Method_Overloading();
        //method would be called is determined by the parameter list compile time.
        //that's why the reason is called compiler time polymorphism
        System.out.println("Total :"+ob.add(+10,20));
        System.out.println("Total :"+ob.add(10,20,30));
    }
}

