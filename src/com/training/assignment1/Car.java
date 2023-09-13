package com.training.assignment1;

public class Car {
    protected String make;
    protected String model;
    protected int year;

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("AUDI");
        car.setModel("A7");
        car.setYear(2023);

        System.out.println(car.getMake() + "-" +car.getModel() + " was released in " + car.getYear());
    }

}
