package com.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MergeMap {
    public static void mergeMaps(Map<Character,Integer> map1, Map<Character,Integer> map2){

        map2.forEach((key,value)->
                map1.merge(key,value,Integer::sum)
                );
    }

    public static void main(String[] args) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        map1.put('A',1);
        map1.put('B',2);
        map2.put('B',3);
        map2.put('C',4);
        mergeMaps(map1,map2);
        System.out.println(map1);


    }
}
