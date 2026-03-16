// Program to find factors of a number

import java.util.Scanner;

class level2c {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to number
            for (int i = 1; i < number; i++) {

                // Check divisibility
                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close scanner
        input.close();
    }
}