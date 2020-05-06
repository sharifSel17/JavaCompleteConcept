package com.frequentlyAskedJavaProgram;

import java.util.HashSet;

public class FindDuplicateValueInArray {
    public static void main(String[] args) {
        String arr[] = {"Java","PHP","Java"};
        HashSet <String>val = new HashSet();

        boolean flag = false;
        for (String l:arr){
            if (val.add(l)==false){
                System.out.println("found duplicate value :"+l);
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("duplicate values not found :");
        }

    }
}

