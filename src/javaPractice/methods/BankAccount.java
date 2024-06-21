package javaPractice.methods;

public class BankAccount {
    String accountHolderName;
    double balance;
    String accountType;
    String contactNumber;
    String email;

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
     void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println(accountHolderName + " Balance =" + balance);
        }else{
            System.out.println("Insufficient Balance" );
            System.out.println(accountHolderName + " Balance = " + balance);
        }

    }
}

