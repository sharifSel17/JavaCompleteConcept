package com.oppsConcept.superKeyword;

public class Super_Keyword_No_Argument_Constructor_java {
    //using super keyword to invokes constructor of parent class.
    Super_Keyword_No_Argument_Constructor_java(){
        System.out.println("I am executed from the parent class");
    }

}
class Demo4 extends Super_Keyword_No_Argument_Constructor_java{
    //when we create an object for child class, the new keyword invokes of constructor of child class,
    // and implicitly invokes the constructor of parent class, so the order to execute when we create an object of child class,
    //parent class constructor executed first and than child class constructor executed,
    // its happen because compiler itself adds super() as the first statement of child class.
    //so we dont have to define [super keyword]
    Demo4()
    {
        System.out.println("I am executed from the child class");
    }

    public static void main(String[] args) {
        Demo4 ob = new Demo4();

    }
}