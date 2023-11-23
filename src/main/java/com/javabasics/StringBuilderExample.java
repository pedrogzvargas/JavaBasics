package com.javabasics;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Hola Mundo ");
        stringBuilder.append("Java");
        String message = stringBuilder.toString();
        System.out.println(message);
        int pos = stringBuilder.indexOf("Java");
        stringBuilder.insert(pos, "Spring y ");
        message = stringBuilder.toString();
        System.out.println(message);
    }
}
