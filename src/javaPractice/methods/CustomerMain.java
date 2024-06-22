package javaPractice.methods;

public class CustomerMain {
    public static void main(String[] args) {

// a reference variable will be created on stack which points to object created on heap
        Customer customer;
        customer = new Customer(); //a new object will be created on Heap

        customer.displayCustomerDetails();

        //Assigning details
        Customer customer1 = new Customer();
        customer1.id = 11;
        customer1.name = "customerName11";
        customer1.age = 44;
        customer1.email = "customerName@email.com";
        customer1.contactNum = "+91-9603456032";
        customer1.salary = 25550;

        System.out.println("------customer1 Details--------");
        customer1.displayCustomerDetails();
        customer1.updateContactInfo("+91-9854672340","updatedemail@gmail,com");
        customer1.displayCustomerDetails();

        Customer customer2 = new Customer();

        customer2.id = 22;
        customer2.name = "customerName22";
        customer2.age = 32;
        customer2.email = "customerName22@email.com";
        customer2.contactNum = "+91-8702654789";
        customer2.salary = 45550;

        System.out.println("------customer2 Details--------");
        customer2.displayCustomerDetails();
        byte discountPercentage = customer2.discountPercentageByAge();
        System.out.println(customer2.name + "'s Discount Percentage is " + discountPercentage);
        System.out.println(customer1.name + "'s Discount Percentage is " + customer1.discountPercentageByAge());

        System.out.println(customer2.name + "'s Salary before incrementing = " + customer2.salary);
        int percentage = 8;
        double updatedSalary = customer2.updateSalary(percentage);
        System.out.println(customer2.name + "'s Salary After " + percentage + "% Incrementing = " + updatedSalary);

    }
}
