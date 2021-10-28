package com.company;

import java.util.Collection;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    /**
     * @content is queue
     */
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        E t = content.peek();
        content.poll();
        return t;
    }

    @Override
    public boolean contains(E element) {
        for (E i:content){
            if (i==element) return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        for (E i:c){
            if(!content.contains(i)) return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (content.isEmpty()) return true;
        else return false;
    }
}
