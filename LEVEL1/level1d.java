// Program to calculate various trigonometric functions using Math class given an angle in degrees

import java.util.Scanner;

class level1d {
    // Method to calculate trigonometric functions (sine, cosine, tangent) and return as array
    public double[] calculateTrigonometricFunctions(double angleDegrees) {
        // Convert angle from degrees to radians
        double angleRadians = Math.toRadians(angleDegrees);
        
        // Calculate sine, cosine, and tangent
        double sineValue = Math.sin(angleRadians);
        double cosineValue = Math.cos(angleRadians);
        double tangentValue = Math.tan(angleRadians);
        
        // Return array with sine, cosine, and tangent
        double[] trigonometricResults = {sineValue, cosineValue, tangentValue};
        return trigonometricResults;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variable for angle in degrees
        double angleDegrees;
        
        // Take user input for angle in degrees
        System.out.print("Enter the angle in degrees: ");
        angleDegrees = scanner.nextDouble();
        
        // Create object of level1d class
        level1d calculator = new level1d();
        
        // Calculate trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angleDegrees);
        
        // Extract sine, cosine, and tangent from result array
        double sineValue = results[0];
        double cosineValue = results[1];
        double tangentValue = results[2];
        
        // Display the results
        System.out.println("\nTrigonometric values for angle " + angleDegrees + " degrees:");
        System.out.println("Sine(" + angleDegrees + "°) = " + sineValue);
        System.out.println("Cosine(" + angleDegrees + "°) = " + cosineValue);
        System.out.println("Tangent(" + angleDegrees + "°) = " + tangentValue);
        
        scanner.close();
    }
}