package com.wordfrequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/sample.txt";

        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z]", " ").toLowerCase();
                String[] strings = line.split(" ");
                for (String string : strings) {
                    if (string.equals("")) continue;
                    map.put(string, map.getOrDefault(string, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        final int[] i = {0};
        sortedMap.forEach((key, value) -> {
            if (i[0] < 5) {
                System.out.println(key + " : " + value);
                i[0]++;
            }
        });
    }
}