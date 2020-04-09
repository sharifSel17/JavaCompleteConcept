package com.inputOutputJava;

import java.io.File;

public class Delete_File {
    public static void main(String[] args) {
        try{
            //Specify the file name and path
            File file = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\MyText02.txt");

            /*the delete() method returns true if the file is
             * deleted successfully else it returns false
             */
            if (file.delete()){
                System.out.println(file.getName()+"file is deleted successfully");
            }else {
                System.out.println("delete failed");
            }
        }catch (Exception ex){
            System.out.println("Exception Occurred");
            ex.printStackTrace();
        }



    }
}
