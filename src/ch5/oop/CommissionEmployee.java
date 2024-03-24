package ch5.oop;

public class CommissionEmployee extends Object {
    private double grossSales;
    private String lastName;
    private String firstName;
    private String socialSecurityNumber;
    private double commissionRate;

    public CommissionEmployee(String firstName,String lastName,
         String socialSecurityNumber,double grossSales, double commissionRate) {

        if (grossSales<0.0){
            throw new IllegalArgumentException("gross sales must be>=0.0");
        }
        if (commissionRate<=0.0 || commissionRate>=1.0){
            throw new IllegalArgumentException("commission rate must be >0.0 and <1.0");
        }

        this.grossSales = grossSales;
        this.lastName = lastName;
        this.firstName = firstName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales<0.0){
            throw new IllegalArgumentException("gross sales must be >=0.0");
        }
        this.grossSales = grossSales;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate<=0.0 || commissionRate>=1.0){
            throw  new IllegalArgumentException("commission rate must be >0.0 and <1.0");
        }

        this.commissionRate = commissionRate;
    }


    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }
    @Override
    public String toString(){
        return  String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
