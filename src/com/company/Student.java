package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    String name;
    String group;
    Calendar birth;

    public Student(String name, String group, Calendar birth) {
        this.name = name;
        this.group = group;
        this.birth = birth;
    }

    public String toString(String type) {
        SimpleDateFormat sh = new SimpleDateFormat("yyyy.M.d");
        SimpleDateFormat med = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        SimpleDateFormat full = new SimpleDateFormat("E, y-M-d 'at' \n" +
                "h:m:s");
        Date date;
        String birth1 = "";
        if (type.equals("short")) {
            birth1 = sh.format(birth.getTime());
        }
        else if(type.equals("medium")) birth1 = med.format(birth.getTime());
        else birth1 = full.format(birth.getTime());
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", birth=" + birth1 +
                '}';
    }
}
