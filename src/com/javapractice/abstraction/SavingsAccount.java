package com.javapractice.abstraction;

public class SavingsAccount extends BankAccount implements AccountServices{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, String accountType, String contactNumber, String email, double interestRate) {
        super(accountNumber, accountHolderName, balance, accountType, contactNumber, email);
        this.interestRate = interestRate;

    }

    public void addInterest(){
        double interest = balance * interestRate/100;
        deposit(interest);
        System.out.println("Interest Added= " + interest);
        System.out.println("Total balance = " + balance);
    }

    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("interestRate = " + interestRate);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
            System.out.println(accountHolderName + " Balance =" + balance);
        } else {
            System.out.println("Insufficient Balance");
            System.out.println(accountHolderName + " Balance = " + balance);
        }
    }


    @Override
    public void openAccount() {
        System.out.println("Savings Account Opened");
        displayAccountInfo();
    }

    @Override
    public void closeAccount() {
        System.out.println("Savings Account Closed");
    }


}
