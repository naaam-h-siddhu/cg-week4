package com.bufferedstream;

import java.io.*;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        String inputFilePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/large.txt";
        String outputFilePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/largeOutput.txt";
        long startTime = System.nanoTime();

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputFilePath));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFilePath))){
            byte[] buffer = new byte[4096];
            int data;
            while((data = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(data);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        long endTime = System.nanoTime();
        long bufferedStreamTime = endTime-startTime;
        startTime = System.nanoTime();
        try(FileInputStream fileInputStream = new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)){
            int data;
            while((data = fileInputStream.read())!=-1){
                fileOutputStream.write(data);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        endTime = System.nanoTime();

        System.out.println("Buffered File writer took "+ TimeUnit.NANOSECONDS.toMillis(bufferedStreamTime));
        System.out.println("File Input Stream writer took "+ TimeUnit.NANOSECONDS.toMillis(endTime-startTime));





    }
}
