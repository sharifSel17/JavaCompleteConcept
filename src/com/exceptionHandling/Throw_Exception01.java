package com.exceptionHandling;
import java.io.IOException;

public class Throw_Exception01 {
    //if i didn't declare throw keyword then will get a compiler error
        public void method01(int var1)throws IOException,ClassNotFoundException {
            if (var1 == 1){
                throw new IOException("IOException");
            }else {
                throw new ClassNotFoundException("Class not found");
            }
        }
}
class Throw_Exception02{
    public static void main(String[] args) {
        try {
            Throw_Exception01 ob = new Throw_Exception01();
            ob.method01(1);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
