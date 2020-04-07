package com.oppsConcept.method_Overloading_Overriding;

public class Method_Overriding {
    //method overriding
    public void dis(){
        System.out.println("I am from parent class");
    }
}
class Demo2 extends Method_Overriding{
    public void dis(){
        System.out.println("I am from child class");
    }

    public static void main(String[] args) {
        //when parent class reference refers to the parent class in this case overridden method is called
        Method_Overriding ob1 = new Method_Overriding();
        ob1.dis();
        //when parent class reference refer to the child class than child class overridden method is called
        Method_Overriding ob2 = new Demo2();
        ob2.dis();
    }
}
