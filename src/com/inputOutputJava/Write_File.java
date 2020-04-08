package com.inputOutputJava;

import java.io.File;
import java.io.FileOutputStream;

public class Write_File {
    public static void main(String[] args) {
        //FileOutputStream is an output stream for writing data to a File,
        // FileOutputStream is used for writing streams of raw bytes such as image data,
        //It's good to use with bytes of data that can't be represented as text such as PDF, excel documents, image files
        FileOutputStream fos = null;
        File file; //initialized vale for File

        String myContent = "This is my first script to write text through FileOutputStream class abcdefgh";
        try {
            //specify the file path
            file = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\MyText02.txt");
            fos = new FileOutputStream(file);

            /* This logic will check whether the file
             * exists or not. If the file is not found
             * at the specified location it would create
             * a new file*/
            if (!file.exists()){
                file.createNewFile();
            }else {
                System.out.println("File already Exist");
            }
            /*String content cannot be directly written into
             * a file. It needs to be converted into bytes
             */
            //byte Array is used to store byte data type values only. The default value of the elements in a byte array is 0
            byte[]arrList = myContent.getBytes();//The getBytes() method encodes a given String into a sequence of bytes and returns an array of bytes.
            fos.write(arrList);//to write
            fos.flush();//used to flush the stream. By flushing the stream, it means to clear the stream of any element that may be or maybe not inside the stream,
            System.out.println("File has been written successfully ");
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                if(fos!=null){
                    fos.close();
                }
            }catch (Exception eee){
                System.out.println("Error closing");
            }
        }



    }
}
