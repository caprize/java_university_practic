package com.company;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        for (int i=0;i<2;++i) {
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void printDetails(String key) throws Exception {
        try {  String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}
