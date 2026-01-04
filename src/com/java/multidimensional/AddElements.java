package com.java.multidimensional;

public class AddElements {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 1 }, { 9, 7, 2 }, { 7, 6, 4 } };
        int[][] arr2 = { { 2, 6, 8 }, { 0, 1, 3 }, { 1, 2, 4 } };
        int[][] add = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                add[i][j] = arr1[i][j] + arr2[i][j];
            }

        }
        for (int i = 0; i < add.length; i++) {
            for (int j = 0; j < add[i].length; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();

        }
    }

}
