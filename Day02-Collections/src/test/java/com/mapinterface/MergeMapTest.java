package com.mapinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MergeMapTest {
    Map<Character,Integer> map1;
    Map<Character,Integer> map2;

    @BeforeEach
    void setUp(){
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        map1.put('X',12);
        map2.put('X',13);
        map2.put('Z',13);
        map1.put('Z',-13);
    }
    @Test
    void mergeMaps() {
        MergeMap.mergeMaps(map1,map2);
        assertEquals(0, map2.get('Z'));
        System.out.println("Test 1 Passed !!!");
    }

    @Test
    void mergeMaps2(){
        MergeMap.mergeMaps(map1,map2);
        assertEquals(25,map2.get('X'));
        System.out.println("Test 2 Passed !!!");
    }
}