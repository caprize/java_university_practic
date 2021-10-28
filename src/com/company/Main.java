package com.company;

public class Main {

    public static void main(String[] args) {
        WaitList<Integer> w1 = new BoundedWaitList<Integer>(5);
        ((BoundedWaitList)w1).add(3);
        ((BoundedWaitList)w1).add(4);
        ((BoundedWaitList)w1).add(5);
        ((BoundedWaitList)w1).add(1);
        ((BoundedWaitList)w1).add(8);
        ((BoundedWaitList)w1).add(0);
        System.out.println(((BoundedWaitList<Integer>) w1).getCapacity());
        System.out.println(((BoundedWaitList)w1));
        System.out.println(w1.contains(3));
        System.out.println(w1.remove());
        System.out.println(((BoundedWaitList)w1));


        WaitList<String> w2 = new UnfairWaitList<String>();
        w2.add("friend");
        w2.add("dear");
        w2.add("My");
        w2.add("hello");
        ((UnfairWaitList)w2).remove("dear");
        ((UnfairWaitList)w2).moveToBack("friend");
        System.out.println(((UnfairWaitList)w2));
        ((UnfairWaitList)w2).remove("My");
        System.out.println(((UnfairWaitList)w2));
        System.out.println(((UnfairWaitList)w2).isEmpty());
    }
}
