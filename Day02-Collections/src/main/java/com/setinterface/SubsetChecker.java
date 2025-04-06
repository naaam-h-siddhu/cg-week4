package com.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {
    public static boolean checkSubset(Set<Integer> set1 , Set<Integer> set2){
        return set2.containsAll(set1);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4));

        if(checkSubset(set1,set2)){
            System.out.println("True");
        }
        else System.out.println("False");

    }
}

