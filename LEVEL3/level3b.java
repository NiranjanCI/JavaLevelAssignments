import java.util.Scanner;

// Program to swap two numbers

class level3b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, temp;

        System.out.print("Enter First Number: ");
        number1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        number2 = input.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        input.close();
    }
}