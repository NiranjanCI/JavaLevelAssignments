import java.util.Scanner;

class level1d {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;

        int index = 0;

        System.out.println("Enter numbers (0 or negative to stop):");

        while (true) {

            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            if (index == numbers.length) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Total = " + total);

        input.close();
    }
}