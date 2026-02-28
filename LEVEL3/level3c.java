import java.util.Scanner;

// Program to calculate Simple Interest

class level3c {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double principal, rate, time, simpleInterest;

        System.out.print("Enter Principal: ");
        principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = input.nextDouble();

        System.out.print("Enter Time: ");
        time = input.nextDouble();

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of interest" + rate +
                " and Time " + time);

        input.close();
    }
}