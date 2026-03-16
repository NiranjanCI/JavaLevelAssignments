/** 
 * Level1A
 * Checks whether a given number is divisible by 5
*/  

import java.util.Scanner;

class level1a {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the user input
        int number;

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean variable to check if the number is divisible by 5
        boolean isDivisibleBy5 = (number % 5 == 0);

        // Display the result
        System.out.println("Is the number" + number + " divisible by 5? " + isDivisibleBy5);

        // Close the Scanner object
        input.close();
    }
}