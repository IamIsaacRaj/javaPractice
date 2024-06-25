package javaPractice.abstraction;

public class CheckingAccount extends BankAccount implements AccountServices {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, String accountType, String contactNumber, String email, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, accountType, contactNumber, email);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("overdraftLimit = " + overdraftLimit);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void openAccount() {
        System.out.println("Checking Account Opened");
        displayAccountInfo();
    }

    @Override
    public void closeAccount() {
        System.out.println("Checking Account Closed");
    }

}
