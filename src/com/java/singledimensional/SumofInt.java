package com.java.singledimensional;

public class SumofInt {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 9, 6 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }

}
