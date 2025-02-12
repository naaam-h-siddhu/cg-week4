package com.listinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RotateElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List before rotation: "+list);
        Collections.rotate(list,2);
        System.out.println("List after rotation: "+list);
    }
}
