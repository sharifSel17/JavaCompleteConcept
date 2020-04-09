package com.inputOutputJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy_File_To_Another_File {
    public static void main(String[] args) {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        try {
            //we have to specify both path location, the file is already exist and existing file copying to new file
            File fileIn = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\newFile.txt");// created reference for existing file
            File fileOut = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\newFileUpdate.txt");//created reference for new file

            fileInput = new FileInputStream(fileIn);//created reference for FileInputStream
            fileOutput = new FileOutputStream(fileOut);//created reference for FileOutputStream

            /*String content cannot be directly written into
             * a file. It needs to be converted into bytes
             */
            //byte Array is used to store byte data type values only. The default value of the elements in a byte array is 0
            byte[] arrList = new byte[1024];
            int arrLength;

            /*copying the contents from input stream to
             * output stream using read and write methods
             */
            while ((arrLength=fileInput.read(arrList))>0){
                fileOutput.write(arrList,0,arrLength);
            }
            //Closing the input/output file streams
            fileInput.close();
            fileOutput.close();
            System.out.println("File Copied Successfully");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
