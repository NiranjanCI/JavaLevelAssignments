// Program to find the maximum number of handshakes among students

import java.util.Scanner;

class level1b {
    // Method to calculate the maximum number of handshakes using combination formula
    public long calculateMaximumHandshakes(int numberOfStudents) {
        // Formula: handshakes = n * (n - 1) / 2
        long maximumHandshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;
        return maximumHandshakes;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variable for number of students
        int numberOfStudents;
        
        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        numberOfStudents = scanner.nextInt();
        
        // Create object of level1b class
        level1b handshakes = new level1b();
        
        // Calculate maximum handshakes
        long maximumHandshakes = handshakes.calculateMaximumHandshakes(numberOfStudents);
        
        // Display the result
        System.out.println("\nThe maximum number of possible handshakes among " + numberOfStudents + 
                           " students is: " + maximumHandshakes);
        
        scanner.close();
    }
}