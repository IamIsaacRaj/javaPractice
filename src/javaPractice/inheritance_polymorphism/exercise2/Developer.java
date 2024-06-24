package javaPractice.inheritance_polymorphism.exercise2;

public class Developer extends Employee {

    double fixedBonus;

    public Developer(){
        super();
    }

    public Developer(int employeeId, String employeeName, char gender, byte age, double salary, double fixedBonus) {
        super(employeeId, employeeName, gender, age, salary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculateBonus(){
        return fixedBonus;
    }

    public double calculateTotalSalary() {
        return salary + fixedBonus;
    }

    void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("fixedBonus = " + fixedBonus);
        System.out.println("calculated bonus = " + calculateBonus());
        System.out.println("Salary with bonus = " + calculateTotalSalary());
    }

}
