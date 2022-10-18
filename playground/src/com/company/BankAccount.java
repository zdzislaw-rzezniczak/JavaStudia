package com.company;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    

    public double getAccountName() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountName(double accountName) {
        this.accountNumber = (long) accountName;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double money){
        System.out.println("Last account balance = " + getBalance());
        if (money >= 0){
            balance += money;
            System.out.println("New balance = " + getBalance());
        }
        else
            System.out.println( "To withdraw use withdraw function");
    }

    public void withdraw (double money) {
        System.out.println("Last account balance = " + getBalance());
        if (money <= balance){
            balance -= money;
            System.out.println("New balance = " + getBalance());
        } else if (money > balance)
            System.out.println("Not enough resources.");
        else
            System.out.println( "Invalid Value");
    }
}
