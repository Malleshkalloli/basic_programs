package com.thermmo.basic;

public class FactorialOfNumberUsingRecursion {

    static int factorialOfNuber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorialOfNuber(n - 1));
        }
    }

    public static void main(String[] args) {
        int i, fact = 1;
        int number = 4;
        fact = factorialOfNuber(number);
        System.out.println("Factorial ofnummber is " + fact);
    }
}
