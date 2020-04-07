package com.oppsConcept.polymorphism;

public class Polymorphism_Method_Overridden {
    public void myMethod(){
        System.out.println("I am executed from parent class");
    }
}
class Demo extends Polymorphism_Method_Overridden{
    public void myMethod(){
        System.out.println("I am executed from child class");
    }

    public static void main(String[] args) {
        //this would call myMethod() of child class
        Polymorphism_Method_Overridden ob = new Demo();
        ob.myMethod();
    }
}
