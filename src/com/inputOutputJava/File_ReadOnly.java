package com.inputOutputJava;

//integrated development environment (IDE) for developing applications,
// using the Java programming language and other programming languages such as C/C++, Python, PERL, Ruby etc

import java.io.File;

public class File_ReadOnly {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\newFile.txt");

        //we can use setReadOnly() method of File class
        //It returns a boolean value which we can further use to verify whether the operation got successful or not,
        boolean readOnly = file.setReadOnly();
        if (readOnly==true){
            System.out.println("File is on ReadOnly mode");
        }else {
            System.out.println("Unsuccessful Operation");
        }

    }
}
