package com.javapractice.inheritance_polymorphism;

public class CustomerMain {
    public static void main(String[] args) {
        // Creating an array of Customer references
        Customer[] customers = new Customer[3];

        // Adding Customer and PremiumCustomer objects
        customers[0] = new Customer(101, "Alice", (byte) 28, "alice@example.com", "+91-9876543210", 50000);
        customers[1] = new PremiumCustomer(202, "Bob", (byte) 45, "bob@example.com", "+91-8765432109", 75000, "Gold");
        customers[2] = new PremiumCustomer(203, "Carol", (byte) 37, "carol@example.com", "+91-8765432100", 65000, "Silver");

        // Displaying customer details and discount percentages using polymorphism
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
            byte discount = customer.discountPercentageByAge();
            System.out.println("Discount Percentage: " + discount + "%");
            System.out.println("-----------------------------");
        }
    }
}
