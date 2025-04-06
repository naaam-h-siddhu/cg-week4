package com.setinterface;

import java.util.*;

public class EqualSets {
    public static boolean checkSets(Set<Integer> set1 , Set<Integer> set2){
        return set1.equals(set2);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));
        if(checkSets(set1,set2)){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
