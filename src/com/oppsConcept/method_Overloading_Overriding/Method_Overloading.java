package com.oppsConcept.method_Overloading_Overriding;

public class Method_Overloading {
    //three ways to overload a method
    //1. Number of parameters and the arguments list must be different
    public void display(int a){
        System.out.println("Number :"+a);
    }
    public void display(int a, int b){
        System.out.println("Numbers :"+a+" "+b);
    }
    public void display(int a, int b, int c){
        System.out.println("Number :"+a+" "+b+" "+c);
    }
    //2. data type of parameters, we can defined argument list same but data type must be different
    public void display( int aa, String bb){
        System.out.println(aa+" "+bb);
    }
    public void display(double aaa, int bbb, char ccc ){
        System.out.println(aaa+" "+bbb+" "+ccc);
    }
    //3. sequence of data type parameters is similar to data type of parameter

    public static void main(String[] args) {
        Method_Overloading mm = new Method_Overloading();
        System.out.println("==========Number of Parameters================");
        mm.display(1);
        mm.display(1,2);
        mm.display(1,2,3);
        System.out.println("==========Data Type Parameters================");
        mm.display(10,"AA");
        mm.display(20.50,100,'C');
        System.out.println();
    }
}
