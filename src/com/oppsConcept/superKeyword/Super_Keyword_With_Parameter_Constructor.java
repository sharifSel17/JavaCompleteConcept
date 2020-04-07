package com.oppsConcept.superKeyword;

public class Super_Keyword_With_Parameter_Constructor {
    //using super keyword to invokes constructor of parent class.
    Super_Keyword_With_Parameter_Constructor(){
        System.out.println("I am executed from the parent class with no argument");
    }
    Super_Keyword_With_Parameter_Constructor(String st){
        System.out.println("I am executed from the parent class with argument");
    }
}
class Demo5 extends Super_Keyword_With_Parameter_Constructor{

    Demo5()
    {
        //super() in parameterized must be first statement in constructor otherwise compiler will throw exception
        //when we explicitly placed super in constructor, in java didnt call default constructor which means with no arg
        super("love programing");
        System.out.println("I am executed from the child class ");
    }
    public static void main(String[] args) {
        Demo5 ob = new Demo5();
    }
}
