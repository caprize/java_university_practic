package com.company;

final public class Address {
    private String cityName;
    private Integer zipCode;
    private String streetName;
    private Integer buildingNumber;
    private Character buildingLetter;
    private Integer apartmentNumber;
    public static final Address EMPTY_ADDRESS = new Address("", 0, "", 0, 'a',0);

    public Address(String cityName, Integer zipCode, String streetName, Integer buildingNumber, Character buildingLetter, Integer apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", zipCode=" + zipCode +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", buildingLetter=" + buildingLetter +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }

    public String getCityName() {
        return cityName;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public Character getBuildingLetter() {
        return buildingLetter;
    }

    public Integer getApartmentNumber() {
        return apartmentNumber;
    }
}
