package com.company.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class LambdaCalc {

    public static Map<Character, DoubleBinaryOperator> map = new HashMap<>();
    static {
        map.put('+', (double a, double b) -> a + b);
        map.put('-', (double  a, double b) -> a - b);
        map.put('*', (double  a, double  b) -> a * b);
        map.put('/', (double  a, double  b) -> a / b);
    }
    public static double calc(double a, char o, double b) {
        DoubleBinaryOperator func = map.get(o);
        if(func == null) {
            throw new IllegalArgumentException("");
        }
        return func.applyAsDouble(a, b);
    }

    public static void main(String[] args) {
        double calc = calc(2, '+', 3);
        System.out.println(calc);
    }
}
