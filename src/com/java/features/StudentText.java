package com.java.features;

import java.util.function.Function;
import java.util.function.Predicate;

public class StudentText {
    public static void main(String[] args) {

        Predicate<Student> p = s -> s.marks >= 60;

        Function<Student, String> f = s -> {
            int marks = s.marks;
            String grade = "";
            if (marks >= 80) grade = "A[Distinction]";
            if (marks >= 60) grade = "B[First Class]";
            if (marks >= 50) grade = "C[Second Class]";
            if (marks >= 35) grade = "D[Distinction]";
            else grade = "E[Failed]";
            return grade;
        };

        Student[] s3 = {
                new Student("Mallesh", 80),
                new Student("Kali", 60),
                new Student("Mata", 50),
                new Student("Hi MaTA", 35),
                new Student("GUNDYA", 30)

        };


        for (Student s1 : s3) {
            if (p.test(s1)) {
                System.out.println("Name of Student is " + s1.name);
                System.out.println("Name of Student is " + s1.marks);
                System.out.println("Name of Student is " + f.apply(s1));
                System.out.println();
            }
        }
    }
}
