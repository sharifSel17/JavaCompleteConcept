package com.oppsConcept.superKeyword;

public class Super_Method_Overriding {
    //when a child class override a method of parent class,
    // then child class object can call the method from child class version method.
    //but using super() like [super.method_name] we can call a method of parent class
    //override method
    //
    public void dis(){
        System.out.println("I am executed from parent class");
    }

}
class Demo6 extends Super_Method_Overriding{
    //when child class does not override a method of parent class, we dont need to use super()
    //override method
    public void dis(){
        System.out.println("I am executed from child class");
    }
    public void printMs(){
        //this will call overriding method
        dis();
        //this would also call overriding method
        super.dis();
    }

    public static void main(String[] args) {
        Demo6 ob = new Demo6();
        ob.printMs();
    }
}