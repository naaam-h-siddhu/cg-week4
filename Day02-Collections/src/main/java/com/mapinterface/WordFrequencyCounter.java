package com.mapinterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WordFrequencyCounter {
    public static final String  filePath= "/Users/siddhu/Desktop/cg-tut/Week4/Day02-Collections/src/main/resources" +
            "/alice29.txt";
    public static String fileReaderFunc(){
        StringBuilder str = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String line;
                while ((line = reader.readLine()) != null) {
                    str.append(line);
                }


            }catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static HashMap<String,Integer> counter(String[] words){

        HashMap<String,Integer> mp = new HashMap<>();
        for(String string: words){
            if(string == " ") continue;
            if(mp.containsKey(string)){

                mp.put(string,mp.get(string)+1);
            }
            else{
                mp.put(string,1);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
        String txt = fileReaderFunc();
        String[] words = txt.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ");
        HashMap<String,Integer> frequencies = counter(words);
        for(String key: frequencies.keySet()){
            System.out.println(key+" : "+frequencies.get(key));
        }

    }
}
