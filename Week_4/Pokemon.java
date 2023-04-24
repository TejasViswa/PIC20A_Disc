import java.util.Random;

public class Pokemon {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("Charmander");
        Pokemon pikachu = new Pokemon("Pikachu");

        System.out.println("A wild "+pikachu.getName()+" has appeared!");
        System.out.println("You sent out your "+charmander.getName()+" to battle the "+pikachu.getName());
        System.out.println();

        while(!charmander.hasFainted() && !pikachu.hasFainted()) {
            System.out.println(charmander.getName()+" used scratch!");
            charmander.attack(pikachu);
            System.out.println(pikachu.getName()+" used tackle!");
            pikachu.attack(charmander);
            System.out.println(charmander);
            System.out.println(pikachu);
            System.out.println();
        }

        if(pikachu.hasFainted()) {
            System.out.println("Wild "+pikachu.getName()+" was defeated!");
            System.out.println("You won the battle!");
        } else {
            System.out.println(charmander.getName()+" has fainted!");
            System.out.println("You lost the battle!");
        }
    }

    String name;
    int HP;
    Random random;

    Pokemon(String name) {
        this.name = name;
        this.HP = 100;
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public boolean hasFainted() {
        return HP <= 0;
    }

    public void takeDamage(int damage) {
        if(HP-damage <= 0) {
            HP = 0;
        }
        else {
            HP-=damage;
        }
    }

    public void attack(Pokemon other) {

        if(other.hasFainted()) {
            System.out.println(other.getName()+" has already fainted!");
            return;
        }

        int maxDamage = 40;
        int damage = random.nextInt(maxDamage+1);

        System.out.print(name+" dealt a damage of "+damage+" to "+other.getName()+"! ");

        if(damage >= 0.75*maxDamage) {
            System.out.println("It was a critical hit!");
        } else if(damage < 0.75*maxDamage && damage >= 0.5*maxDamage) {
            System.out.println("It was super effective!");
        } else if(damage < 0.5*maxDamage && damage >= 0.25*maxDamage) {
            System.out.println("It was moderately effective.");
        } else {
            System.out.println("It was not so effective.");
        }

        other.takeDamage(damage);

    }

    public String toString() {
        return "Pokemon - Name: "+name+", HP: "+HP+" ";
    }

}
