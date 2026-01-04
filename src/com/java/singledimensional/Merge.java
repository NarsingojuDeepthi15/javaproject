package com.java.singledimensional;

public class Merge {
    public static void main(String[] args) {
        String[] arr1 = { "chai", "coffee" };
        String[] arr2 = { "milk", "water", "coke" };
        String[] merged = new String[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++;

        }
        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }

}
