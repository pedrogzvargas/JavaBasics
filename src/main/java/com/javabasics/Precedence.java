package com.javabasics;

public class Precedence {
    public static void main(String[] args) {

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println(result3);
        System.out.println(result4);
    }
}