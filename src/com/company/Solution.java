package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<T> {

    ArrayList<T> newArrayList(T[] arr){
        ArrayList<T> arrayList = new ArrayList<>();
        for (T i:arr){
            arrayList.add(i);
        }
        return arrayList;
    }
    HashSet<T> newHashSet(T[] arr){
        HashSet<T> hashSet = new HashSet<>();
        for (T i:arr){
            hashSet.add(i);
        }
        return hashSet;
    }
}
