package com.oppsConcept.constructorPackage;

public class Constructor_object_with_this_keyword {

    String model;
    String brand;
    //creating a constructor with no arguments;
    //default constructor
    Constructor_object_with_this_keyword(){
        //this keyword is used to refer current object which is ob1;
        this.model = "iPhone11Pro";
    }
    //parameterized constructor
    Constructor_object_with_this_keyword(String model,String brand){
        this.model=model;
        this.brand=brand;
    }

    public static void main(String[] args) {
        //creating an object for no arguments
        Constructor_object_with_this_keyword ob1 = new Constructor_object_with_this_keyword();
        System.out.println("Phone Name :"+ob1.model);

        //creating an object for parameterized constructor
        Constructor_object_with_this_keyword ob2 = new Constructor_object_with_this_keyword("CoreI7","HP");
        System.out.println("Brand :"+ob2.brand+" Model:"+ob2.model);
    }
}
