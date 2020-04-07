package com.oppsConcept.classObject;

public class Object_Reference {
    //just clarify differences between reference and object
}
class Demo extends Object_Reference{

    public static void main(String[] args) {
        //when we creat an object of a class using new keyword,
        // that object assign a reference which is indicates a address where an object variable and methods are stored
        //[ob] is a reference variable of Object_Reference().


        //reference ob is Object_Reference type and object is also Object_Reference type
        Object_Reference ob = new Object_Reference();

        //reference ob1 is Object_Reference type and object is Demo type
        Object_Reference ob2 = new Demo();

    }
    }


