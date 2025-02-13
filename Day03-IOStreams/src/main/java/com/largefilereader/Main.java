package com.largefilereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/large.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line;
            while((line = bufferedReader.readLine())!= null){
                String text = line;
                text.toLowerCase();
                if(text.contains("error")){
                    System.out.println(text);
                }
//                System.out.println(text);
            }
        }catch(IOException e){
            System.out.println("Issue in code");
        }
    }
}

