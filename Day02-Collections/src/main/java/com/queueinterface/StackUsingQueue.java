package com.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;

class Stack{
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public Stack(){
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();

    }
    public void push(int x){
        queue1.offer(x);
    }
    public Integer pop(){
        if(queue1.isEmpty()){
            return null;
        }
        while(queue1.size()> 1){
            queue2.offer(queue1.poll());
        }
        int top = queue1.poll();

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;

    }
    public Integer top(){
        if(queue1.isEmpty()){
            return null;
        }
        while(queue1.size()> 1){
            queue2.offer(queue1.poll());
        }
        int top = queue1.peek();
        queue2.offer(queue1.poll());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
    }
}
