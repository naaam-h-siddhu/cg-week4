package com.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinary {
   public static Queue<String> generateBinary(int n ){
       Queue<String > ans = new ArrayDeque<>();
       Queue<String > queue = new ArrayDeque<>();
       int i = 1;
       queue.add("1");
       while(i<=n){
           String curr = queue.poll();
           ans.add(curr);
           queue.add(curr+"0");
           queue.add(curr+"1");
           i++;
       }
       return ans;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<String> binaryNumbers = generateBinary(N);
        System.out.println("Binary digits: "+binaryNumbers);

    }
}
