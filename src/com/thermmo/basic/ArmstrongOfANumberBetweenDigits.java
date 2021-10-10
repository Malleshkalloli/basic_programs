package com.thermmo.basic;

import java.util.Scanner;

public class ArmstrongOfANumberBetweenDigits {

    static boolean isNumberArmstrong(int n) {
        int last = 0, digits = 0, temp = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum) {
            return true;
        } else return false;

    }
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto  are");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (isNumberArmstrong(i)) {
                //to print armstrongOfNumber
                System.out.print(i + ",");
            }
        }
    }
}
