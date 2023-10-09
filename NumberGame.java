package Pac;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Start the game loop
        int attempts = 0;
        boolean guessedCorrectly = false;
        Scanner scanner = new Scanner(System.in);
        while (!guessedCorrectly && attempts < MAX_ATTEMPTS) {
            // Prompt the user to enter their guess
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();

            // Compare the user's guess with the generated number
            if (guess == secretNumber) {
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // Increment the number of attempts
            attempts++;
        }

        // The user guessed correctly!
        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you ran out of attempts. The correct number was " + secretNumber + ".");
        }

        // Ask the user if they want to play again
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = scanner.nextLine();
        if (playAgain.equalsIgnoreCase("y")) {
            main(args);
        }
    }
}
