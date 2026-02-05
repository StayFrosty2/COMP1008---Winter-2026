public class CommissionEmployee extends Employee {
 
    private double grossSales;
    private double commissionRate;
 

    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
 
    // TODO 6: Create getters and setters with validation
 
    // TODO 7: Override earnings()
 
    // TODO 8: Override toString()
}