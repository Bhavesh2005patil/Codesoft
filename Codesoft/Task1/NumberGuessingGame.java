import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playAgain;
        
        do {
            int randomNumber = (int) (Math.random() * 100) + 1;
            int guess, attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100!");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                } else if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The number was: " + randomNumber);
            }

            System.out.print("Do you want to play again? (1 for Yes, 0 for No): ");
            playAgain = scanner.nextInt();
        } while (playAgain == 1);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
