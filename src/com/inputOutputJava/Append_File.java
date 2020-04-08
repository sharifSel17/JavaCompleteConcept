package com.inputOutputJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Append_File {
    public static void main(String[] args) {
        //Append. In general, to append is to join or add on to the end of something. For example,
        // an appendix is a section appended (added to the end) of a document.
        try {
            String content = "This is my content which would be appended " +
                    "at the end of the specified file, update";
            File file = new File("C:\\Users\\sharif.ny\\IdeaProjects\\JavaCompleteConcept\\src\\MyText02.txt");
            /* This logic is to create the file if the
             * file is not already present
             */
            if (!file.exists()){
                file.createNewFile();
            }
            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file,true);//FileWriter class is used to write character-oriented data to a file

            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);//BufferedWriter class writes text to character output stream
            bw.write(content);
            bw.close();

            System.out.println("data has been appended successfully ");
        }catch (Exception ex){
            System.out.println("Exception Occurred ");
            ex.printStackTrace();
        }
    }
}
