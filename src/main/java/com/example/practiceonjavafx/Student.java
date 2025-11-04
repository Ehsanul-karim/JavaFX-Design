package com.example.practiceonjavafx;

public class Student {
    private String name;
    private String id;
    private double cgpa;

    public Student(String name, String id, double cgpa) {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public double getCgpa(){
        return cgpa;
    }
}
