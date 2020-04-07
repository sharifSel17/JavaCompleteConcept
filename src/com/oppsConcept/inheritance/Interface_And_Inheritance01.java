package com.oppsConcept.inheritance;
//we can define variable as public static and final
//interface variable muse be initialized at the time declaration of interface otherwise compiler will throw exception
interface Interface_And_Inheritance01 {
    public void method01();
}
 interface Interface_And_Inheritance02 extends Interface_And_Inheritance01{
    public void method0d2();

}
//inside implementation a class, we can not change a variable declared in interface because by default public, static and final
interface Interface_Inheritance03{
    int z = 20;
    public int method03();
}
class Demo implements Interface_And_Inheritance02  {
    //While providing implementations in class all methods must be declared as public
    public void method0d2(){
        System.out.println("m2");
    }
    public void method01(){
        System.out.println("m2");
    }
     int method03(int z){
        return z;
    }
    public static void main(String[] args) {
        Interface_And_Inheritance02 ob = new Demo();
        //Interface_Inheritance03 ob2 = new Demo();
        ob.method0d2();
        ob.method01();

    }
}




