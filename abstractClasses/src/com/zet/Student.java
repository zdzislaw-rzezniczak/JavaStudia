package com.zet;

public class Student extends Person {

    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "student specjalizacji " + major;
    }
}
