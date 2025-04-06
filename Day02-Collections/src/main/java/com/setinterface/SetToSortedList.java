package com.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetToSortedList {
    public static Set<Integer> converter(Set<Integer> set){
        Set<Integer> treeSet = new TreeSet<>(set);

        return treeSet;

    }
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println("Unsorted Set: "+set);
        converter(set);
        System.out.println("Sorted Set: "+set);

    }
}



