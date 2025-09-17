/**
 * Name: David Garcia Ramirez
 * Date: 9/10/2025
* Purpose: LabClass 3 - 
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class Lab3_David_GarciaRamirez
{
    public static void main(String[] args) 
    {
        // Declare scanner
        Scanner input = new Scanner(System.in);

        // Declare variables
        double initialValue;
        int years;
        double rate;
        double finalValue;

        // Get the user inputs
        System.out.print("Input initial home value: ");
        initialValue = input.nextDouble();
        System.out.print("Input amount of years passed: ");
        years = input.nextInt();
        System.out.print("Input interest rate: ");
        rate = input.nextDouble();

        // Convert interest rate to decimal, then calculate the final value
        rate = rate / 100;
        finalValue = initialValue * Math.pow(1 + rate, years);

        // Output the final value
        System.out.println("The final value is: " + finalValue);

    }
}