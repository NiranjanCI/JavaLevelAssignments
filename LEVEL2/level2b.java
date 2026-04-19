import java.util.Scanner;

class level2b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validation
        if (number < 0) {
            System.err.println("Invalid number.");
            System.exit(0);
        }

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Extract digits
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);

        input.close();
    }
}