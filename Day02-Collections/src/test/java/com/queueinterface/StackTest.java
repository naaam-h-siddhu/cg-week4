package com.queueinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack st;
    @BeforeEach
    void setUp(){
        st = new Stack();
        st.push(10);
    }

    @Test
    void push() {
        st.push(10);
        assertEquals(10,st.top());
    }

    @Test
    void pop() {
        st.push(20);
        st.pop();
        assertEquals(10,st.top());

    }

    @Test
    void top() {
        st.pop();
        st.pop();
        assertNull(st.pop());
    }
}