package com.example;

import com.example.machine.Car;

public class MainClass {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.stop();
    }


    private Person makePerson(String name, int age){
        return new Person(name, age);
    }
}
