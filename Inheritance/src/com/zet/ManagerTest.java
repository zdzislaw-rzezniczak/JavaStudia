package com.zet;

public class ManagerTest {

    public static void main(String[] args) {
	var boss = new Manager ("Karol Parol", 80000, 1987, 10, 1);
	boss.setBonus(5000);

	var staff = new Employee[3];

	staff[0] = boss;
	staff[1] = new Employee("Henryk Kwiat", 50000, 1989, 12, 1);
	staff[2] = new Employee("Jan Janura", 3000, 2013, 10, 8);

	for (Employee e : staff){
        System.out.println("name= " + e.getName() + ", salary = " + e.getSalary());
	}

	System.out.println();
	staff[1].raiseSalary(25);
	boss.setBonus(6000);

		for (Employee e : staff){
			System.out.println("name= " + e.getName() + ", salary = " + e.getSalary());
		}
    }
}
