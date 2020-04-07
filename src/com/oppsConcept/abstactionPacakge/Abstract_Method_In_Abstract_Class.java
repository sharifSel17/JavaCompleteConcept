package com.oppsConcept.abstactionPacakge;

//created an abstract class
//There can be some scenarios where it is difficult to implement all the methods in the base class.
// In such scenarios one can define the base class as an abstract class
// which signifies that this base class is a special kind of class which is not complete on its own.
  abstract class  Abstract_Class_Method {
      //created an abstract method
     public abstract void AnimalSound();
     //we can define a regular method
     public void demo(){
         System.out.println("test");
     }
}
//Abstract class cannot be instantiated which means you cannot create the object of abstract class.
// To use this class, you need to create another class that extends this abstract class provides the implementation of abstract methods,
// then you can use the object of that child class to call non-abstract parent class methods as well as implemented methods
 class Dog extends Abstract_Class_Method{

     //If a child does not implement all the abstract methods of parent class(the abstract class),
     // then the child class must need to be declared abstract.
     public void AnimalSound(){
        System.out.println("Dogs sound is : "+"Woof");
     }

     public static void main(String[] args) {
         Abstract_Class_Method ob1 = new Dog();
         Abstract_Class_Method ob2 = new Lion();
         ob1.AnimalSound();
         ob2.AnimalSound();
         ob1.demo();
     }
 }
//Abstract class cannot be instantiated which means you cannot create the object of abstract class.
// To use this class, you need to create another class that extends this abstract class provides the implementation of abstract methods,
// then you can use the object of that child class to call non-abstract parent class methods as well as implemented methods
 class Lion extends Abstract_Class_Method {
    //If a child does not implement all the abstract methods of parent class(the abstract class),
    // then the child class must need to be declared abstract.
      public void AnimalSound(){
          System.out.println("Lion sound is : "+"Roar");
      }
 }

