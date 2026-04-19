// Program to find the smallest and largest of 3 numbers

import java.util.Scanner;

class level1c {
    // Method to find the smallest and largest of three numbers and return as array
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Initialize smallest and largest with first number
        int smallest = number1;
        int largest = number1;
        
        // Find smallest and largest among the three numbers
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }
        
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        // Return array with smallest and largest
        int[] result = {smallest, largest};
        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for three numbers
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        
        // Take user input for first number
        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        
        // Take user input for second number
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
        
        // Take user input for third number
        System.out.print("Enter the third number: ");
        thirdNumber = scanner.nextInt();
        
        // Call method to find smallest and largest
        int[] result = findSmallestAndLargest(firstNumber, secondNumber, thirdNumber);
        
        // Extract smallest and largest from result array
        int smallest = result[0];
        int largest = result[1];
        
        // Display the results
        System.out.println("\nAmong " + firstNumber + ", " + secondNumber + ", and " + thirdNumber);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}