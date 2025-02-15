/*
 * Anton DeCesare Mod 8.2
 * This is a program that takes input from a user as integers, finds the max and displays it. It will return 0 if the list is empty.
 * It uses a while loop to transverse through the inputs given, makes an array list of it, and then calls the method max().
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeCesareArrayListTest {
    public static void main(String[] args) {
        // Scanner for our input
        Scanner scanner = new Scanner(System.in);
        // Initialize the array list with the "Integer" class and build a new array list
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop and include it in the list):");

        // Loop through inputs
        while (true) {
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        scanner.close();

        // Call the max method and display the result
        Integer maxValue = max(numbers);
        System.out.println("The largest number in the list is: " + maxValue);
    }

    public static Integer max(ArrayList<Integer> list) {
        // Check if the list is empty and return 0 if it is, otherwise return the maximum value in the array list
        return list.isEmpty() ? 0 : Collections.max(list);
    }
}
