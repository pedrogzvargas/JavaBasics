package com.javabasics.generics;

public class Pair<T> {
    private final T first;
    private final T second;

    public Pair(){
        this.first = null;
        this.second = null;
    }

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T  getFirst(){
        return this.first;
    }

    public T getSecond(){
        return this.second;
    }
}
