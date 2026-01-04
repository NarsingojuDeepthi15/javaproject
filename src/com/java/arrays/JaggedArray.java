package com.java.arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 3, 4, 5 }, { 6, 7 } };
        /*
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[i].length; j++) {
         * System.out.print(arr[i][j] + " ");
         * }
         * System.out.println();
         * }
         */

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i].length);
            size += arr[i].length;
        }
        System.out.println(size);

    }

}
