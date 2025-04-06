package com.setinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {
    Set<Integer> set1;
    Set<Integer> set2;
    @BeforeEach
    void setUp(){
        set1 = new HashSet<>(Arrays.asList(1,2,3));
        set2 = new HashSet<>(Arrays.asList(3,4,5));

    }

    @Test
    void getSymmetricDifference() {
        Set<Integer> ans = SymmetricDifference.getSymmetricDifference(set1,set2);
        assertTrue(ans.contains(2));

    }

    @Test
    void getSymmetricDifference2(){
        Set<Integer> ans = SymmetricDifference.getSymmetricDifference(set1,set2);
        assertFalse(ans.contains(3));
    }
}