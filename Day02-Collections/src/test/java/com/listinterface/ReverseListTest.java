package com.listinterface;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    LinkedList<Integer> linkedList;
    ArrayList<Integer> arrayList;
    @BeforeEach
    void setUp(){
        linkedList = new LinkedList<>();
        arrayList = new ArrayList<>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(15);

    }

    @org.junit.jupiter.api.Test
    void reverseLinkedListTest() {
        int firstNumber = linkedList.getFirst();
        ReverseList.reverseLinkedList(linkedList);
        assertEquals(firstNumber,linkedList.getLast(),"Error in reversal function");
    }

    @org.junit.jupiter.api.Test
    void reverseArrayListTest() {
        int firstNumber = arrayList.getFirst();
        ReverseList.reverseArrayList(arrayList);
        assertEquals(firstNumber,arrayList.getLast(), "Error in reversal function");
    }
}