package org.emp;

public class Employee {
    public void empId(int i){
        System.out.println("empid number : "+i);
    }
    public void empId(String s){
        System.out.println("empid string : "+s);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.empId(101);
        e.empId("s108");
    }
}
