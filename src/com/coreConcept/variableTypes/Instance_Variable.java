package com.coreConcept.variableTypes;

public class Instance_Variable {
    //instance variable
    String val = "I am instance variable";

    public static void main(String[] args) {

        //create an object
        Instance_Variable ob = new Instance_Variable();
        Instance_Variable ob2 = new Instance_Variable();
        Instance_Variable ob3 = new Instance_Variable();
        Instance_Variable ob4 = new Instance_Variable();

        //calling instance variable through the object
        //each object would called instance variable [val] cuz each object has it's own copy
        System.out.println("Object 01 :"+ob.val);
        System.out.println("Object 02 :"+ob2.val);
        System.out.println("Object 03 :"+ob3.val);
        System.out.println("Object 04 :"+ob4.val);

        //if we change ob2 value, what would be the next ob2 value
        ob2.val = "I am modified instance variable";
        System.out.println("==================================");
        //each object would call first instance variable except ob2 value
        System.out.println("Object 01 :"+ob.val);
        System.out.println("Object 02 :"+ob2.val);
        System.out.println("Object 03 :"+ob3.val);
        System.out.println("Object 04 :"+ob4.val);


    }
}
