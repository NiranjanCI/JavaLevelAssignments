// Program to calculate Simple Interest

import java.util.Scanner;

class level1a {
    // Method to calculate simple interest given principal, rate, and time
    public double calculateSimpleInterest(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for principal, rate, and time
        double principal;
        double rateOfInterest;
        double timeInYears;
        
        // Take user input for principal
        System.out.print("Enter the Principal amount: ");
        principal = scanner.nextDouble();
        
        // Take user input for rate of interest
        System.out.print("Enter the Rate of Interest (per annum): ");
        rateOfInterest = scanner.nextDouble();
        
        // Take user input for time in years
        System.out.print("Enter the Time (in years): ");
        timeInYears = scanner.nextDouble();
        
        // Create object of level1a class
        level1a calculator = new level1a();
        
        // Calculate simple interest
        double simpleInterest = calculator.calculateSimpleInterest(principal, rateOfInterest, timeInYears);
        
        // Display the result
        System.out.println("\nThe Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rateOfInterest + "% and Time " + timeInYears + " years");
        
        scanner.close();
    }
}