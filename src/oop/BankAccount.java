package oop;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
        System.out.println("Created a new object BankAccount");
    }

    public void printBalance() {
        System.out.println("Your balance is: " +balance);
    }

    public void setBalance(int amount) {
        balance = amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

}
