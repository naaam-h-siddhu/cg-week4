package com.filestream.lowertouppercase;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/read.txt";
        String outFilePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/write.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFilePath))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line.toLowerCase());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
