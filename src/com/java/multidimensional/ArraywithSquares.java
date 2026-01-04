package com.java.multidimensional;

public class ArraywithSquares {
    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 5 }, { 0, 1, 3 }, { 1, 2, 4 } };
        int[][] sqr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sqr[i][j] = arr[i][j] * arr[i][j];
            }
        }
        for (int i = 0; i < sqr.length; i++) {
            for (int j = 0; j < sqr[i].length; j++) {
                System.out.print(sqr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
