package com.company;

import java.util.StringTokenizer;

public class Adress {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String flat;

    public Adress(String adress) {
        String[] text= adress.split(",");
        country = text[0];
        region = text[1];
        city = text[2];
        street = text[3];
        house = text[4];
        building = text[5];
        flat = text[6];
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public Adress(String country, String region, String city, String street, String house, String building, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.flat = flat;
    }

    public Adress(StringTokenizer adress) {
        if (adress.hasMoreElements()) {
            country = adress.nextToken();
            region = adress.nextToken();
            city = adress.nextToken();
            street = adress.nextToken();
            house = adress.nextToken();
            building = adress.nextToken();
            flat = adress.nextToken();
        }
    }
}
