package com.zet;



public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;


    public Employee(String n, double s){
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary (double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public  int compareTo (Employee other){

        return Double.compare(salary, other.salary);
      
    }
}
