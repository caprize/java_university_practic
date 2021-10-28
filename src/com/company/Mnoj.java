package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Mnoj {
    ArrayList<Integer> a;
    Double n;
    Double logn;

    public Mnoj(Double n) {
        this.n = n;
        a=new ArrayList<Integer>();
        logn = (Math.log(n)/Math.log(2)+1e-10);
    }

    public ArrayList<Integer> get_mnoj(int i) {
        if (i > logn+1) return a;
        else if (n % i == 0) {
            n/=i;
            a.add(i);
            return get_mnoj(i);
        } else return get_mnoj(i + 1);
    }
    public void print_res(){
        if (a.size()==0) System.out.println("1"+" + "+n);
        else {
            String ans = "";
            Stack stack = new Stack();
            int temp = 1;
            for (int i = 0; i < a.size() - 1; ++i) {
                stack.push(a.get(i));
               if (a.get(i).equals(a.get(i+1))) {
                   temp++;
               }
               else if(temp>1) {
                   ans += stack.peek()+"^"+temp+" + ";
                   for (int j=0;j<temp-1;++j) stack.pop();
                   temp=1;
               }
               else if(temp==1 && i!=a.size()-2) ans += stack.peek()+" + ";
               else ans += stack.peek()+" + " + a.get(i+1);
               if (temp>1 && i==a.size()-2) ans += stack.peek()+"^"+temp;
            }
            System.out.println(ans);
        }
    }
}
