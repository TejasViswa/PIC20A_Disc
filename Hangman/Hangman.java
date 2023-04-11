import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {

        String[] words = { "cat", "dog", "bird", "tree", "sun",
                           "car", "bus", "fan", "cup", "map",
                           "book", "fork", "door", "bell", "rose",
                           "coin", "star", "moon", "fish", "bird",
                           "love", "gift", "tree", "nest", "lamp"};
                           
        String word = words[(int) (Math.random() * words.length)];
        char[] guessedLetters = new char[word.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '-';
        }
        int guessesLeft = 6;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        while (guessesLeft > 0 && new String(guessedLetters).contains("-")) {
            System.out.println("Guess a letter (" + guessesLeft + " guesses left):");
            String guess = scanner.nextLine();
            if (guess.length() != 1) {
                System.out.println("Please enter only one letter at a time.");
                continue;
            }
            char letter = guess.charAt(0);
            if (!Character.isLetter(letter)) {
                System.out.println("Please enter a valid letter.");
                continue;
            }
            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                    found = true;
                }
            }
            if (!found) {
                guessesLeft--;
                System.out.println("Sorry, that letter is not in the word.");
                drawHangman(guessesLeft);
            }
            System.out.println(new String(guessedLetters));
        }

        if (guessesLeft == 0) {
            System.out.println("Sorry, you lose. The word was " + word + ".");
            drawHangman(0);
        } else {
            System.out.println("Congratulations, you win!");
        }

        scanner.close();
    }

    public static void drawHangman(int guessesLeft) {
        System.out.println("+----+");
        System.out.println("|    |");

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

