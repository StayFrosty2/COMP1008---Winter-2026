import java.util.*;
import java.util.regex.*;

public class StudentValidatorLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================

        String userInput = "";
        boolean isValid = false;

        while (!isValid) {
            // STEP 1:
            // Ask user to enter full name
            System.out.println("Please enter your first and last name:");

            userInput = scanner.nextLine();

            // STEP 2:
            // Validate name
            // Only letters and spaces allowed
            // Use regex with matches()
            if (userInput.matches("^[A-Za-z]+ [A-Za-z]+$")) {
                System.out.println("Name is valid.");
                isValid = true;
            }
            else {
                System.out.println("Name is invalid.");
            }
        }
        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================

        // STEP 3:
        // Ask user to enter student ID

        StringBuilder stId = new StringBuilder("S-");

        System.out.println("Please enter student id:");

        // STEP 4:
        // Validate format using regex
        isValid = false;

        while(!isValid) {
            userInput = scanner.nextLine();

            if (userInput.matches("^\\d{10}$")) {
                System.out.println("Valid Student ID");
                isValid = true;
            }
            else {
                System.out.println("Invalid Student ID format");
            }
        }

        stId.append(userInput);

        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================

        // STEP 5:
        // Ask user to enter email

        // STEP 6:
        // Validate email format

        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================

        // STEP 7:
        // Ask user to enter a sentence

        // STEP 8:
        // Count vowels using Character class

        // STEP 9:
        // Reverse sentence using StringBuilder

        // STEP 10:
        // Replace all digits in sentence with '*'

        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================

        // STEP 11:
        // Create string: "Math,Science,Java,English"
        // Split using comma
        // Print each course

        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================

        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers

        scanner.close();
    }
}