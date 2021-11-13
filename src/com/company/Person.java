package com.company;

public class Person {
    String f_name="";
    String s_name="";
    String t_name="";

    Person(String f_name, String s_name, String t_name) {
        this.f_name = f_name;
        this.s_name = s_name;
        this.t_name = t_name;
    }
    String getFull_name(){
        return s_name +" "+ f_name +" "+ t_name;
    }
}
