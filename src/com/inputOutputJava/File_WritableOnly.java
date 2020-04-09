package com.inputOutputJava;

import java.io.File;

public class File_WritableOnly {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\newFile.txt");
        //also we can write a file even though readonly mode by using bellow code
        file.setWritable(true);//To make a read only file to writable file, we can use setWritable() method
        if (file.canWrite()){
            System.out.println("File is writable ");
        }else{
            System.out.println("File is ReadOnly");
        }
    }
}
