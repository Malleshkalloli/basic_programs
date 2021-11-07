package com.java.streams.udemy;

import java.util.ArrayList;
import java.util.List;

public class   FBNumberRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(31);
        list.add(47);
        list.add(8);
        list.add(13);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(43);
        list.stream().forEach(element -> System.out.println(element));
        int sum = 0;
        for (Integer list1 : list
        ) {
            sum += list1;


        }
        System.out.println(sum);

        int summ1 = list.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("sum values is " + summ1);

        int sum2 = list.stream().filter(n1 ->n1%2==1).reduce(0,(num1,num2)->num1+num2);

        int val=list.stream().filter(n1->n1%2==0).findFirst().get();

        System.out.println("first value is "+val);

        System.out.println("Sum2 is "+sum2);

        int sum3=list.stream().max((n1,n2)->n1.compareTo(n2)).get(); //to findd max

        System.out.println("Sum3 is "+sum3);

        int sum4=list.stream().max((n1,n2)->Integer.compare(n1,n2)).get();

        System.out.println("Sum4 is "+sum4);
    }
}
