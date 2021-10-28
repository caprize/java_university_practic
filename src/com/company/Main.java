package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
	    try{
	        File file;
	        FileWriter writer = new FileWriter("/home/caprize/sixteen_practic/src/a.txt");
	        writer.write(s);
	        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
