package javaPractice.inheritance_polymorphism;

public class PremiumCustomer extends Customer {

    String membershipType;
//  No-Arg Constructor
    public PremiumCustomer(){
        super();
        this.membershipType = "Silver";
    }

    public PremiumCustomer(int id, String name, byte age, String email, String contactNum, int salary, String membershipType) {
        super(id, name, age, email, contactNum, salary);
        this.membershipType = membershipType;
    }

    void displayPremiumCustomerDetails(){
        displayCustomerDetails(); // calls the Superclass method
        System.out.println("membershipType = " + membershipType);
    }
    
//    Method Overriding in the subclass provides specific behavior for the
//    subclass while maintaining the same method signature as the superclass.
    @Override
    byte discountPercentageByAge() {
        System.out.println("discountPercentageByAge() in PremiumCustomer is called....");
        byte discountPercentage = super.discountPercentageByAge(); // Calls the superclass method

        // Premium customers get an additional discount based on membership type
        if ("Gold".equalsIgnoreCase(membershipType)) {
            discountPercentage += 10;
        } else if ("Silver".equalsIgnoreCase(membershipType)) {
            discountPercentage += 5;
        }

        return discountPercentage;
    }
}
