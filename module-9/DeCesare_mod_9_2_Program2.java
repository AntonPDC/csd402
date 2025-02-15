import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class DeCesare_mod_9_2_Program2 {
    public static void main(String[] args) {
        String filename = "data.file";
        Random random = new Random();

        // Step 1: Create or append to the file and write 10 random integers
        try (FileWriter fw = new FileWriter(filename, true)) { // Append mode
            for (int i = 0; i < 10; i++) {
                fw.write(random.nextInt(100) + " "); // Random number between 0-99
            }
            fw.write("\n"); // New line for better readability
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Step 2: Read and display the file contents
        System.out.println("Contents of " + filename + ":");
        try (Scanner fileReader = new Scanner(new File(filename))) {
            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
