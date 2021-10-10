package com.thermmo.basic;

import java.util.Scanner;

public class PrimeNumberBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First  range of number ");
        int n1 = sc.nextInt();

        System.out.println("Enter second range Number");
        Scanner sc1 = new Scanner(System.in);
        int n2 = sc1.nextInt();
        System.out.println("List Of Prime Number between " + n1 + " and " + n2);
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }


}
