package com.exceptionHandling;

public class User_Defined_Exception02 extends Exception{
    //constructor
    User_Defined_Exception02(String st){
        //call constructor of parent exception
        super(st);
    }
}
class Example02{
    public void weightRestriction(int weight)throws User_Defined_Exception02{
        if (weight<50){
           throw new User_Defined_Exception02("Result :"+"Invalid Weight");
        }
    }
    public static void main(String[] args) {
        try {
            Example02 ob = new Example02();
            ob.weightRestriction(20);
        }catch (User_Defined_Exception02 e){
            System.out.println("caught th exception");
            System.out.println(e.getMessage());
        }

    }
}
