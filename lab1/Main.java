package Assignments.lab1;

import java.util.Scanner;
 
// Student Name: Cameron Yon-Vachon

/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/
 
 
public class Main {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */

        String weatherCondition;
        String precipitation;
        String windSpeed;
        int highTemp;
        int lowTemp;
        int uvIndex;

        // Additional Variable to catch User's Input
        String userInput;
 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
 
        System.out.println("\n ---Today's Weather---");
        System.out.println("Please input the forecast for today:");
        weatherCondition = input.nextLine();

        System.out.println("Please input the chance for precipitation (Note: you don't need to enter the % symbol):");
        precipitation = input.nextLine();

        System.out.println("Please input the Wind Speed:");
        windSpeed = input.nextLine();

        System.out.println("Please enter the highest temperature for the day (as an integer, no decimal):");
        userInput = input.nextLine();
        highTemp = Integer.valueOf(userInput);

        System.out.println("Please enter the lowest temperature for the day (as an integer, no decimal):");
        userInput = input.nextLine();
        lowTemp = Integer.valueOf(userInput);

        System.out.println("Please enter the UV Index (as an integer, no decimal):");
        userInput = input.nextLine();
        uvIndex = Integer.valueOf(userInput);


        // TODO: Use loops to validate high/low temperatures and UV index
        if(highTemp < -40)
        {
            while(highTemp < -40)
            {
                System.out.println("Error: High Temperature below System Limit, please re-enter Highest Temp (cannot go below -40):");
                userInput = input.nextLine();
                highTemp = Integer.valueOf(userInput);
            }
        }
        if(lowTemp > 40)
        {
            while(lowTemp < 40)
            {
                System.out.println("Error: Low Temperature above System Limit, please re-enter Lowest Temp (cannot go above 40):");
                userInput = input.nextLine();
                lowTemp = Integer.valueOf(userInput);
            }
        }
        if(uvIndex > 10 || uvIndex < 0)
        {
            while(uvIndex > 10 || uvIndex < 0)
            {
                System.out.println("Error: UV Index must be a number between 0 and 10. Please re-enter UV Index:");
                userInput = input.nextLine();
                lowTemp = Integer.valueOf(userInput);
            }
        }
 
 
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
        

        // Type Casting not required/already completed. Skipping to next step.
 
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */


        if(weatherCondition.equalsIgnoreCase("Sunny"))
        {
            System.out.println("It's a beautiful day outside!");
        }
 
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
 
 
        /*
        STEP 6: Print the full weather report
        */
 
 
        // TODO: Output your report using System.out.println()
 
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
