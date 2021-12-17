package com.company;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {1,4,7,93,6};
        Solution<Integer> solution = new Solution<>();
        ArrayList<Integer> arrayList= solution.newArrayList(arr);
        System.out.println(arrayList);



        String[] set = {"av","ad","av"};
        Solution<String> solution1 = new Solution<>();
        HashSet<String> hashSet= new HashSet<>();
        hashSet = solution1.newHashSet(set);
        System.out.println(hashSet);



        HashMap<Character, Integer> hashMap = new HashMap<>();
        Character[] a = {'s','d','y'};
        Integer[] b = {1,4,7};
        Solve<Character,Integer> solve = new Solve<>();
        try {
            hashMap = solve.newHashMap(a,b);
            System.out.println(hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

