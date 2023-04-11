import java.util.Scanner;

public class Game {
    private final Player player;
    private final Monster[] monsters;
    private final Scanner scanner;
    
    public Game(String playerName, String characterClass) {
        this.player = new Player(playerName, characterClass);
        this.monsters = new Monster[] {
            new Monster("Goblin", 30, 5),
            new Monster("Orc", 50, 10),
            new Monster("Dragon", 65, 12), 
            new Monster("Demon", 80, 15)
        };
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("Welcome to the RPG game, " + player.getName() + "!");
        System.out.println("You are a level " + player.getLevel() + " " + player.getCharacterClass() + ".");
        System.out.println("Your starting health is " + player.getHealth() + " and your starting damage is " + player.getDamage() + ".");
        System.out.println("Let the adventure begin!");
        
        for (int i = 0; i < monsters.length; i++) {
            Monster monster = monsters[i];
            System.out.println("\nYou have encountered a " + monster.getName() + " with " + monster.getHealth() + " health and " + monster.getDamage() + " damage.");
            while (player.isAlive() && monster.isAlive()) {
                System.out.println("\n" + player.getName() + ", what do you want to do?");
                System.out.println("1. Attack");
                System.out.println("2. Run");
                System.out.println("3. Check status levels");
                
                int choice = getIntInput("Enter your choice: ", 1, 3);
                if (choice == 1) {
                    int playerDamage = player.attack();
                    int monsterDamage = monster.attack();
                    monster.takeDamage(playerDamage);
                    player.takeDamage(monsterDamage);
                    System.out.println("You attack the " + monster.getName() + " and deal " + playerDamage + " damage.");
                    System.out.println("The " + monster.getName() + " attacks you and deals " + monsterDamage + " damage.");
                } else if(choice == 3) {
                    System.out.println("\nPlayer's stats:");
                    System.out.println(player);
                    System.out.println("\nMonster's stats:");
                    System.out.println(monster);
                } else{
                System.out.println("You run away from the " + monster.getName() + ".");
                    break;
                }
            }
            
            if (player.isAlive()) {
                int experience = (i + 1)*10;
                player.gainExperience(experience);
                System.out.println("You have defeated the " + monster.getName() + " and gained " + experience + " experience.");
            } else {
                System.out.println("You have been defeated by the " + monster.getName() + ". Game over!");
                return;
            }
        }
        
        System.out.println("\nCongratulations, " + player.getName() + ", you have completed the game and reached level " + player.getLevel() + "!");
    }
    
    private int getIntInput(String message, int min, int max) {
        int choice;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    break;
                }
            }
            scanner.nextLine();
        }
        scanner.nextLine();
        return choice;
    }
}
