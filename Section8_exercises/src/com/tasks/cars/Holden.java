package com.tasks.cars;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "com.tasks.cars.Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "com.tasks.cars.Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "com.tasks.cars.Holden -> brake()";
    }
}