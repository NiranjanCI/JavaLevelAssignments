// Program to print whether numbers are Odd or Even from 1 to user input

import java.util.Scanner;

class level2a {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {

            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                // Check if number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }

        } else {
            System.out.println("The number is not a natural number.");
        }

        // Close scanner
        input.close();
    }
}