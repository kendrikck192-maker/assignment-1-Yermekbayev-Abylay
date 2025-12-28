package model;

import interfaces.IStudy;
import interfaces.IWork;

public class Employee extends Human implements IStudy, IWork {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void study() {
        System.out.println(name + " is learning new skills.");
    }

    @Override
    public int getStudyHours() {
        return 2;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm an employee. My name is " + name);
    }
}