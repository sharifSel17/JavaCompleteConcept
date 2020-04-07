package com.oppsConcept.classObject;

public class Object_Example_Bus {
    //we gonna define states variable of a bus
    String color = "red";
    double weight =1000;
    String shape ="round";

    // we gonna define behaviors variable of a bus
    int speed = 120;
    String brakes ="Excellent";

    public static void main(String []args){
        Object_Example_Bus obj = new Object_Example_Bus();
        Object_Example_Bus obj2= new Object_Example_Bus();

        System.out.println("States has :"+obj.color);
        System.out.println("States has :"+obj.weight);
        System.out.println("States has :"+obj.shape);
        System.out.println("========================");
        System.out.println("behaviors is: "+obj2.speed);
        System.out.println("behaviors is: "+obj2.brakes);


    }

}
