import java.util.Scanner;

/**
 * Program: Week2
 * File: TemperatureConversion.java
 * Summary: Programming Exercise 2, #2. Converts a Fahrenheit temperature to Celsius and then back.
 * Author: Chase Hausman
 * Date: February 25, 2018
 */
public class TemperatureConversion {
    public static void main(String args[]) {
        // Setup Scanner to get user input
        Scanner kb = new Scanner(System.in);

        // Prompt for a temperature
        System.out.println("Please Enter a Temperature in Fahrenheit: ");

        // Get temp to convert as the next float in the entered text
        float fToCInput = kb.nextFloat();

        // Convert the input
        double fToCTemp = (fToCInput - 32) * (5.0 / 9.0);

        // Output in a human readable format.
        System.out.println(fToCInput+"F is equivalent to "+fToCTemp+"C.");

        // Prompt for a new temperature
        System.out.println("Now Please Enter a Temperature in Celsius: ");

        // Get temp to convert
        float cToFInput = kb.nextFloat();

        // Make conversion
        double cToFTemp = (cToFInput * (9.0 / 5.0)) + 32;

        // Output in a human readable format
        System.out.println(cToFInput+"C is equivalent to "+cToFTemp+"F.");
    }
}
