package ch5.oop;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 1000, .06);

        System.out.println("employee information obtained by get methods:");

        System.out.printf("%n%s %s%n", "first name is", employee.getFirstName());

        System.out.printf("%s %s%n", "last name is", employee.getLastName());

        System.out.printf("%s %s%n", "social security number is", employee.getSocialSecurityNumber());

        System.out.printf("%s %.2f%n", "gross sales is", employee.getGrossSales());

        System.out.printf("%s %.2f%n", "commission rate is", employee.getCommissionRate());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);

        System.out.printf("%n%s:%n%n%s%n", "updated employee information obtained by toString", employee);
    }

}
