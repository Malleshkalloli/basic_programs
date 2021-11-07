package com.java.features;

public class Interf1Impl {
    public static void main(String[] args) {
        Interf1 i= (int a,int b) -> System.out.println("Sum of value is "+(a+b));
        i.add(30,40);

    }
}
