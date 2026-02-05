public class CommissionEmployee extends Employee {
    // Variable delcaration
    private double grossSales;
    private double commissionRate;
 
    // Constructor for Object
    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
 
    // Methods to set variables
    public void setGrossSales(double sales) {
        if (sales < 0.0) throw new IllegalArgumentException("Gross sales must be above or equal to 0.0");
        grossSales = sales;
    }
    public void setCommissionRate(double rate) {
        if (rate <= 0.0 || rate >= 1.0) throw new IllegalArgumentException("Commission rate must be above 0.0 and below 1.0");
        commissionRate = rate;
    }

    // Methods to get variables
    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }
    // TODO 7: Override earnings()
 
    // TODO 8: Override toString()
}