import java.util.Random;

public class Player {
    private final String name;
    private final String characterClass;
    private int level;
    private int experience;
    private int health;
    private int damage;
    private final Random random;
    
    public Player(String name, String characterClass) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = 1;
        this.experience = 0;
        this.random = new Random();
        
        if (characterClass.equalsIgnoreCase("warrior")) {
            this.health = 100;
            this.damage = 10;
        } else if (characterClass.equalsIgnoreCase("mage")) {
            this.health = 50;
            this.damage = 20;
        } else {
            this.health = 75;
            this.damage = 15;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getCharacterClass() {
        return characterClass;
    }
    
    public int getLevel() {
        return level;
    }
    
    public int getExperience() {
        return experience;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public void gainExperience(int experience) {
        this.experience += experience;
        int levelUpExperience = level * 10;
        if (this.experience >= levelUpExperience) {
            level++;
            this.experience -= levelUpExperience;
            health += 10;
            damage += 5;
            System.out.println("Congratulations, you have reached level " + level + "!");
        }
    }
    
    public int attack() {
        // Generate random integers in range 0 to damage
        return random.nextInt(damage) + 1;
    }

    public String toString() {
        return "Name: " + getName() +
               "\nClass: " + getCharacterClass() +
               "\nLevel: " + getLevel() + 
               "\nExperience: " + getExperience() +
               "\nDamage: " + getDamage() +
               "\nHealth: " + getHealth();
    }
}
