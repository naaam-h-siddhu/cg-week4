package com.exception.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "text.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("Error Reading File");
        }
    }
}
