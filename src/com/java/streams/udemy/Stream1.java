package com.java.streams.udemy;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Mallesh");
        list.add("Kalloli");
        list.add("Pradeep");
        list.add("Muttu");
        printWithFPWithFiltering(list);

    }
    private static void printBasic(List<String>  list){
        for (String s: list) {
            System.out.println(list);
        }
    }
    private static void printWithFP(List<String> list){
        list.stream().forEach(element->System.out.println(element));
    }

    private static void printWithFPWithFiltering(List<String> list){
        list.stream().filter(elemment->elemment.endsWith("sh")).forEach(element->System.out.println(element));
    }


}
