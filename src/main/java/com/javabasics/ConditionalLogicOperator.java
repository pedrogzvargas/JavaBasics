package com.javabasics;

public class ConditionalLogicOperator {
    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

        // if (rooms != 0 & students/rooms > 30){ tratarà de evaluear la segunda condicion
        if (rooms != 0 && students/rooms > 30){ // No evalua la segunda condicion
            System.out.println("Crowded");
        }
        System.out.println("");
        System.out.println("*** end of program ***");
    }
}
