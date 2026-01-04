package com.java.singledimensional;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 9, 6 };
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = 1;
            }

        }
        System.out.println("Value=" + max + " & Index=" + index);
    }

}
