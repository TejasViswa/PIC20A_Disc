import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the RPG game!");
        String name = getStringInput("What is your name? ");
        String characterClass = getStringInput("Choose your character class (warrior, mage, or rogue): ");
        Game game = new Game(name, characterClass);
        game.start();
    }
    
    private static String getStringInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
