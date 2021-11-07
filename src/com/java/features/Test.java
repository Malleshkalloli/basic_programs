package com.java.features;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.run();
        for (int i=0; i<10; i++){
            System.out.println("Main thread");
        }
    }
}

