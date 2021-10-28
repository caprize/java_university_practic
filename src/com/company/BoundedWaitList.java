package com.company;

public class BoundedWaitList<E> extends WaitList<E>{
    /**
     * @capacity is max size
     */
    private Integer capacity;

    public BoundedWaitList(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }

    @Override
    public void add(E element){
        /**
         * only if have place
         */
        if (content.size()<capacity) content.add(element);
        else System.out.println("No place");
    }
}
