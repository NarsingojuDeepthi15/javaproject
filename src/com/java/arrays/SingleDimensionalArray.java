package com.java.arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        int[] j = new int[5];
        j[0] = 5;
        j[2] = 8;
        j[4] = 85;
        j[2] = 34;

        System.out.println(j[2]);
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);
        }

        // int i = 0;
        // while (i < j.length) {
        // System.out.println(j[i]);
        // i++;
        // }

    }

}
