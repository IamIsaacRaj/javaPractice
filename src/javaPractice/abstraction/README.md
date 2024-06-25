# Banking System in Java

## Overview

This is a simple representation of a banking system in Java, 
demonstrating the principles of abstraction using abstract classes and
interfaces. The system includes different types of bank accounts, 
such as Savings Accounts and Checking Accounts, each with specific 
behaviors and properties.

## Structure

The project consists of the following main components:

1. **Abstract Class `BankAccount`**:
    - Serves as a base class for different types of bank accounts.
    - Contains common properties such as  `dispalyAccountInfo`.
    - Provides common methods like `deposit()` and an abstract method `withdraw()` that must be implemented by subclasses.

2. **Concrete Classes `SavingsAccount` and `CheckingAccount`**:
    - **SavingsAccount**:
        - Extends `BankAccount`.
        - Includes an additional property `interestRate`.
        - Implements the `withdraw()` method to handle withdrawals within the available balance.
        - Adds a method `addInterest()` to calculate and add interest to the balance.
    - **CheckingAccount**:
        - Extends `BankAccount`.
        - Includes an additional property `overdraftLimit`.
        - Implements the `withdraw()` method to handle withdrawals within the available balance plus overdraft limit.

3. **Interface `AccountServices`**:
    - Declares methods `openAccount()` and `closeAccount()` that must be implemented by all account types.
    - Ensures all account classes provide implementations for these methods.

## Classes and Methods

### Abstract Class: `BankAccount`

- **Properties**:
    - `accountNumber`: A unique identifier for the account.
    - `accountHolderName`: The name of the account holder.
    - `accountType`: The type of the account (e.g., Savings, Checking).
    - `balance`: The current balance of the account.
    - `email`: The email address of the account holder.
    - `contactNum`: The contact number of the account holder.
- **Constructor**:
    - Initializes the account with above properties.
- **Methods**:
    - `getBalance()`: Returns the current balance.
    - `deposit(amount)`: Adds the specified amount to the balance.
    - `withdraw(amount)`: Abstract method to be implemented by subclasses to handle withdrawals.

### Concrete Class: `SavingsAccount`

- **Properties**:
    - Inherits properties from `BankAccount`.
    - `interestRate`: The interest rate applicable to the savings account.
- **Constructor**:
    - Initializes the account with an account number, an initial balance, and an interest rate.
- **Methods**:
    - `addInterest()`: Calculates interest based on the interest rate and adds it to the balance.
    - `withdraw(amount)`: Checks if the amount is within the available balance before withdrawing.

### Concrete Class: `CheckingAccount`

- **Properties**:
    - Inherits properties from `BankAccount`.
    - `overdraftLimit`: The maximum overdraft limit allowed for the account.
- **Constructor**:
    - Initializes the account with an account number, an initial balance, and an overdraft limit.
- **Methods**:
    - `withdraw(amount)`: Checks if the amount is within the available balance plus overdraft limit before withdrawing.

### Interface: `AccountServices`

- **Methods**:
    - `openAccount()`: Method to handle opening an account.
    - `closeAccount()`: Method to handle closing an account.

## Example Usage

### `BankAccountMain` Class

- **Functionality**:
    - Demonstrates the creation and operations on `
      SavingsAccount` and `CheckingAccount`.
    - Performs actions like displaying account details, opening accounts, depositing money, adding interest, withdrawing money, and closing accounts.

## How to Run

1. Ensure you have a Java development environment set up (JDK installed).
2. Compile the Java files using `javac`.
3. Run the `Main` class to see the example output.

## Summary

This code demonstrates the use of abstraction in Java by creating a simplified banking system. 
It highlights how abstract classes and interfaces can be used to define 
common behaviors and enforce specific functionalities across different
types of accounts. The system is extendable, allowing for the addition
of new account types with minimal changes to the existing codebase.

## Acknowledgements

Special thanks to Madhu Samala Sir, a trainer from Training Mug YouTube channel, for teaching about abstraction in Day 11 of the Java Fundamentals live classes. You can find the class here: [Java Fundamentals Live Class - Day 11](https://www.youtube.com/live/LMb9N9lzrvk?si=dHhY8bmvuXBwEXMm).

For more resources and tutorials from Madhu Samala, visit his GitHub profile: [Madhu Samala GitHub](https://github.com/madhusamala-dev).

Thank you to OpenAI and Madhu Samala Sir for their valuable contributions.
Thanks for the assistance of ChatGPT, a language model created by OpenAI. ChatGPT provided guidance and explanations to help implement the abstraction principles in Java.

