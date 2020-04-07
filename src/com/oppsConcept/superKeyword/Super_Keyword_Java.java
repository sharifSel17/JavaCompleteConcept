package com.oppsConcept.superKeyword;

public class Super_Keyword_Java {
    //using super keyword to access data members [variable] of parent class from child class
    int num = 20;
    public void dis(){
        System.out.println("I am a member of parent class"+num);
    }
}
class Demo3 extends Super_Keyword_Java{

    int num = 200;
    public void dis(){
        //System.out.println("I am a member of child class : "+num);
        //let's to do that and syntax is super.variable name which we declared in both class
        System.out.println("I am calling by [super keyword] : from parent class "+super.num);
    }

    public static void main(String[] args) {
        //the same variable num is already declared in the subclass
        //which is already present in the parent class
        //creating object for child class
        //even though we extended parent class but we cannot access member of parent class without [super keyword] from child class
        Demo3 ob = new Demo3();
        //let's to do that and syntax is [super.variable] name which we declared in both class
        ob.dis();


    }

}
