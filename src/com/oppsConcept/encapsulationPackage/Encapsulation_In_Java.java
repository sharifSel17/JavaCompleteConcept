package com.oppsConcept.encapsulationPackage;

public class Encapsulation_In_Java {
    //create a private variable instance so that we can not access from the outside of class
    private String userId ="abc";
    private int userPass =2000;

    //define getter methods
    public String getUserId(){
        return getUserId();
    }
    public int getUserPass(){
        return getUserPass();
    }
    //declared setter method
    public void setUserId(String ui){
        userId = ui;
    }
    public void setUserPass(int up){
        userPass = up;
    }

    public static void main(String[] args) {
        //crating object
        Encapsulation_In_Java ob = new Encapsulation_In_Java();
        //calling method data through the object
        //At some point if you want to change the implementation of a class, you can do it freely without affecting the class by encapsulation.
        ob.setUserId("Saafin");
        ob.setUserPass(102020);
        System.out.println("User Id :"+ob.userId);
        System.out.println("User Password :"+ob.userPass);
    }
}
