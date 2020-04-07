package com.oppsConcept.inheritance;

public class Inheritance_Java_Teacher {
    //if we declare a class variable as private we can not access this variable from the outside of class,
    // but we can access private variable using public or protected getter and setter methods of supper class.
    private String designation = "Teacher";
    String instituteName = "ABC";
    int salary = 200000;
    //define getter method.
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String dg){
        this.designation = dg;
    }
}

class MathTeacher extends Inheritance_Java_Teacher{
        String mainSubject1 = "Math";
}
class PhysicsTeacher extends Inheritance_Java_Teacher{
    String mainSubject2 ="Physics";

    public static void main(String[] args) {

        MathTeacher ob = new MathTeacher();
        PhysicsTeacher ob2 = new PhysicsTeacher();
        //accessing getDesignation() through object
        System.out.println("Designation :"+ob.getDesignation());
        //accessing data through object
        System.out.println("Institute :"+ob.instituteName);
        System.out.println("Salary :"+ob.salary);
        System.out.println("Main Subject :"+ob.mainSubject1);

    }
}


