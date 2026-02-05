public abstract class Employee {
    // Declare Variables
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Construct Object
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Methods to get each variable
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSSN() { return socialSecurityNumber; }

    // Delcare abstract
    public abstract double earnings();
 
    // Override the to string method and create a formatted string
    @Override
    public String toString() {
        return String.format("%s %s%nSocial Security Number: %s",
            getFirstName(), getLastName(), getSSN()
        );
    }
}