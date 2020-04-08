package com.inputOutputJava;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read_File {
    public static void main(String[] args) {
        //Specify the path of the file here
        File file = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\newFile.txt");

        //BufferedInputStream class is used to read information from stream
        // declared variable as null
        BufferedInputStream bis = null; //declared variable as null
        //FileInputStream is a byte input stream class that provides method for reading bytes from a file.
        // declared variable as null
        FileInputStream fis = null;
        try {
            //FileInputStream to read the file
            fis = new FileInputStream(file);

            /*Passed the FileInputStream to BufferedInputStream
             *For Fast read using the buffer array.*/
            bis = new BufferedInputStream(fis);

            /*available() method of BufferedInputStream
             * returns 0 when there are no more bytes
             * present in the file to be read*/

            while (bis.available()>0){
                System.out.println((char)bis.read());
            }
        }catch (FileNotFoundException ex){
            System.out.println("the specified file not found :"+ex);
        }catch (Exception e){
            System.out.println("IO Exception :"+e);
        }finally {
            try {
                if (bis !=null && fis!=null){
                    fis.close();
                    bis.close();
                    System.out.println("File hasn't found any character's");
                }
            }catch (Exception eee){
                System.out.println("IO in file closing error :");
            }
        }
    }
}
