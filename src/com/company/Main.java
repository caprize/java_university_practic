package com.company;

import java.nio.file.Path;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        1 zadanie
	    Mnoj mnoj = new Mnoj(18.0);
        mnoj.get_mnoj(2);
        mnoj.print_res();
        Mnoj mnoj1 = new Mnoj(84.0);
        mnoj1.get_mnoj(2);
        mnoj1.print_res();
        Mnoj mnoj2 = new Mnoj(127.0);
        mnoj2.get_mnoj(2);
        mnoj2.print_res();
//        2 zadanie
        Palindrom palindrom = new Palindrom("aba");
        System.out.println(palindrom.isPalindrom(palindrom.a));
        Palindrom palindrom1 = new Palindrom("abddfd");
        System.out.println(palindrom1.isPalindrom(palindrom1.a));
        Palindrom palindrom2 = new Palindrom("gaag");
        System.out.println(palindrom2.isPalindrom(palindrom2.a));
        //3 zadanie
        AandB aandB = new AandB(2,3);
        System.out.println(aandB.get_col(aandB.a, aandB.b));
        AandB aandB1 = new AandB(3,2);
        System.out.println(aandB1.get_col(aandB1.a, aandB1.b));
    }
}
