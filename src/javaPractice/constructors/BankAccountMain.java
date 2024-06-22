package javaPractice.constructors;

public class BankAccountMain {
    public static void main(String[] args) {

//  getBankName(): This static method returns the constant BANK_NAME.
        System.out.println("Bank Name : " + BankAccount.getBankName());

        BankAccount account;
        account = new BankAccount();

        account.displayAccountDetails();

        BankAccount account0;
        account0 = new BankAccount();

        account0.displayAccountDetails();

        account0.accountHolderName = "Joe";
        account0.balance = 200154.25;
        account0.accountType = "Current";
        account0.contactNumber = "+11-2548691475";
        account0.email = "joe7411@gmail.com";

        BankAccount account1;
        account1 = new BankAccount("Abi",467154.25,"Savings","+11-2256745231","abi5231@gmail.com");

        account1.displayAccountDetails();

        double totalBalance = account0.deposit(25000);
        System.out.println(account0.accountHolderName + " Balance = " + totalBalance);

        account1.withdraw(250000);
    }
}
