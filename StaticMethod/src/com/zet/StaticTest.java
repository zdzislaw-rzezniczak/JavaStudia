package com.zet;

public class StaticTest {

    public static void main(String[] args) {
	var staff = new Employee[3];

	staff[0] = new Employee("Tomek", 40000);
	staff[1] = new Employee("Adam", 60000);
	staff[2] = new Employee("Maniek", 65000);

	for (Employee e : staff){
	    e.setId();
        System.out.println("name=" + e.getName() + ", id=" + e.getId() + ", salary=" + e.getSalary());
    }

	int n = Employee.getNextId();
        System.out.println(("Next free ID = " + n));
    }
}


class Employee{
    private static  int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee (String aName, double aSalary){
        name = aName;
        salary = aSalary;
        id=0;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    public static void main (String[] args) //test jednostkowy
    {
        var e = new Employee("Grzegorz", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}