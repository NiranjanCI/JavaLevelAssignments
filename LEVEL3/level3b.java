// Program to check if a number is an Armstrong number

import java.util.Scanner;

class level3b {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number
        int originalNumber = number;

        // Initialize sum
        int sum = 0;

        // Loop to extract digits
        while (number != 0) {

            int digit = number % 10;

            // Cube of digit
            sum += digit * digit * digit;

            number = number / 10;
        }

        // Check Armstrong condition
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number.");
        }

        // Close scanner
        input.close();
    }
}