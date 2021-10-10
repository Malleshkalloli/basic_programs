package com.thermmo.basic;



public class PrimeNumber {
    public static void main(String[]args){
    int m=0,flag=0;
    int n=15;
    m = n/2;
    if(n==0 || n==1){
        System.out.println("Its Not A prime number");
    }else{
        for(int i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("Its not a prime Number");
                flag=1;
                break;
            }

        }
    }
        if(flag==0){
            System.out.println(n+" is a Prime Number");
        }

}

}
