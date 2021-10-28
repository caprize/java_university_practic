package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        // добавим в список ряд элементов
        cities.add("Moscow");
        cities.add("Washington");
        cities.add("Tokyo");
        cities.add("Madrid");
        cities.add(1, "Kazan"); // добавляем элемент по индексу 1

        System.out.println(cities.get(1));// получаем 2-й объект
        cities.set(1,  "Wroclaw");  //  установка  нового  значения  для  2-го

        System.out.printf("В списке %d элементов \n", cities.size());
        for(String state : cities){

            System.out.println(state);
        }

        if(cities.contains("Moscow")){

            System.out.println("Список содержит Moscow");
        }
        // удалим несколько объектов
        cities.remove("Wroclaw");
        cities.remove(0);

        Collections.sort(cities);

        for (String city : cities){
            System.out.println(city);
        }
    }
}
