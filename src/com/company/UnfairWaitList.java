package com.company;

import java.util.ArrayList;

public class UnfairWaitList<E> extends WaitList<E> {
    public ArrayList<E> deleted;
    public UnfairWaitList() {
        super();
    }

    @Override
    public void add(E element) {
        if (!deleted.contains(element)) content.add(element);
    }

    public void remove(E element) {
        /**
         * can't remove first element
         */
        for (E i:content){
            if (i.equals(element) && !i.equals(content.peek())){
                deleted.add(i);
                content.remove(i);
            }
        }
    }
    public void moveToBack(E element){
        for (E i:content){
            if (i.equals(element)){
                content.remove(i);
            }
        }
        content.add(element);
    }
}
