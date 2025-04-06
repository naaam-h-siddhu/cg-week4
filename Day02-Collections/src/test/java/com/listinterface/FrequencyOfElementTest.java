package com.listinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyOfElementTest {

    List<String> strings;
    @BeforeEach
    void setUp(){
        strings = new ArrayList<>();
        strings.add("siddhu");
        strings.add("Sudhakar");
        strings.add("siddhu");
        strings.add("siddhu");
        strings.add("Sudhakar");
    }
    @Test
    void frequencyCalculator() {
        Map<String, Integer> map = FrequencyOfElement.frequencyCalculator(strings);
        int siddhuFreq = map.get("siddhu");
        assertEquals(3,siddhuFreq,"Function not working ");
        System.out.println("Test Passed !!!");
    }
}