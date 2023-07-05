package NumberGuessingGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        boolean guessedCorrectly = false;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Number Guessing Game!");

            while (!guessedCorrectly) {
                System.out.print("Enter your guess number (1-110): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                }
                else if ( guess > 110){
                    System.out.println("The guess is invalid\n ");
                }
                else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the secret number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                }
            }
        }

        System.out.println("Thank you for playing the Number Guessing Game.");
    }
}

