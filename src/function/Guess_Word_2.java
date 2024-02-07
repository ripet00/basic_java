package function;

import java.util.Scanner;
import java.util.Random;

public class Guess_Word_2 {
    private static Scanner scanner;
    public static void main(String[] args) {
        String[] words = {"java", "hallo", "coding", "python", "student"};

        // choose random from array
        Random random = new Random();
        String word = words[random.nextInt(words.length)];

        // Player Name
        scanner = new Scanner(System.in);
        System.out.print("Please enter the player's name: ");
        String name = scanner.nextLine();

        // Initializing variables
        String guessedLetters = "";
        int chances = 10;

        System.out.println("Okay! " + name + ", let's start guessing.");

        // Looping
        while (chances > 0) {
            // Input letter
            System.out.print("Guess a letter of the word: ");
            String guess = scanner.nextLine().toLowerCase(); // Converting to lowercase for case-insensitivity

            // add the letter to the string
            guessedLetters += guess;

            // check the word
            boolean wrong = true;

            // Iterating through each letter in the word
            for (char letter : word.toCharArray()) {
                // Checking if the letter is in guessedLetters
                if (guessedLetters.contains(String.valueOf(letter))) {
                    System.out.print(letter + " ");
                } else {
                    System.out.print("_ ");
                    wrong = false;
                }
            }

            System.out.println(); // Move to the next line

            // check the letter (correct)
            if (wrong) {
                System.out.println("Congratulations! " + name + ", you guessed all the letters correctly.");
                System.out.println("The correct word is: " + word);
                break;
            }

            if (!word.contains(guess)) {
                chances--; // Decreasing chances by 1
                System.out.println("Wrong guess. This letter is not in the word.");
                System.out.println("You have " + chances + " more guess chances.");

                // If chances are zero, the player loses
                if (chances == 0) {
                    System.out.println("Sorry! Your number of chances are over. You lose.");
                }
            }
        }
    }
}
