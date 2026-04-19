// Program to find sum of n natural numbers using recursive method and compare with formula n*(n+1)/2

import java.util.Scanner;

class level2b {
    // Recursive method to find sum of n natural numbers
    public long calculateSumRecursive(int number) {
        // Base case
        if (number == 1) {
            return 1;
        }
        // Recursive case
        return number + calculateSumRecursive(number - 1);
    }
    
    // Method to find sum of n natural numbers using formula n*(n+1)/2
    public long calculateSumUsingFormula(int number) {
        long sumUsingFormula = (long) number * (number + 1) / 2;
        return sumUsingFormula;
    }
    
    // Method to validate if number is a natural number
    public boolean isNaturalNumber(int number) {
        return number > 0;
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variable for number
        int number;
        
        // Take user input for number
        System.out.print("Enter a natural number: ");
        number = scanner.nextInt();
        
        // Create object of level2b class
        level2b sumCalculator = new level2b();
        
        // Validate if number is a natural number
        if (!sumCalculator.isNaturalNumber(number)) {
            System.out.println("Please enter a valid natural number (greater than 0)");
            scanner.close();
            return;
        }
        
        // Calculate sum using recursion
        long sumRecursive = sumCalculator.calculateSumRecursive(number);
        System.out.println("\nSum of first " + number + " natural numbers using Recursion: " + sumRecursive);
        
        // Calculate sum using formula
        long sumFormula = sumCalculator.calculateSumUsingFormula(number);
        System.out.println("Sum of first " + number + " natural numbers using Formula n*(n+1)/2: " + sumFormula);
        
        // Compare results
        if (sumRecursive == sumFormula) {
            System.out.println("\nBoth methods produce the SAME result: " + sumRecursive);
        } else {
            System.out.println("\nResults do NOT match!");
        }
        
        scanner.close();
    }
}
