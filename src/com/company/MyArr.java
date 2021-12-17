package com.company;

import java.util.ArrayList;

public class MyArr{
    private Integer size;    // количество элементов – размер коллекции
    private Object[] elements;

    public MyArr() {
        elements = new Object[10];
        size = 0;
    }

    public void add(Object o) {
        if (size < elements.length) {
            elements[size] = o;
        } else {
            Object[] t = elements;
            elements = new Object[size+5];
            for (int i=0;i<t.length;++i) {
                elements[i] = t[i];
            }
        }
        ++size;
    }

    public Object get(Integer index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return elements[index];
    }
    public int size() {
        return size;
    }
}

