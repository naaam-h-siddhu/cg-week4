package com.queueinterface;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue){
//        Queue<Integer> newQueue = new ArrayDeque<>();
        if(queue.isEmpty()){
//            System.out.println("Queue empty !!!");
            return;
        }
        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(10,20,30));
        System.out.println("queue : "+ queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: "+queue);
    }
}

