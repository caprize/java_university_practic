package com.company;

import java.util.HashMap;

public class Solve<K,V> {

    HashMap<K,V> newHashMap(K[] a, V[] b) throws Exception{
        HashMap<K,V> hashMap = new HashMap();
        if (a.length!=b.length){
            System.out.println("ERROR");
            throw new Exception("Array lenght is not equal");
        }
        else{
            for (int i=0;i<a.length;++i){
                hashMap.put(a[i],b[i]);
            }
            return hashMap;
        }
    }
}
