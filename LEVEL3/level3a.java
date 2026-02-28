import java.util.Scanner;

// Program to convert Celsius to Fahrenheit

class level3a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius;
        double fahrenheitResult;

        System.out.print("Enter Temperature in Celsius: ");
        celsius = input.nextDouble();

        fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius +
                " celsius is " + fahrenheitResult + " fahrenheit");

        input.close();
    }
}