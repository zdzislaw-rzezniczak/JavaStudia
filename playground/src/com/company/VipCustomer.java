package com.company;

public class VipCustomer {

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.

    private String name;
    private  double limit;
    private String emailAddress;

    public VipCustomer(String name, String emailAddress, double limit) {
        this.name = name;
        this.limit = limit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
       this(name, emailAddress, 678);
    }

    public VipCustomer(){
    this("jan", "kowalski", 897);
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
