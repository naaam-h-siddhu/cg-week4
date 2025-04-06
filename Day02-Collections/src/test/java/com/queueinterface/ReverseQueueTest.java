package com.queueinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {

    Queue<Integer> queue;
    @BeforeEach
    void setUp(){
        queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));

    }
    @Test
    void reverseQueue() {
//        queue.add(12);
        int expected = 4;
        ReverseQueue.reverseQueue(queue);
        assertEquals(expected,queue.peek());
        System.out.println("Test Case Passed !!!");
    }
}