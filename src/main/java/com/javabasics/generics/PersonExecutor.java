package com.javabasics.generics;

public class PersonExecutor{
    public static void print(Pair<String> pair){
        String first = pair.getFirst();
        String second = pair.getSecond();
        System.out.println("String Pairs: " + first + " " + second);
    }

    public static void printAny(Pair<? extends Person> pair){
        Person first = pair.getFirst();
        Person second = pair.getSecond();
        System.out.println("String Pairs: " + first + " " + second);
    }
}
