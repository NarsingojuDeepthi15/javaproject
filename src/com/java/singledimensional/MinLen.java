package com.java.singledimensional;

public class MinLen {
    public static void main(String[] args) {
        String[] arr = { "coffee", "water", "chai", "dietcoke" };
        String min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < min.length()) {
                min = arr[i];
                index = i;
            }

        }
        System.out.println("Value-" + min + " & index-" + index);

    }
}
