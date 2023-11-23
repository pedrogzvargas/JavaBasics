package com.javabasics.generics;

public abstract class Person {
    String name;
    public Person(String name){
        this.name = name;
    }

    public abstract String getDescription();

    public String getName(){
        return this.name;
    }
}
