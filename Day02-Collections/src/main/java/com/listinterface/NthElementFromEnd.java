package com.listinterface;

import java.util.*;

public class NthElementFromEnd {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('A','B','C','D','E'));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListIterator<Character> first = list.listIterator();
        ListIterator<Character> second = list.listIterator();
        for(int i = 0;i<n;i++){
            if(!first.hasNext()){
                System.out.println("Invalid Index");
                return;
            }
            first.next();
        }
        while(first.hasNext()){
            first.next();
            second.next();
        }
        System.out.println(n+"th element from the end: "+second.next());

    }
}
