package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String fio = sc.next();
	    String inn = sc.next();
        try {
            Long.parseLong(inn);
            Student student = new Student(fio,inn);
            if (inn.toString().length()!=12){
                throw new BadInnNumberException("INN number is wrong");
            }
            else if (Integer.parseInt(String.valueOf(inn.charAt(inn.length()-1)))%2==0)
                throw new NotInDBInnException("Wrong INN");
        }
        catch (BadInnNumberException err){
            if (inn.length()!=12)
                throw new InnLenghtException("INN must be 12 length number!",err);

        }
        catch (NumberFormatException err){
            throw new InnTypeException("INN must be a number!",err);
        } catch (NotInDBInnException e) {
            e.printStackTrace();
        }
    }
}
