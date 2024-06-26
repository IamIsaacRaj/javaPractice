package com.javapractice.constructors;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer;
        customer = new Customer(); //a new object will be created on Heap

        customer.displayCustomerDetails();

//      Assigning details
        Customer customer1 = new Customer();
        customer1.id = 11;
        customer1.name = "customerName11";
        customer1.age = 44;
        customer1.email = "customerName@email.com";
        customer1.contactNum = "+91-9603456032";
        customer1.salary = 25550;

        customer1.displayCustomerDetails();

        Customer customer2;
        customer2 = new Customer(22,"customerName22", (byte) 32,"customerName22@email.com","+91-8702654789",45550);

        customer2.displayCustomerDetails();

//  System.out.println(customer2.VENDOR_NAME); not recommended
        System.out.println("Vendor : " + Customer.VENDOR_NAME);
        System.out.println("Vendor Contact number : " + Customer.VENDOR_CONTACTNO);

/*
    customer2.VENDOR_NAME = "ABC Pvt Ltd"; gives error as vendor name is constant
    as it is declared with final keyword
*/
//  getVendorName(): This static method returns the constant VENDOR_NAME.

        System.out.println("Vendor : " + Customer.getVendorName());
        System.out.println("Vendor Contact number : " + Customer.getVendorContactno());

    }
}
