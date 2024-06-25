package javaPractice.abstraction;

abstract class BankAccount  {
    protected String accountNumber;
    String accountHolderName;
    protected double balance;
    String accountType;
    String contactNumber;
    String email;

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType, String contactNumber, String email) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    void displayAccountInfo(){
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("accountHolderName = " + accountHolderName);
        System.out.println("balance = " + balance);
        System.out.println("accountType = " + accountType);
        System.out.println("contactNumber = " + contactNumber);
        System.out.println("email = " + email);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    abstract void withdraw(double amount);
}
