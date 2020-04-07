package com.coreConcept.variableTypes;

public class Local_Variable {
    // instance variable
    public String myVar = "i love thinking";
    public void dis(){
        String myVar = "I love programing";
        System.out.println(myVar);
    }

    public static void main(String[] args) {
        Local_Variable ob  = new Local_Variable();
        //this reference call method variable
        ob.dis();
        //if i hadn't declared instance variable and only declared local variable inside the method,
        //then compiler would thrown an error, cuz we cannot change local variable from the outside of method
        System.out.println(ob.myVar);
    }
}
