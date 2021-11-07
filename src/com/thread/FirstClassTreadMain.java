package com.thread;

public class FirstClassTreadMain {

    public static void main(String[] args) {
        FirstClassThread firstClassThread=new FirstClassThread();
        Thread t =new Thread(firstClassThread);
        t.start();
        for (int i=0;i<=10;i++){
            System.out.println("Main thread");
        }
    }
}
