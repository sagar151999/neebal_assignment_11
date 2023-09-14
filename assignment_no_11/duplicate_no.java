/*
 * Write a Java program that reads a list of integers from the user and throws an
exception if any numbers are duplicates.
Input the Integers 1 2 3 3 4 5
Error: Duplicate number found: 3
Input 1 2 3 4 5 6
No duplicate numbers!
 */

package assignment_no_11;

import java.util.Scanner;

public class duplicate_no {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input the integers (separated by spaces): ");
        String inputLine = scanner.nextLine();
        String[] inputTokens = inputLine.split(" ");

        boolean hasDuplicate = false;

        for (int i = 0; i < inputTokens.length; i++) {
            try {
                int number1 = Integer.parseInt(inputTokens[i]);
                for (int j = 0; j < i; j++) {
                    int number2 = Integer.parseInt(inputTokens[j]);
                    if (number1 == number2) {
                        System.out.println("Error: Duplicate number found: " + number1);
                        hasDuplicate = true;
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + inputTokens[i] + " is not a valid integer.");
            }

            if (hasDuplicate) {
                break;
            }
        }

        if (!hasDuplicate) {
            System.out.println("No duplicate numbers!");
        }

        scanner.close();
    }
}