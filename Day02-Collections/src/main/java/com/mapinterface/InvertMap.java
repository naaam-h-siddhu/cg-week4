package com.mapinterface;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InvertMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('A',1);
        mp.put('B',2);
        mp.put('C',1);

        HashMap<Integer, List<Character>> invertedMap = new HashMap<>();
        for(Character key : mp.keySet()){
            if(invertedMap.containsKey(mp.get(key))){
                List<Character> temp = invertedMap.get(mp.get(key));
                temp.add(key);
                invertedMap.put(mp.get(key),temp);
            }
            else{
                List<Character> temp = new ArrayList<>();
                temp.add(key);
                invertedMap.put(mp.get(key),temp);
            }
        }
        for(Integer key: invertedMap.keySet()){
            System.out.println(key+" : "+invertedMap.get(key));
        }
    }
}
