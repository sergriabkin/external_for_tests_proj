package com.company.lesson1;

public class Main2_Factorial {

    public static final String YES = "Yes";
    public static final String NO = "No";

    public static void main(String[] args) {

        long factorial = factorial(15);
        System.out.println(factorial);

        long factorialR = factorialRecursion(15);
        System.out.println(factorialR);

        int a = 0;
        if (a > 0) {
            System.out.println(YES);
        } else System.out.println(NO);

        System.out.println(a > 0 ? "Yes" : "No");

    }

    private static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    private static long factorialRecursion(int num) {
        return (num == 0 || num == 1) ? 1 : num * factorialRecursion(num - 1);
    }


}
