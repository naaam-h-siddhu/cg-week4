package com.setinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> ans = new HashSet<>(set1);
        ans.addAll(set2);
        return ans;


    }
    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> ans = new HashSet<>(set1);
        ans.retainAll(set2);
        return ans;
    }
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("Set 1: "+set1);
        System.out.println("Set 2: "+set2);
        System.out.println("Union: "+getUnion(set1,set2));
        System.out.println("Intersection: "+getIntersection(set1,set2));

    }
}
