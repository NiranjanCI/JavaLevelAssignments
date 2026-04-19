// Program to find the factors of a number, store in array, and calculate sum, sum of squares, and product

import java.util.Scanner;

class level2a {
    // Static method to find factors of a number and return array
    public static int[] findFactors(int number) {
        // First loop to count the factors
        int factorCount = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }
        
        // Initialize array with the count of factors
        int[] factors = new int[factorCount];
        
        // Second loop to store factors in array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }
    
    // Method to find the sum of factors
    public int calculateSumOfFactors(int[] factors) {
        int sumOfFactors = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfFactors += factors[i];
        }
        return sumOfFactors;
    }
    
    // Method to find the product of factors
    public long calculateProductOfFactors(int[] factors) {
        long productOfFactors = 1;
        for (int i = 0; i < factors.length; i++) {
            productOfFactors *= factors[i];
        }
        return productOfFactors;
    }
    
    // Method to find the sum of squares of factors
    public long calculateSumOfSquares(int[] factors) {
        long sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variable for number
        int number;
        
        // Take user input for number
        System.out.print("Enter a number to find factors: ");
        number = scanner.nextInt();
        
        // Create object of level2a class
        level2a factorFinder = new level2a();
        
        // Find factors
        int[] factors = findFactors(number);
        
        // Display factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        
        // Calculate and display sum of factors
        int sumOfFactors = factorFinder.calculateSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);
        
        // Calculate and display product of factors
        long productOfFactors = factorFinder.calculateProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);
        
        // Calculate and display sum of squares of factors
        long sumOfSquares = factorFinder.calculateSumOfSquares(factors);
        System.out.println("Sum of Squares of Factors: " + sumOfSquares);
        
        scanner.close();
    }
}
