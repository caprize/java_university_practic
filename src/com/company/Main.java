package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> a = new LinkedList<Integer>();
        Queue<Integer> b = new LinkedList<Integer>();
        for (int i=0;i<10;i++){
            if (i<5) {
                a.add(sc.nextInt());
            }
            else {
                b.add(sc.nextInt());
            }
        }
        QueueForTask queue = new QueueForTask();
        queue.Solve(a,b);
    }
}
