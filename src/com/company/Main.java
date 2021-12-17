package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Task task = new Task("Alex","web",new Date(),new Date(System.currentTimeMillis()+1325535453));
        System.out.println(task);


        Scanner sc = new Scanner(System.in);
        Date d1 = new Date(sc.nextLong());
        System.out.println(d1.before(new Date(System.currentTimeMillis())));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        Student student = new Student("Alex","IKBO-03-20",cal);
        System.out.println(student.toString("short"));
        System.out.println(student.toString("medium"));
        System.out.println(student.toString("full"));


        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR,year);
        cal1.set(Calendar.MONTH,month);
        cal1.set(Calendar.DAY_OF_MONTH,day);
        cal1.set(Calendar.HOUR_OF_DAY,hour);
        cal1.set(Calendar.MINUTE,min);
        System.out.println(cal1.getTime());
        Date d2 = new Date();
        d2.setYear(year-1900);
        d2.setDate(day);
        d2.setMonth(month);
        d2.setHours(hour);
        d2.setMinutes(min);
        System.out.println(d2);



        ArrayList arrayList = new ArrayList<Integer>();
        LinkedList linkedList = new LinkedList();
        for(int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        Date startLinked = new Date();
        linkedList.add(100320,2);
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();


        for(int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        Date startArray = new Date();
        arrayList.add(100320,5);
        Date arrayfinish = new Date();
        long arrayTime = arrayfinish.getTime() - startArray.getTime();
        System.out.println("Add");
        System.out.println("Array: " + linkedTime +"ms Linked: "+arrayTime+"ms");

        Date startLinked1 = new Date();
        linkedList.remove(100000);
        Date finishLinked1 = new Date();
        long linkedTime1 = finishLinked1.getTime() - startLinked1.getTime();

        Date startArray1 = new Date();
        arrayList.remove(100000);
        Date finishArray1 = new Date();
        long arrayTime1 = finishArray1.getTime() - startArray1.getTime();
        System.out.println("Remove");
        System.out.println("Array: " + linkedTime1 +"ms Linked: "+arrayTime1+"ms");

        Date startLinked2 = new Date();
        linkedList.add(100000,12);
        Date finishLinked2 = new Date();
        long linkedTime2 = finishLinked2.getTime() - startLinked2.getTime();

        Date startArray2 = new Date();
        arrayList.add(100000,12);
        Date finishArray2 = new Date();
        long arrayTime2 = finishArray2.getTime() - startArray2.getTime();
        System.out.println("Put");
        System.out.println("Array: " + arrayTime2 +"ms Linked: "+linkedTime2+"ms");

        Date startLinked3 = new Date();
        linkedList.contains(100000);
        Date finishLinked3 = new Date();
        long linkedTime3 = finishLinked3.getTime() - startLinked3.getTime();

        Date startArray3 = new Date();
        arrayList.contains(100000);
        Date finishArray3 = new Date();
        long arrayTime3 = finishArray3.getTime() - startArray3.getTime();
        System.out.println("Contains");
        System.out.println("Array: " + arrayTime3 +"ms Linked: "+linkedTime3+"ms");
    }
}
