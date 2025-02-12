package com.setinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EqualSetsTest {
    @Test
    void checkForEqualSet(){
        Integer[] a = {1,2,3,44,3,2,1};
        Integer[] b = {2,3,1,44};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(a));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(b));

        assertTrue(EqualSets.checkSets(set1,set2), "Error in Function");
        System.out.println("Test Case Passed");

    }

    @Test
    void checkForEqualSet2(){
        Integer[] a = {2,1,2,2,2};
        Integer[] b = {1};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(a));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(b));

        assertFalse(EqualSets.checkSets(set1,set2), "Error in Function ");
        System.out.println("Test Case Passed");
    }

}