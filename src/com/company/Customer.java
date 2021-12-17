package com.company;

final public class Customer {
    private String firstName;
    private String secondName;
    private Integer age;
    private Address address;
    private static final int MATURE_AGE = 18;

    public static final Customer MATURE_UNKNOWN_CUSTOMER = new Customer("", "", MATURE_AGE, Address.EMPTY_ADDRESS);
    public static final Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("", "", MATURE_AGE-1, Address.EMPTY_ADDRESS);

    public Customer(String firstName, String secondName, Integer age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
