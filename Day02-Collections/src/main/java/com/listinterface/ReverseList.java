package com.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseList {
    public static void reverseLinkedList(LinkedList<Integer> linkedList )
    {
        int n = linkedList.size();
        int i = 0;
        int j = n-1;
        while(i<=j){
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(j));
            linkedList.set(j, temp);
            i++;j--;

        }
    }
    public static void reverseArrayList(ArrayList<Integer> arrayList){
        int n = arrayList.size();
        int i = 0;
        int j = n-1;
        while(i<= j){
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j,temp);
            i++;j--;

        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> numbersList = new LinkedList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);
        ArrayList<Integer> numbersArray = new ArrayList<>();
        numbersArray.add(10);
        numbersArray.add(20);
        numbersArray.add(30);
        numbersArray.add(40);
        numbersArray.add(50);
        System.out.println("LinkedList content before reversal: "+numbersList);
        reverseLinkedList(numbersList);
        System.out.println("LinkedList content after reversal: "+numbersList);

        System.out.println("ArrayList content before reversal: "+numbersArray);
        reverseArrayList(numbersArray);
        System.out.println("ArrayList content after reversal: "+numbersArray);



    }
}
