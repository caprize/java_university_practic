package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isCorrect(String str) {
        return str.matches("(.*)(\\+)(.*\\d)") ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type string");
        String input = sc.nextLine();
        System.out.println("Type regex: ");
        String regexp = sc.nextLine();
        while (true){
            String[] a = input.split(regexp);
            for (String i: a){
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("if you want to change input string type: 1, regex - type 2, end - type 0");
            Integer h = sc.nextInt();
            if (h == 0 ) break;
            else if (h==1) input = sc.nextLine();
            else if (h==2) regexp = sc.nextLine();
        }


	    CharSequence charSequence = sc.next();
	    Password password = new Password(charSequence);
        if (password.matcher5.matches()) System.out.println("Good password");
        else System.out.println("You have to write down at least 1 A-Z, 1 a-z, may have _ char and must be 8 lenght");


        String a = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m2 = pattern.matcher(a);
        System.out.println(m2.matches());

        String b ="цкпп ццпк уккп 1.3 RUB укпу 20 USD";
        Pattern money = Pattern.compile("(?:^|[\\n\\r]|[^\\w\\d\\.])([1-9]\\d*(?:.\\d{1,2})?\\s*(?:USD|EU|RUB))\\b(?:$|[\\n\\r]|[^\\w\\d\\.])");
        Matcher m3 = money.matcher(b);
        while (m3.find()) {
            System.out.println(b.substring(m3.start(), m3.end()));
        }

        String mail = "fir@mail.ru";
        Pattern email = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher m4 = email.matcher(mail);
        System.out.println(m4.matches());

        String date = "12-05-2021";
        Pattern dates = Pattern.compile("(?:0?[1-9]|[12][0-9]|3[01])-(?:0?[1-9]|1[0-2])-(?:19[0-9][0-9]|[1-9][0-9][0-9][0-9]|)(?!\\d)");
        Matcher m5 = dates.matcher(date);
        System.out.println(m5.matches());

        String num = "(1 + 8) – 9 / 4";
        System.out.println(isCorrect(num));

    }
}
