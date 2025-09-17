/**
 * Name: David Garcia Ramirez
 * Date: 9/10/2025
* Purpose: InClass 3 - 
* A user will input the length of a cube and the program will output the volume and surface area.
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;

public class InClass3_David_GarciaRamirez
{
    public static void main(String[] args) 
    {
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        Scanner input = new Scanner(System.in);
        System.out.print("Input length: ");

        // Step 2: Read the user's input and store it in a variable.
        double side = input.nextDouble();

        // Step 3: Use an appropriate method to determine the volume of the cube.
        double volume = Math.pow(side, 3);

        // Step 4: Use an appropriate method to determine the surface area of the cube.
        double surfaceArea = 6 * Math.pow(side, 2);

        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("Volume is: " + volume);
        System.out.println("Surface area is: " + surfaceArea);

    }
}