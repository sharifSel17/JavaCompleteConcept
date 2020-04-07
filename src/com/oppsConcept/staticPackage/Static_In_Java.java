package com.oppsConcept.staticPackage;

public class Static_In_Java {
    //declared a variable static
    static String carName = "BMW";

    //single static block
    //initialized static variable
    static int carPrice;
    static {
        carPrice = 200000;
    }

    //multiple block
    //values initialized by first block are overwritten by second block.
    static String carModel;
    static int madeYear;
    static {
        carModel = "MM";
        madeYear = 2019;
    }
    static {
        carModel = "YY";
        madeYear = 2020;
    }

    //Static variables can be accessed directly in Static method

    static void staticMethod(){
        System.out.println("===car model===="+carModel);
    }
    public static void main(String[] args) {
        //calling variable carName
        System.out.println("Brand Name :"+carName);
        //calling single static block variable
        System.out.println("Car Price :"+"$"+carPrice);
        //calling multiple block
        System.out.println("Model :"+carModel);
        System.out.println("Made Year :"+madeYear);
        //calling static method
        staticMethod();
        NestedClass ob = new NestedClass();
        ob.dis();
    }
    //nested static class
    static int val = 100;

    static class NestedClass{

        public void dis(){
            System.out.println("Value :"+val);
        }
    }
}
