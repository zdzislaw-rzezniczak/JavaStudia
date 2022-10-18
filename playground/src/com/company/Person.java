package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        if (age <0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen (){
        if ( age > 12 && age < 20)
            return true;
        else
            return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty() )
            return "";
        if (firstName.isEmpty())
            return lastName;
        if (lastName.isEmpty())
            return firstName;
        else
            return firstName + " " + lastName;
    }
}
