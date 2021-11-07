package com.java.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class EmployeeTestWithPredicate {
    public static void main(String[] args) {
        List<EmployeeWithPredicate> l1= new ArrayList<EmployeeWithPredicate>();
        l1.add(new EmployeeWithPredicate("Mallesh",10000));
        l1.add(new EmployeeWithPredicate("Chetan",12000));
        l1.add(new EmployeeWithPredicate("kalloli",201101));
        l1.add(new EmployeeWithPredicate("mangalore",12234567));
        l1.add(new EmployeeWithPredicate("aaaX",2000));
        l1.add(new EmployeeWithPredicate("kalloli",2990));
        l1.add(new EmployeeWithPredicate("mangalore",1000));

        Predicate<EmployeeWithPredicate> p = e -> e.salary > 10000;
        for(EmployeeWithPredicate  q : l1){
            if(p.test(q)){
                System.out.println("Employee name "+q.empName +" salry "+q.salary);


            }
        }

    }



}
