package javaPractice.constructors;

public class Customer {
    int id;
    String name;
    byte age;
    String email;
    String contactNum;
    int salary;

    final static String VENDOR_NAME = "XYZ Vendor";
    final static String VENDOR_CONTACTNO = "+91-9603254678";

    public static String getVendorName(){
        return VENDOR_NAME;
    }

    public static String getVendorContactno(){
        return VENDOR_CONTACTNO;
    }

//    Constructor
//    1.No Argument Constructor
    Customer(){
        System.out.println("Customer() is Called...");
        id = 33;
        name = "customerName33";
        age = 54;
        email = "customerName@email.com";
        contactNum = "+91-8803456369";
        salary = 65550;
    }

//    Constructor with Argument
    public Customer(int id, String name, byte age, String email, String contactNum, int salary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.contactNum = contactNum;
        this.salary = salary;
    }

//  Behavior[Methods]
//  1.without parameters and return type

    void displayCustomerDetails(){
        System.out.println("Customer Details");
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Email = " + email);
        System.out.println("ContactNum = " + contactNum);
        System.out.println("Salary = " + salary);
    }
    //  2. with Parameters and without return type
    void updateContactInfo( String newContactNum,String newEmail){
        contactNum = newContactNum;
        email = newEmail;
        System.out.println("Contact information Updated Successfully");
    }

    //  3.without Parameters and with return type
    byte discountPercentageByAge(){
        System.out.println( "discountPercentageByAge() is called....");
        byte discountPercentage = 0;
        if (age >= 50) {
            discountPercentage = 15;
        } else if (age >=40 && age < 50) {
            discountPercentage = 12;
        }else if (age >=30 && age < 40) {
            discountPercentage = 10;
        }else {
            discountPercentage = 5;
        }

        return discountPercentage;
    }
    //  4. with Parameters and with return type
    int updateSalary(int percentageIncrease) {
        salary += salary * percentageIncrease / 100;
        return salary;
    }
}
