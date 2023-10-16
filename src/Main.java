import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rand = (int)((Math.random() * 10) + 1);
        int guess;

        System.out.println("Welcome! Let's play a game.");
        System.out.println("Try to guess the number I'm thinking of!");
        do {
            if (scan.hasNextDouble()) {
                guess = scan.nextInt();
                if (guess >= 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        if (guess > rand) {
            System.out.println("Your guess was too high");
            System.out.println("The correct answer was: " + rand);
        } else if (guess < rand) {
            System.out.println("Your guess was too low");
            System.out.println("The correct answer was: " + rand);
        } else {
            System.out.println("You got it right!");
            System.out.println("The correct answer was: " + rand);
        }
    }
}