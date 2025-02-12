package com.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    // union - intersection = symmetric difference
    public static Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> ans = new HashSet<>(union);
        ans.removeAll(intersection);
        return ans;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("Set 1: "+set1);
        System.out.println("Set 2: "+set2);
        System.out.println("Symmetric Difference: "+getSymmetricDifference(set1,set2));

    }
}
