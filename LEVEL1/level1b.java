/**
 * Level 1b
 * Checks whether the first number is the smallest of the three numbers.
 */

import java.util.Scanner;

class level1b {
    public static void main(String[] args) {
        // Create scanner object to read input
        Scanner input = new Scanner(System.in);

        // Declare variables to hold the three numbers
        int number1, number2, number3;

        // Prompt the user to enter three numbers
        System.out.print("Enter first number: ");
        number1 = input.nextInt();  

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        // Boolean condition to check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Display the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the scanner
        input.close();
    }
}