package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void ArrayToList(Object[] a, List lst) {// компилятор проверяет, есть ли тип
        // lst имеет тип ArrayList<E>
        for (Object e : a) lst.add(e);                                 // компилятор проверяет является ли e типом E
    }
    public static void findFiles (String Path) throws IOException {

        ArrayList<File> list = new ArrayList<File>();
        File f = new File (Path);
        File[] listFiles = f.listFiles();
        int i=0;
        int temp=0;
        for(File f1 :listFiles){
            temp++;
            list.add(f1);
            System.out.println(list.get(i++));
            if (temp==5) break;
        }
    }
    public static void main(String[] args) {
        String[] a = new String[2];
        Integer[] c = new Integer[2];
        c[0] = 42;
        c[1] = 53;
        a[0] = "abc";
        a[1] = "bde";
        List<?> b = new ArrayList<Object>();
        ArrayToList(a,b);
        System.out.println(b.get(0));
        b = new ArrayList<Object>();
        ArrayToList(c,b);
        System.out.println(b.get(0));


        MyArr arr = new MyArr();
        arr.add(3);
        arr.add("d");
        System.out.println(arr.get(0));


        try {
            findFiles("/home/caprize/IdeaProjects/java_university");
        } catch (Exception e){
           e.printStackTrace();
        }
    }
}
