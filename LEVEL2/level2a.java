import java.util.Scanner;

class level2a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input
        for (int i = 0; i < salary.length; i++) {

            System.out.println("Enter salary and years of service for employee " + (i + 1));

            salary[i] = input.nextDouble();
            years[i] = input.nextDouble();

            // Validation
            if (salary[i] <= 0 || years[i] < 0) {
                System.err.println("Invalid input. Enter again.");
                i--; // retry same index
                continue;
            }
        }

        // Calculation
        for (int i = 0; i < salary.length; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\nTotal Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        input.close();
    }
}