package com.java.singledimensional;

public class RevArray {
    public static void main(String[] args) {
        boolean[] arr = { true, false, false, true, false, true };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }

}
