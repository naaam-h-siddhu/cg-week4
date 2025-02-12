package com.setinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionTest {

    Set<Integer> set1;
    Set<Integer> set2;
    @BeforeEach
    void setUp(){
        set1 = new HashSet<>(Arrays.asList(1,2,3));
        set2 = new HashSet<>(Arrays.asList(3,4,5));

    }
    @Test
    void getUnion() {
        Set<Integer> unionSet = UnionAndIntersection.getUnion(set1,set2);
        assertTrue(unionSet.contains(5), "Function Error");
        System.out.println("Test Case Passed !!!");
    }

    @Test
    void getIntersection() {
        Set<Integer> intersectionSet = UnionAndIntersection.getIntersection(set1,set2);
        assertFalse(intersectionSet.contains(2),"Function Error");
        System.out.println("Test case passed !!!");
    }
}