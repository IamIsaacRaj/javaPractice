package javaPractice.methods;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount account;
        account = new BankAccount();

        account.accountHolderName = "Joe";
        account.balance = 200154.25;
        account.accountType = "Current";
        account.contactNumber = "+11-2548691475";
        account.email = "joe7411@gmail.com";

        BankAccount account1;
        account1 = new BankAccount();

        account1.accountHolderName = "Abi";
        account1.balance = 467154.25;
        account1.accountType = "Savings";
        account1.contactNumber = "+11-2256745231";
        account1.email = "abi5231@gmail.com";

        account.displayAccountDetails();
        account1.displayAccountDetails();

        double totalBalance = account.deposit(25000);
        System.out.println(account.accountHolderName + " Balance = " + totalBalance);

        account1.withdraw(250000);



    }
}
