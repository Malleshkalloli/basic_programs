package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> marks=new ArrayList<Integer>();
        marks.add(12);
        marks.add(15);
        marks.add(21);
        marks.add(43);
        marks.add(32);
        System.out.println("values of l is "+marks);
        List updatedMarks= marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(updatedMarks);
    }
}
