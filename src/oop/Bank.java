package oop;

public class Bank {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println("Byter till konto 2");

        account2.printBalance();
        account2.setBalance(200);
        account2.printBalance();
        account2.withdraw(100);
        account2.printBalance();
        account2.deposit(300);
        account2.printBalance();
        account2.withdraw(33);
        account2.printBalance();

        System.out.println("Byter till konto 3");

        account3.printBalance();
        account3.withdraw(100);
        account3.printBalance();
        account3.deposit(300);
        account3.printBalance();
        account3.withdraw(33);
        account3.printBalance();

        System.out.println("Byter till konto 2");
        account2.printBalance();



    }



}
