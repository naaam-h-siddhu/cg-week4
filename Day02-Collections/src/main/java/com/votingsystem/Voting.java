package com.votingsystem;

import java.util.Map;
import java.util.*;

public class Voting {
    HashMap<String, Integer> hashMap = new HashMap<>();
    Map<String, Integer> orderedMap = new LinkedHashMap<>();
    Map<String, Integer> sortedMap = new TreeMap<>();

    public void castVote(String name) {
        //added in hashmap
        hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);


        //added in ordered map
        orderedMap.put(name, hashMap.get(name));

        //added in sorted map

        sortedMap.put(name, hashMap.get(name));
    }

    public void displayInOrder() {
        for (Map.Entry<String, Integer> entry : orderedMap.entrySet()) {
            System.out.println("candidate " + entry.getKey() + " has " + entry.getValue() + " Votes");
        }
    }

    public void displayinSortedOrder() {
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("candidate " + entry.getKey() + " has " + entry.getValue() + " votes.");
        }
    }

    public void displayWinner() {
        String winner = Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Winner: " + winner + " with " + hashMap.get(winner) + " votes.");
    }


}
