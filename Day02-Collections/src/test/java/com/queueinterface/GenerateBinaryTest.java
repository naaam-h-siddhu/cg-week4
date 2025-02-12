package com.queueinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryTest {

    Queue<String> binaryNumbers;
    @BeforeEach
    void setBinaryNumbers(){
        binaryNumbers = GenerateBinary.generateBinary(5);
    }
    @Test
    void generateBinary() {
        assertEquals(5,binaryNumbers.size());
        System.out.println("Size Test Passed !!!");
    }

    @Test
    void checkForDigit(){
        binaryNumbers.poll();
        binaryNumbers.poll();
        binaryNumbers.poll();
        assertEquals("100",binaryNumbers.peek());
        System.out.println("Digit Test Passed !!!");
    }
}