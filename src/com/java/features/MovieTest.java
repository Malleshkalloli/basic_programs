package com.java.features;

import java.util.function.Consumer;

public class MovieTest {
    public static void main(String[] args) {
        Consumer<Movie> c1=m1->System.out.println(m1.name+"ready to release ");
        Consumer<Movie> c2=m1->System.out.println(m1.name+"Flaf");
        Consumer<Movie> c3=m1->System.out.println(m1.name+" storing info in data ");
        Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
        Movie m=new Movie("SpiderMan");
        cc.accept(m);

    }
}
