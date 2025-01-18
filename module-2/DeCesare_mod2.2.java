import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // assign a variable to a random integer between 1 and 3 inclusively
        int computerSign = 1 + (int) (Math.random() * 3);



        int userSign;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your sign (1: rock, 2: paper, 3: scissors): ");
            userSign = scanner.nextInt();
        }
        System.out.println(computerSign);
        System.out.println(userSign);



    }
}
