/**
 * Level 1 D
 * To check if a number is natural number and find the sum of n natural numbers
 */

import java.util.Scanner;

class level1d {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number, sumOfNaturalNumbers;

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean condition to check if the number is a natural number
        boolean isNaturalNumber = number > 0;

        // Condition block
        if (isNaturalNumber) {
            sumOfNaturalNumbers = (number * (number +1) / 2);
            System.out.println("The sum of " + number + " natural number is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner object
        input.close();
    }
}