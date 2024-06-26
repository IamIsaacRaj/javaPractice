package com.javapractice.oop;

public class CustomerMain {

    public static void main(String[] args) {

// a reference variable will be created on stack which points to object created on heap
       Customer customer;

       customer = new Customer(); //a new object will be created on Heap

        System.out.println("customer Id = " + customer.id);
        System.out.println("customer Name = " + customer.name);
        System.out.println("customer Email= " + customer.email);
        System.out.println("customer ContactNum = " + customer.contactNum);
        System.out.println("customer Salary = " + customer.salary);

        //Assigning details
        Customer customer1 = new Customer();
        customer1.id = 11;
        customer1.name = "customerName ";
        customer1.email = "customerName@email.com";
        customer1.contactNum = "+91-9603456032";
        customer1.salary = 25550;

        System.out.println("------customer Details--------");
        System.out.println("customer Id = " + customer1.id);
        System.out.println("customer Name = " + customer1.name);
        System.out.println("customer Email= " + customer1.email);
        System.out.println("customer ContactNum = " + customer1.contactNum);
        System.out.println("customer Salary = " + customer1.salary);

        Customer customer2 = new Customer();

        customer2.id = 22;
        customer2.name = "customerName22";
        customer2.email = "customerName22@email.com";
        customer2.contactNum = "+91-8702654789";
        customer2.salary = 45550;

        System.out.println("------customer2 Details--------");
        System.out.println("customer Id = " + customer2.id);
        System.out.println("customer Name = " + customer2.name);
        System.out.println("customer Email= " + customer2.email);
        System.out.println("customer ContactNum = " + customer2.contactNum);
        System.out.println("customer Salary = " + customer2.salary);

        Customer customer3 = new Customer();

        customer3.name = customer2.name;

        System.out.println("customer2 name = " + customer2.name);
        System.out.println("customer3 name = " + customer3.name);

        customer3.name = "customer3";

        System.out.println("customer3 name = " + customer3.name);

    }
}
