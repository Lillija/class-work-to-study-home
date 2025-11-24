import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 101);
        int guesses = 10;

        System.out.println("Guess the number (1–100):");

        while (guesses > 0) {
            System.out.print("Enter your guess: ");
            int guessedNumber = Integer.parseInt(myObj.nextLine());

            if (guessedNumber < randomNum) {
                guesses = guesses - 1;
                System.out.println("Too small, guesses left: " + guesses);
            } else if (guessedNumber > randomNum) {
                guesses = guesses - 1;
                System.out.println("Too big, guesses left: " + guesses);
            } else {
                System.out.println("You guessed the number! It was: " + randomNum);
                return;
            }
        }

        System.out.println("You didn't guess it! (loser) The number was: " + randomNum);
    }
}
