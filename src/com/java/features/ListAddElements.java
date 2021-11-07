package com.java.features;

import java.util.*;
import java.util.stream.Collectors;

public class ListAddElements {
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(12);
        l1.add(34);
        l1.add(54);
        l1.add(23);
        l1.add(103);
        l1.add(45);
        System.out.println("arrayElements are "+l1);
        Comparator<Integer> comp= (I1,I2) ->(I1>I2) ? 1 :(I1<I2) ? -1 : 0; //lambda expression
        Collections.sort(l1,comp);
        System.out.println(l1);
        l1.stream().forEach(System.out ::println);
        List<Integer> i1= l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("l1 is "+i1);
    }
    }

