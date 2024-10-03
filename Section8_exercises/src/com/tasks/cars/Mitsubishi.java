package com.tasks.cars;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "com.tasks.cars.Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "com.tasks.cars.Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "com.tasks.cars.Mitsubishi -> brake()";
    }
}