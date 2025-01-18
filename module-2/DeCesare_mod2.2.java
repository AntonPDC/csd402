import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // assign a variable to a random integer between 1 and 3 inclusively
        int computerSign = (int) (Math.random()*4);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sign (1: rock, 2: paper, 3: scissors): ");
        int userSign = scanner.nextInt();
        scanner.close();
        System.out.println(computerSign);
        System.out.println(userSign);



    }
}
