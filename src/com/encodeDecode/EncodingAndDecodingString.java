package com.encodeDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecodingString {

    public static void main(String[] args) {
        String password = "admin123";
        //Base64 class provide encodeBase64() which is convert string into encode and we need to format into byte that's why we took byte class
        byte[] encodePassword = Base64.encodeBase64(password.getBytes());
        System.out.println(new String(encodePassword));//currently this is byte format but we need to convert into string

        byte[] decodePass = Base64.decodeBase64(encodePassword);
        System.out.println(new String(decodePass));



    }

}
