package BalanceApp.test;

public class Account {

    private int id;
    private String name;
    private double balance;
    private String password;

    // Constructor
    public Account(int id, String name, double balance, String password) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    // Display method
    public void display() {
        System.out.println("----- Account Details -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}