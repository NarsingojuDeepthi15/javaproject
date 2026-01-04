package com.java.multidimensional;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 8, 4 }, { 9, 7, 2 }, { 7, 6, 4 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

    }

}
