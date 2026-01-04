package com.java.looping;

public class SumEven {
    public static void main(String[] args) {
        int i = 40;
        int sum = 0;
        while (i <= 80) {
            if (i % 2 == 0) {
                sum = sum + i;
                // System.out.println(sum);
            }
            i++;
        }
        System.out.println(sum);
    }

}
