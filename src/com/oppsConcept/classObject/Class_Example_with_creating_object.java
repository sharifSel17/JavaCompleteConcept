package com.oppsConcept.classObject;

public class Class_Example_with_creating_object {
    //fields or instance variable
    String device;
    int price;

    // we are going to use constructor cuz we dont want return anything
    //always construction name would be as a class name
    Class_Example_with_creating_object(String d, int p){
        //parameterized constructor
        //this keyword uses for creating a references
        this.device = d;
        this.price = p;
    }

    public static void main(String[] args) {
        //creating object
        //the syntax to create an object of a class is to be class name and new keyword uses to create an object then again class etc
        Class_Example_with_creating_object obj = new Class_Example_with_creating_object("Mac",1200);
        //accessing object data through reference
//        System.out.println(" Device Name:"+obj.device+" Prices :"+obj.price);
    }
}
