package com.coreConcept.variableTypes;

public class Static_Variable {
    static String myVar = "I am static variable";

    public static void main(String[] args) {
        //create an object for class
        //if i create three objects, than myVar would be common for all the object
        //created two object for clarify
        Static_Variable ob = new Static_Variable();
        Static_Variable ob2 = new Static_Variable();

        //call static variable through the object
        System.out.println("I am from class :"+ob.myVar);
        System.out.println("I am from class :"+ob2.myVar);

        System.out.println("========================");
        //if i change any object value then second time both object would call modified object value

        ob2.myVar = "I am modified value from by ob2";

        System.out.println("Modified :"+ob.myVar);
        System.out.println("Modified :"+ob2.myVar);
    }
}
