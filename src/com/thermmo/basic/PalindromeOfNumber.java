package com.thermmo.basic;

import java.util.Scanner;

public class PalindromeOfNumber {
    public static void main(String[] args) {
        int sum=0;
    System.out.println("Enter a nummber need to be checked");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int temp= n;
        while(n>0){
        int r=n%10;
        sum=(sum*10)+r;
        n=n/10;

        }
    if(temp==sum){
    System.out.println("Given Number is Palindrome");
    }else{
        System.out.println("not a palindrome");

    }
    }

}
