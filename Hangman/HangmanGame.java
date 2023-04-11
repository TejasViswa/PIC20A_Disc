import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    public static void main(String[] args) {

        // List of words that Hangman Game chooses from
        String[] words = { "cat", "dog", "bird", "tree", "sun",
                           "car", "bus", "fan", "cup", "map",
                           "book", "fork", "door", "bell", "rose",
                           "coin", "star", "moon", "fish", "bird",
                           "love", "gift", "tree", "nest", "lamp"};
        
        // Select a random word from the above list
        String word = words[(int) (Math.random() * words.length)];
        // Alternatively, you can also use these two lines instead which does the exact same thing
        // Random random = new Random();
        // String word = words[random.nextInt(words.length)];


        // Create the guessedLetters array. For eg: ----- for word length is 5
        char[] guessedLetters = new char[word.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '-';
        }
        // Alternatively, you can create a String instead of a char array like shown
        // String guessedLetters = "-".repeat(words.length); // Newer Feature in Java 11

        int guessesLeft = 6;
        // We need to create a scanner object each we want to take some input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        // The while loop continues as long as there guesses left and the word is not yet complete
        while (guessesLeft > 0 && new String(guessedLetters).contains("-")) {

            System.out.println("Guess a letter (" + guessesLeft + " guesses left):");

            // The scanner object takes the entire line for a String as the user's input
            String guess = scanner.nextLine();

            // If user input is more than 1 letter then continue the while loop (skip all the statements below and reiterate)
            if (guess.length() != 1) {
                System.out.println("Please enter only one letter at a time.");
                continue;
            }

            // Else if user input is 1 lettered as expected then go ahead

            // Take the first letter of this single lettered string (Basically convert the 1-lettered string to a char)
            char letter = guess.charAt(0);

            // If this char is not a letter then continue the while loop (skip all the statements below and reiterate)
            if (!Character.isLetter(letter)) {
                System.out.println("Please enter a valid letter.");
                continue;
            }

            // Now, we have the user input letter
            boolean found = false;

            // Loop through the word and check if the input letter is there within the word
            // if it is true then change the guessedLetter array at that position with the matched letter
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                    found = true;
                }
            }

            // If there is no match then reduce guessesLeft and draw the hangman
            if (!found) {
                guessesLeft--;
                System.out.println("Sorry, that letter is not in the word.");
                drawHangman(guessesLeft);
            }

            System.out.println(new String(guessedLetters));
        }

        // If there are no more guesses left then you lose
        if (guessesLeft == 0) {
            System.out.println("Sorry, you lose. The word was " + word + ".");
            drawHangman(0);
        } else { // Else if you found all the letters (there are no more '-' in guessedLetters) then you win
            System.out.println("Congratulations, you win!");
        }

        // Generally, we need to close the scanner object after the program is done
        scanner.close();
    }

    public static void drawHangman(int guessesLeft) {
        System.out.println("+----+");
        System.out.println("|    |");

        // Notice how I'm using the fall through for the switch case statement to print the hangman
        String a="", b="", c="";
        switch(guessesLeft)
        {
            case 0: c+="/";
            case 1: c+="\\";
            case 2: b+="/";
            case 3: b+="|";
            case 4: b+="\\";  // using only "\" is an error because it means that it is a start of an escape sequence
            case 5: a="O"; 
            case 6: 
        }
        
        System.out.println("|    "+a);
        System.out.println("|   "+b);
        System.out.println("|    "+c);
        System.out.println("|");
        System.out.println("+----+");
    }
}
