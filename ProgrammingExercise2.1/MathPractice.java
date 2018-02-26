import java.util.Scanner;

/**
 * Program: Week2
 * File: MathPractice.java
 * Summary: Programming Exercise 2, #1. Finds the sum of the digits of a 5-digit positive integer.
 * Author: Chase Hausman
 * Date: February 25, 2018
 */
public class MathPractice {
    public static void main(String args[]) {
        System.out.println("Welcome! Please enter a 5-digit positive integer: ");

        // Setup Scanner to get user input
        Scanner kb = new Scanner(System.in);

        // Store the first integer we get from the Scanner
        int theInt = kb.nextInt();

        int digitFive = theInt % 10; // Find the first (last) digit
        theInt = theInt / 10; // Remove the first digit from the given integer

        // Repeat finding then extracting digits four more times
        int digitFour = theInt % 10;
        theInt = theInt / 10;

        int digitThree = theInt % 10;
        theInt = theInt / 10;

        int digitTwo = theInt % 10;
        theInt = theInt / 10;

        int digitOne = theInt % 10;
        theInt = theInt / 10;

        // Sum all of the digits
        int total = digitOne + digitTwo + digitThree + digitFour + digitFive;

        // Output in a human readable format
        System.out.println("The sum of the digits is "+digitFive+" + "+digitFour+" + "+digitThree+" + "+digitTwo+" + "+digitOne+" = "+total);
    }
}
