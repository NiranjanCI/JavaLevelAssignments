// Program to check whether a number is prime

import java.util.Scanner;

class level3a {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Boolean variable to track prime status
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {

            // Loop to check divisibility
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close scanner
        input.close();
    }
}