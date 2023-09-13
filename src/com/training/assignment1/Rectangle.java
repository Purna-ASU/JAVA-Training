package com.training.assignment1;

public class Rectangle {
    protected double length;
    protected double width;
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

    public void calculateArea() {
        double area = length * width;
        System.out.println("The area of the rectangle: "+area);
    }
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle: "+perimeter);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
