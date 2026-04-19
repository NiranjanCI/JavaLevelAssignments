import java.util.Scanner;

// Program to find frequency of each digit in a number using array
class level3a {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid number.");
            System.exit(0);
        }

        // Handle special case when number is 0
        if (number == 0) {
            System.out.println("Digit 0 appears 1 time.");
            input.close();
            return;
        }

        // Step 1: Count digits
        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Step 3: Create frequency array (0–9 digits)
        int[] frequency = new int[10];

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Step 4: Display frequency
        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

        // Close scanner
        input.close();
    }
}