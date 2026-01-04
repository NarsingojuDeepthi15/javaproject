package com.java.looping;

public class Primes {
    public static void main(String[] args) {
        int num = 50;
        while (num <= 150) {
            int count = 0; // exactly 2 divisors(1 and itself)
            int i = 1; // divide the number starts from 1
            while (i <= num) {
                if (num % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 2) {
                System.out.println(num);
            }
            num++;

        }

    }

}
