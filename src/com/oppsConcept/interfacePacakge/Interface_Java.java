package com.oppsConcept.interfacePacakge;
    //In Interface all the methods are public abstract by  default
    //An interface can not implements another interface but an interface can extends more then one interface
public interface Interface_Java {

    public abstract int method01(int z);
    public void method02();

}
class Test implements Interface_Java{
    public int method01(int z){
        System.out.println(z);
        return z;
    }
    public void method02(){
        System.out.println("method 02");
    }

    public static void main(String[] args) {
        Interface_Java OB = new Test();
        OB.method01(10);
        OB.method02();
    }
}

