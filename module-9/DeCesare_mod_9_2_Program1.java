import java.util.*;

public class DeCesare_mod_9_2_Program1 {
    public static void main(String[] args){
        // Create and populate an ArrayList with 10 strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Javascript");
        words.add("Python");
        words.add("Kotlin");
        words.add("Swift");
        words.add("Ruby");
        words.add("C++");
        words.add("Rust");
        words.add("Haskell");
        words.add("Typescript");

        // Use a for each loop to iterate over the words and display them
        for(String word: words){
            System.out.println(word);
        }

        // Initialize the scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose which element to revisit
        System.out.println("Enter the index of the word you want to revisit (0-" + (words.size() - 1) + "): ");
        String userInput = scanner.nextLine();

        // Check if the user input is valid
        try {
            // Auto- unboxing: converting the string to an integer
            int index = Integer.parseInt(userInput);

            // Attempt to print out the result
            System.out.println("Revisited word: " + words.get(index));
        } catch (IndexOutOfBoundsException ex) {
            //Handling out - of - bounds input
            System.out.println("Invalid input. Please enter a valid number between 0 and " + (words.size()-1) + ".");
        } catch (NumberFormatException ex){
            // Handling non-integer input
            System.out.println("Invalid input. Please enter a NUMBER.");
        } finally {
            scanner.close();
        }
    }

}
