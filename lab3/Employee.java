public abstract class Employee {
 
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
 
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSIN() { return socialSecurityNumber; }
    // TODO 3: Declare abstract method earnings()
 
    // TODO 4: Override toString()
}