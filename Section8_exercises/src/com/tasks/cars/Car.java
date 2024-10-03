package com.tasks.cars;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "com.tasks.cars.Car -> startEngine()";
    }

    public String accelerate() {
        return "com.tasks.cars.Car -> accelerate()";
    }

    public String brake() {
        return "com.tasks.cars.Car -> brake()";
    }
}
