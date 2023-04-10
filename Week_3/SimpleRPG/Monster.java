import java.util.Random;

public class Monster {
    private final String name;
    private int health;
    private final int damage;
    private final Random random;
    
    public Monster(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.random = new Random();
    }
    
    public String getName() {
        return name;
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
    
    public int attack() {
        // Generate random integers in range 0 to damage
        return random.nextInt(damage) + 1;
    }

    public String toString() {
        return "Name: " + getName() +
               "\nDamage: " + getDamage() +
               "\nHealth: " + getHealth();
    }
}
