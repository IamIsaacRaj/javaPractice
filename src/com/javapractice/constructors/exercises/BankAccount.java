package com.javapractice.constructors.exercises;

public class BankAccount {
    String accountHolderName;
    double balance;
    String accountType;
    String contactNumber;
    String email;

    final private static String BANK_Name = "ABC Bank";

    public static String getBankName(){
        return BANK_Name;
    }

    BankAccount(){
        accountHolderName = "Unknown";
        balance = 0.0;
        accountType = "Unknown";
        contactNumber = "Unknown";
        email = "Unknown";
    }

    public BankAccount(String accountHolderName, double balance, String accountType, String contactNumber, String email) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    void displayAccountDetails(){
        System.out.println("Bank Account Details :");
        System.out.println("AccountHolderName = " + accountHolderName);
        System.out.println("Balance = " + balance);
        System.out.println("accountType = " + accountType);
        System.out.println("contactNumber = " + contactNumber);
        System.out.println("email = " + email);
    }

    double deposit(double amount){
        balance += amount;
        return balance;
    }
     void withdraw(double amount) {
         if (amount <= balance) {
             balance -= amount;
             System.out.println(accountHolderName + " Balance =" + balance);
         } else {
             System.out.println("Insufficient Balance");
             System.out.println(accountHolderName + " Balance = " + balance);
         }
     }
}
