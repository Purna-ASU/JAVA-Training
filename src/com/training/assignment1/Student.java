package com.training.assignment1;

public class Student {

    protected String name;
    protected int age;
    protected double grade;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Purna");
        s1.setAge(23);
        s1.setGrade(3.5);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGrade());
    }
}
