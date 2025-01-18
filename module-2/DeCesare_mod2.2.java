import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        // Generate the computer's selection (1: Rock, 2: Paper, 3: Scissors)
        int computerSign = 1 + (int) (Math.random() * 3);

        // Prompt the user for their selection
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (1: Rock, 2: Paper, 3: Scissors): ");
        int userSign = scanner.nextInt();
        scanner.close();

        // Validate user input
        if (userSign < 1 || userSign > 3) {
            System.out.println("Invalid input! Please enter 1, 2, or 3.");
            return;
        }

        // Map the numbers to the corresponding signs
        String[] signs = {"Rock", "Paper", "Scissors"};
        String computerChoice = signs[computerSign - 1];
        String userChoice = signs[userSign - 1];

        // Display choices
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println("Your choice: " + userChoice);

        // Determine the winner
        if (computerSign == userSign) {
            System.out.println("It's a tie!");
        } else if ((userSign == 1 && computerSign == 3) || // Rock beats Scissors
                   (userSign == 2 && computerSign == 1) || // Paper beats Rock
                   (userSign == 3 && computerSign == 2)) { // Scissors beats Paper
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
