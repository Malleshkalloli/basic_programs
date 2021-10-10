package com.thermmo.basic;

import java.util.Scanner;

public class PrimeNumberUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number to be checked");
        int n = sc.nextInt();
        if (isPrime(n)){
            System.out.println(n+" is a prime Number");
        }else{
                System.out.println(n+" n is a not prime Number ");
        }

    }
            public static boolean isPrime (int n){
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
