package com.oppsConcept.abstactionPacakge;

public interface Abstract_Method_In_Interface {
    public abstract int Multiply(int a, int b);
    int Sum(int a, int b, int c);

}
class Calculator implements Abstract_Method_In_Interface{
    public int Multiply(int n1, int n2){
        return n1*n2;
    }
    public int Sum(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public static void main(String[] args) {
        Abstract_Method_In_Interface ob1 = new Calculator();
        System.out.println(" Total :" +ob1.Multiply(10,20));
        System.out.println("Sum :" +ob1.Sum(1,2,3));
    }
}
