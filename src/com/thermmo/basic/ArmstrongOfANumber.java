package com.thermmo.basic;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class ArmstrongOfANumber {
    public static void main(String[] args) {
        int sum=0,temp=0;
    System.out.println("Enter the number for checking arstrong of a number");
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
        temp=n%10;
        sum=sum+temp*temp*temp;
        n=n/10;
    }
    System.out.println("armstrong of number is "+sum);
    }
}
