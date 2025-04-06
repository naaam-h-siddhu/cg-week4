package com.mapinterface;

import java.util.*;

public class HighestValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);
        List<Map.Entry<String ,Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String,Integer> sortedMap =new TreeMap<>();
        for(Map.Entry<String,Integer> it: entryList){
            sortedMap.put(it.getKey(),it.getValue());

        }
        System.out.println("Sorted map : "+entryList);
        System.out.println("Key of maximum value: "+entryList.getFirst().getKey());

    }
}
