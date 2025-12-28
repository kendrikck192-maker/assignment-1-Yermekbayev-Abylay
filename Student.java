package model;

import interfaces.IStudy;

public final class Student extends Human implements IStudy {

    private final String university; // final field

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }

    @Override
    public int getStudyHours() {
        return 6;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm a student. My name is " + name);
    }

    public final String getUniversity() { // final method
        return university;
    }
}