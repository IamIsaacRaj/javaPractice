package javaPractice.abstraction;

public class BankAccountMain {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("ACCNO-1","Abi",467154.25,"Savings","+11-2256745231","abi5231@gmail.com",4.5);
        savingsAccount.displayAccountInfo();

        CheckingAccount checkingAccount = new CheckingAccount("ACCNO-2","Raghu",150000.25,"Checking","+11-365872231","Raghuvaran@gmail.com",100000.0);
        checkingAccount.displayAccountInfo();

        savingsAccount.openAccount();
        savingsAccount.deposit(25000.0);
        savingsAccount.addInterest();
        savingsAccount.withdraw(500.0);
        savingsAccount.closeAccount();

        checkingAccount.openAccount();
        checkingAccount.deposit(30000.0);
        checkingAccount.withdraw(20000.0);
        checkingAccount.closeAccount();


    }
}
