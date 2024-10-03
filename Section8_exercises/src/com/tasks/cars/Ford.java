package com.tasks.cars;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "com.tasks.cars.Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "com.tasks.cars.Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "com.tasks.cars.Ford -> brake()";
    }
}
