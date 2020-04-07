package com.inputOutputJava;

import java.io.File;

public class Create_File_Demo {

    //using createNewFile() method. This method creates an empty file, if the file doesn’t exist at the specified location and returns true,
    // If the file is already present then this method returns false. It throws:
    public static void main(String[] args) {
        try { //we used try catch to handle exception cuz if a file exist in the location then compiler throw an exception
            File file = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\newFile.txt");//This class is used for creation of files and directories, file searching, file deletion, etc.
            /*If file gets created then the createNewFile()
             * method would return true or if the file is
             * already present it would return false
             */
            boolean fileCreate = file.createNewFile();
            //boolean will check either file exist or not,
            // The createNewFile() function is a part of File class in Java
            if (fileCreate){
                System.out.println("File has been created");
            }else {
                System.out.println("File already exist in this location");
            }
        }catch (Exception e){
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }
    }
}
