/**
 * Level 1 C
 * To check if a person is elligible to vote or not
 */

import java.util.Scanner;

class level1c {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the age of the person
        int age;

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        age = input.nextInt();

        // Boolean variable to check if the person is eligible to vote
        boolean isEligibleToVote = age >= 18;

        // Conditional statement to check if the person is eligible to vote
        if (isEligibleToVote) {
            System.out.println("This person age is " + age + " and can vote.");
        } else {
            System.out.println("This person age is " + age + " and cannot vote.");
        }

        // Close the Scanner object
        input.close();
    }
}