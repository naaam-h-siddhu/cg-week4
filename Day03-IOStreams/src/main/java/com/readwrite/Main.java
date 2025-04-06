package com.readwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/read.txt";
        String outputFilePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/write.txt";

        try(FileInputStream fis = new FileInputStream(inputFilePath);
            FileOutputStream fos = new FileOutputStream(outputFilePath)){
            int byteData;
            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
