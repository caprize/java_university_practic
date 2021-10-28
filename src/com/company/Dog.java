package com.company;

public class Dog {
    private String name;
    private String colour;
    private Integer age;
    private String gender;

    /**
     * Constructs a new object.
     */
    public Dog(String name,String colour, Integer age,String gender) {
        this.age=age;
        this.colour=colour;
        this.gender=gender;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public void bark(){
        System.out.println("GAV!");
    }
}
