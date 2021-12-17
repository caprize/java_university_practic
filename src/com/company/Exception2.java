package com.company;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (NumberFormatException e){
            System.out.println("Not a number");
        } catch (Exception e){
            System.out.println("some exception");
        }finally {
            System.out.println("Something went wrong");
        }
    }
}
