import java.util.Scanner;

// Program to compute area of triangle

class level2b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double baseCm, heightCm;
        double areaSquareCm, areaSquareInch;
        double conversionFactor = 2.54;

        System.out.print("Enter Base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter Height in cm: ");
        heightCm = input.nextDouble();

        areaSquareCm = 0.5 * baseCm * heightCm;

        double baseInch = baseCm / conversionFactor;
        double heightInch = heightCm / conversionFactor;

        areaSquareInch = 0.5 * baseInch * heightInch;

        System.out.println("The Area of the triangle in sq in is "
                + areaSquareInch + " and sq cm is " + areaSquareCm);

        input.close();
    }
}