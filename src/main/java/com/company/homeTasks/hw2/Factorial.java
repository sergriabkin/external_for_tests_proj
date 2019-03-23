package com.company.homeTasks.hw2;
/*
2. Написать метод, который считает факториал числа (n>16).
Hint:use BigInteger.
3.** Написать реализацию многопоточного подсчета факториала (n>16). Используя пакет java.util.concurrent.
 */

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(50));
        //test !15 = 1307674368000
    }

    private static BigInteger factorial(int num) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
