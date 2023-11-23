package com.javabasics;

public class Arrays {
    public static void main(String[] args) {
        float[] values = new float[3];
        // float[] values = {0.1f, 0.2f, 0.3f};
        values[0] = 0.1f;
        values[1] = 0.2f;
        values[2] = 0.3f;

        for (int index = 0; index < values.length; index++){
            System.out.println(values[index]);
        }
    }
}
