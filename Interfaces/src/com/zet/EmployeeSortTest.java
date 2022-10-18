package com.zet;

import java.util.*;

public class EmployeeSortTest {

    public static void main(String[] args) {
	var staff = new Employee[3];

	staff[0] = new Employee("Jan Kowalski", 56000);
	staff[1] = new Employee("Maria Janion", 69000);
	staff[2] = new Employee("Zet Zets", 5500);

	Arrays.sort(staff);

		for (Employee e: staff ) {
			System.out.println("name = " + e.getName() + " salary = " + e.getSalary());
		}

    }



}

