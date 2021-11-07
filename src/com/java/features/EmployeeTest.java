package com.java.features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args){
        List<Employee1> l1= new ArrayList<Employee1>();

        l1.add(new Employee1("Mallesh",123));
        l1.add(new Employee1("Preetham",234));
        l1.add(new Employee1("Praneeta",456));
        l1.add(new Employee1("Kallesh",654));
        l1.add(new Employee1("shiva",458));
        l1.add(new Employee1("rona",890));
        l1.add(new Employee1("Gadag",346));
        l1.add(new Employee1("gokak",367));
        l1.add(new Employee1("hukkeri",3567));
        System.out.println(l1);
        Collections.sort(l1,(e1,e2) -> (e1.empId<e2.empId) ? -1 :(e1.empId>e1.empId) ?-1 :0);
        System.out.println(l1);
        Collections.sort(l1,(e1,e2) -> e1.empName.compareTo(e2.empName));
        System.out.println(l1);

    }
}
