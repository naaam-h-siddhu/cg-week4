package com.listinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElement {
    public static Map<String, Integer> frequencyCalculator(List<String> strings){
        Map<String , Integer> map = new HashMap<>();
        for (String string: strings) {
            if(map.containsKey(string)){
                map.put(string,map.get(string)+1);

            }
            else{
                map.put(string,1);
            }

        }
        return map;
    }
    public static void main(String[] args) {

        List<String > strings = new ArrayList<>();
        strings.add("hello");
        strings.add("mello");
        strings.add("hello");
        strings.add("jello");
        strings.add("mello");
        strings.add("mello");
        strings.add("hello");

        Map<String,Integer> map = frequencyCalculator(strings);
        for(String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }

    }
}
