package com.thermmo.basic;

public class FibonessiSeriesWithRecursion {
    static int n1=0,n2=1,n3,count=0;
    static void printFibonessiSeries(int count){
        if(count>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonessiSeries(count-1);
        }
    }

    public static void main(String[] args) {
        count=10;
        System.out.print(n1+" "+n2);
        printFibonessiSeries(count-2);
    }
}
