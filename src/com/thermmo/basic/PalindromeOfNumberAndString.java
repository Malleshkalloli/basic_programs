package com.thermmo.basic;

import java.util.Scanner;

public class PalindromeOfNumberAndString {
    public static void main(String[] args) {
        String reverse = "";
        System.out.println("Enter the Number or String to be checked for palindrome or not");
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        for (int i = val.length() - 1; i >= 0; i--) {
            reverse = reverse + val.charAt(i);
        }
        if (val.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number is a not palindrome.");
        }
    }
}
