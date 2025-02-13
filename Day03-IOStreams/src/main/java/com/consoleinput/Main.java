package com.consoleinput;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String outputFilePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/write.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))){

            String input;
            System.out.println("Enter the name age and programming language seperated by space. And type \"done\" to " +
                    "stop");

            while(!(input = bufferedReader.readLine()).equalsIgnoreCase("done")){
                bufferedWriter.write(input);
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
