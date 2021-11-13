package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String d = sc.nextLine();
        Person person = new Person("Alex","Ivanov","Vasilich");
        System.out.println(person.getFull_name());


        Test test = new Test();
        test.adressArrayList.add(new Adress("Russia,Tatarstan,Kazan,Fuchika,151,2,48"));
        test.adressArrayList.add(new Adress("Russia,Tatarstan,Moscow,Fuchika,141,3,78"));
        test.adressArrayList.add(new Adress(new StringTokenizer("Russia Tatarstan Moscow Fuchika 111 9 18")));
        test.adressArrayList.add(new Adress(new StringTokenizer("England`Tatarstan`Moscow`Fuchika`41`9`18","`")));
        for (Adress i:test.adressArrayList){
            System.out.println(i);
        }
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T- Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        ArrayList<Shirt> a = new ArrayList<>();
        for (String i:shirts){
            String[] t = i.split(",");
            Shirt shirt = new Shirt(t[0],t[1],t[2],t[3]);
            a.add(shirt);
        }
        for (Shirt i: a){
            System.out.println(i);
        }


        try {
            Scanner sc = new Scanner(new File(args[0]));
            StringBuilder words = new StringBuilder();
            String[] arrayList = sc.nextLine().split(" ");
            String temp= arrayList[0];
            arrayList[0] = " ";
            for (int i=0;i<arrayList.length;++i){
                if (temp!=" ") {
                    words.append(temp);
                    words.append(" ");
                }
                for (int j=0; j<arrayList.length;++j){
                    if (temp.charAt(temp.length()-1) == arrayList[j].charAt(0) && arrayList[j]!=" ") {
                        temp = arrayList[j];
                        arrayList[j] = " ";
                        break;
                    }
                }
            }
            System.out.println(words);
            FileWriter writer = new FileWriter(new File(args[0]));
            writer.write(words.toString());
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
