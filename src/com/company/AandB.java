package com.company;

public class AandB {
    int a;
    int b;

    public AandB(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int get_col(int a,int b){
        if (a==0) return 1;
        else if(a==1) return b+1;
        else if(b==0 && a>1) return 0;
        else {
            return get_col(a-1,b-1)+get_col(a,b-1);
        }
    }
}
