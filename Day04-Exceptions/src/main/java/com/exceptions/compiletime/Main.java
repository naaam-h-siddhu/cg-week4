package com.exceptions.compiletime;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void readFile(String filePath){
        try(FileReader fileReader= new FileReader(filePath)){
            int line = fileReader.read();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        String filePath = "data.txt";
        readFile(filePath);
    }
}
