// Cameron Yon-Vachon
import java.util.Scanner;

public class PayrollTest {
 
    public static void main(String[] args) {
 
        
        // Create a new Scanner
        Scanner keyedInput = new Scanner(System.in);

        // Variables to capture user's input
        String firstName;
        String lastName;
        String ssn;
        double sales;
        double rate;
        
        // Prompt user to enter in their employee details
        System.out.println("Commission Employee Registration:\nPlease enter your first name:");
        firstName = keyedInput.nextLine();

        System.out.println("Please enter your last name:");
        lastName = keyedInput.nextLine();

        System.out.println("Please enter your Social Security Number (SSN):");
        ssn = keyedInput.nextLine();

        System.out.println("Please enter your Gross Sales (as a decimal number):");
        sales = keyedInput.nextDouble();

        System.out.println("Please enter your commission rate:");
        rate = keyedInput.nextDouble();


        System.out.println("Creating employee profile, please wait:");
        CommissionEmployee newEmployee = new CommissionEmployee(firstName, lastName, ssn, sales, rate);
 

        // Display employee details
        System.out.println(newEmployee.toString());

        // Display employee earnings
        System.out.println("Overall Earnings: " + newEmployee.earnings());

        keyedInput.close();
    }
}