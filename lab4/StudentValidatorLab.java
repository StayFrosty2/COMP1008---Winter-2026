import java.util.*;
import java.util.regex.*;

public class StudentValidatorLab {

    // Checks if the character the user inputed was a vowel
    public static boolean isVowel(char c) {

            switch (c) {
                // If the char c is a vowel, return true
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
                return true;
            default:
                // else, return false
                return false;
        }
    }

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

        StringBuilder stId = new StringBuilder("S-");

        isValid = false;

        while(!isValid) {

            // STEP 3:
            // Ask user to enter student ID
            System.out.println("Please enter student id:");
            userInput = scanner.nextLine();

            // STEP 4:
            // Validate format using regex
            if (userInput.matches("^\\d{9}$")) {
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

        isValid = false;

        while(!isValid) {

            // STEP 5:
            // Ask user to enter email
            System.out.println("Please enter your student email:");
            userInput = scanner.nextLine();

            // STEP 6:
            // Validate email format
            if(userInput.matches("^[A-Za-z0-9+.-]+@[A-Za-z0-9+.-]+$")) {
                System.out.println("Valid email");
                isValid = true;
            }
            else {
                System.out.println("Invalid Email Format");
            }
        }

        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================

        // STEP 7:
        // Ask user to enter a sentence

        System.out.println("Please enter a sentence of any length:");
        userInput = scanner.nextLine();

        // STEP 8:
        // Count vowels using Character class

        int count = 0;

        for(int i = 0; i < userInput.length(); i++) {

            if(Character.isLetter(userInput.charAt(i))) {
                if(isVowel(userInput.charAt(i))) {
                    count = count + 1;
                }
            }
        }
        System.out.println("Amount of vowels: " + count);

        // STEP 9:
        // Reverse sentence using StringBuilder

        String[] userSentence = userInput.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : userSentence) {
            reversedSentence.append(word);
        }

        reversedSentence.reverse();

        System.out.println("Your sentence, but reversed:\n" + reversedSentence);

        // STEP 10:
        // Replace all digits in sentence with '*'

        userInput.replaceAll("\\d", "*");
        System.out.println("Your sentence, digits removed:\n" + userInput);

        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================

        // STEP 11:
        // Create string: "Math,Science,Java,English"
        String courses = "Math,Science,Java,English";

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