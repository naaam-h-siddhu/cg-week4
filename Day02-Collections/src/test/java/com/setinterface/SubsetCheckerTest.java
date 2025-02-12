package com.setinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SubsetCheckerTest {

    Set<Integer> set1;
    Set<Integer> set2;

    @BeforeEach
    void setUp(){
        set1 = new HashSet<>(Arrays.asList(2,3));
        set2 = new HashSet<>(Arrays.asList(1,2,3,4));


    }


    @Test
    void checkSubset() {
        set1.add(100);
        set2.add(100);
        assertTrue(SubsetChecker.checkSubset(set1,set2),"Function error");
        System.out.println("Test 1 Passed !!!");
    }
    @Test
    void checkSubset2(){
        set1.add(333);
        assertFalse(SubsetChecker.checkSubset(set1,set2), "Function Error");
        System.out.println("Test 2 Passed !!!");
    }
}