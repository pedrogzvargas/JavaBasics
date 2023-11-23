package com.javabasics.generics;

public class PairExecutor {
    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("Uno", "Dos");
        Pair<Integer> intPair = new Pair<>(34, 45);
        System.out.println("String pairs: " + stringPair.getFirst()+ " " + stringPair.getSecond());
        System.out.println("Integer pairs: " + intPair.getFirst()+ " " + intPair.getSecond());
        Student student1 = new Student("Pedro");
        Student student2 = new Student("Pedro2");
        Pair<Student> studentPair = new Pair<>(student1, student2);

        PersonExecutor.print(stringPair);
    }
}
