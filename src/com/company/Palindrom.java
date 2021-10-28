package com.company;

public class Palindrom {
    String a;

    public Palindrom(String a) {
        this.a = a;
    }

    boolean isPalindrom(String t){
        if(t.length()==1 || t.length()==0) return true;
        else if(t.charAt(0)==t.charAt(t.length()-1)){
            return isPalindrom(t.substring(1,t.length()-1));
        }
        else return false;
    }
}
