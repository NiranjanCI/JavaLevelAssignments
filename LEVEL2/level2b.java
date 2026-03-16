// Program to print multiplication table from 6 to 9

import java.util.Scanner;

class level2b {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 6 to 9
        for (int i = 6; i <= 9; i++) {

            int result = number * i;

            // Print multiplication
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close scanner
        input.close();
    }
}