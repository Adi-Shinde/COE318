//Aditya Shinde
//COE318
//501189079
//aditya.shinde@torontomu.ca

package coe318.lab4;

public class Account {
    // Instance variables
    private String name;
    private int number;
    private double balance;

    // Constructor
    public Account(String name, int number, double initialBalance) {
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // toString method (DO NOT MODIFY)
    @Override
    public String toString() {
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
    }
}
