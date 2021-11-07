package com.java.features;

public class Employee1 {
     String empName;
     int empId;

   public Employee1(String empName,int empId){
       this.empName=empName;
       this.empId=empId;

   }

   public String toString(){
        return "Name="+empName +":"+"id= "+empId;
   }



}
