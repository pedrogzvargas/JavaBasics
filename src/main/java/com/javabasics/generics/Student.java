package com.javabasics.generics;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Mi nombre es " +  this.name;
    }
}
