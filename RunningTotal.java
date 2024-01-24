// Name: RunningTotal.java
// Written by: Adam Frisch
// Written on: 9/12/22
// Purpose: Sum a series of numbers entered by the user with a while loop

// Import Scanner library for input
import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        // Declare Scanner object and initialize with
        // predefined standard input object, System.in
        Scanner keyboard = new Scanner(System.in);

        // Declare varibales for input and runnign total
        double runningTotal = 0;
        double number;

        // Print the heading and prompt
        System.out.println("+-----------------------------------+");
        System.out.println("|      Sum the entered numbers      |");
        System.out.println("+-----------------------------------+");

        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            // Get double from the keyboard
            // Assign double to a variable
            number = keyboard.nextDouble();
            // If the user types in the sentinel value 0
            // Break the loop
            if (number == 0) {
                break;
            }
            // Accumulate running total 
            runningTotal += number;    
       }
       // Display the running total
       System.out.println("The total is: " + runningTotal);

       keyboard.close();
    }
}
