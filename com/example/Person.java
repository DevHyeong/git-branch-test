package com.example;

public class Person {
    private String name;
    private int age;
    private Country country;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }
}
