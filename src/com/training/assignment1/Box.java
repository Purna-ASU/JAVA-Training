package com.training.assignment1;

public class Box {
    protected double length;
    protected double width;
    protected double height;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void volume() {
        double calVolume = (length * width * height);
        System.out.println("The volume of the box is: " +calVolume);
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setLength(10.0);
        box.setWidth(20.0);
        box.setHeight(30.0);
        box.volume();
    }
}
