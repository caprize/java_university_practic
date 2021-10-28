package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueForTask {
    public void Solve(Queue<Integer> a, Queue<Integer> b){
        int i=0;
        while (a.size()!=0 && b.size()!=0){
            if (IsNullNine(a.peek(),b.peek())){
                if(a.peek()==9){
                    bWin(a,b);
                }
                else{
                    aWin(a,b);
                }
            }
            else if (a.peek() >b.peek()){
                aWin(a,b);
            }
            else {
                bWin(a,b);
            }
            i++;
            if (i==106) {
                System.out.println("botva");
                return;
            }
        }
        if (a.size()!=0) System.out.println("first "+i);
        else System.out.println("second "+i);
    }
    public void aWin(Queue<Integer> a, Queue<Integer> b){
        a.add(a.peek());
        a.add(b.peek());
        b.poll();
        a.poll();
    }
    public void bWin(Queue<Integer> a, Queue<Integer> b){
        b.add(b.peek());
        b.add(a.peek());
        a.poll();
        b.poll();
    }
    public boolean IsNullNine(int a, int b){
        if (a==0 && b==9){
            return true;
        }
        else if (a==9 && b==0){
            return true;
        }
        return false;
    };
}
