package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student("gg",5);
	    Student student2 = new Student("gt",3);
	    Student student3 = new Student("ge",6);
	    Student[] a = new Student[3];
	    a[0] = (student1);
	    a[1] = (student2);
	    a[2] = (student3);
	    InsertionSort insertionSort = new InsertionSort();
	    insertionSort.insertion_sort(a);
		for (Student i : a){
			System.out.println(i);
		}
    }
}
