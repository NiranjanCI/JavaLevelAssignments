import java.util.Scanner;

class level1a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        // Input ages
        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();

            // Validate
            if (ages[i] < 0) {
                System.err.println("Invalid age entered.");
                System.exit(0);
            }
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Age " + ages[i] + " can vote.");
            } else {
                System.out.println("Age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}