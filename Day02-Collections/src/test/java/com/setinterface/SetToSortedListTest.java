package com.setinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetToSortedListTest {

    Set<Integer> set;
    @BeforeEach
    void setUp(){
        set = new HashSet<>(Arrays.asList(5,3,9,1));

    }
    @Test
    void converter() {
        Set<Integer> ans = SetToSortedList.converter(set);

        assertTrue(ans.size()==4,"Function Error");
        System.out.println("Test Passed !!!");
    }

}