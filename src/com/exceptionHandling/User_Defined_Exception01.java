package com.exceptionHandling;

//when we define our own custom exception we should extends Exception class, which is default java class
public class User_Defined_Exception01 extends Exception{
    //instance variable
    String st1;
    //here I am copying the message that we are passing while
    //throwing the exception to a string and then displaying
    //that string along with the message.
    User_Defined_Exception01(String st2){
        st1 = st2;
    }
    public String toString(){
        return ("My Exception Occurred"+st1);
    }
}
class Example01{
    public static void main(String[] args) {
        try {
           throw new User_Defined_Exception01("this is my error message");
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
