package com.company.homeTasks.hw2;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(50));
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
