package com.zet;

public class PersonTest {

    public static void main(String[] args) {

        var people = new Person[2];

        people[0] = new Employee("Henryk Walezy", 50000, 1999, 12, 3);
        people[1] = new Student("Maria Walewska", "Informatyka");

        for(Person p : people ){
            System.out.println(p.getName() + " " + p.getDescription());
        }
    }
}
