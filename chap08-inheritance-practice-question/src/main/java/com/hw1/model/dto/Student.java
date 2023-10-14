package com.hw1.model.dto;

public class Student extends Person{

    private int grade;
    private String major;

    public Student() {
    }

    public Student(String name, int age, double height, double weight, int grade, String major) {

        super(age, height, weight);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information(){

        return super.information() +
                ", 학년 : " + this.grade +
                ", 전공 : " + this.major;
    }
}
