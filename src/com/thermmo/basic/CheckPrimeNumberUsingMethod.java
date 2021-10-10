package com.thermmo.basic;

public class CheckPrimeNumberUsingMethod {
    static void checkPrimeNumber(int number){
        int flag=0;
        int m=number/2;
        if(number==0 || number==1){
            System.out.println(number+" is  not a prime number");
        }else{
            for(int i=2;i<=m; i++){
                if(number%i==0){
                   System.out.println(number+" is not a prime number");
                   flag=1;
                   break;
                }
            }

    if(flag==0){
        System.out.println(number+" is a prime number");
    }
    }
    }
    public static void main(String[] args) {
        checkPrimeNumber(5);
        checkPrimeNumber(12);
        checkPrimeNumber(17);

    }

}
