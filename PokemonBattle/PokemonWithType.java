public class PokemonWithType extends Pokemon {
    
    public static void main(String[] args) {

        // Uncomment any one of the following pair of lines:

        PokemonWithType p1 = new PokemonWithType("Charmander","Fire");
        PokemonWithType p2 = new PokemonWithType("Bulbasaur","Grass");

        // PokemonWithType p1 = new PokemonWithType("Pikachu","Electric");
        // PokemonWithType p2 = new PokemonWithType("Pidgey","Flying");

        // PokemonWithType p1 = new PokemonWithType("Squirtle","Water");
        // PokemonWithType p2 = new PokemonWithType("Charmander","Fire");

        System.out.println("A wild "+p2.getName()+" has appeared!");
        System.out.println("You sent out your "+p1.getName()+" to battle the "+p2.getName());
        System.out.println();

        while(!p1.hasFainted() && !p2.hasFainted()) {
            System.out.println(p1.getName()+" used scratch!");
            p1.attack(p2);
            System.out.println(p2.getName()+" used tackle!");
            p2.attack(p1);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println();
        }

        if(p2.hasFainted()) {
            System.out.println("Wild "+p2.getName()+" was defeated!");
            System.out.println("You won the battle!");
        } else {
            System.out.println(p1.getName()+" has fainted!");
            System.out.println("You lost the battle!");
        }
    }

    String type;

    PokemonWithType(String name, String type) {
        super(name);
        this.type = type;
    }

    public void attack(Pokemon other) {

        if(other.hasFainted()) {
            System.out.println(other.getName()+" has already fainted!");
            return;
        }

        if(!(other instanceof PokemonWithType)) {
            super.attack(other);
            return;
        }

        String[] types = {"Normal", "Fire", "Water", "Electric", "Grass", "Ice",
                          "Fighting", "Poison", "Ground", "Flying", "Psychic",
                          "Bug", "Rock", "Ghost", "Dragon" };
        double[][] typeChart = {{   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1, 0.5,   0,   1},
                                {   1, 0.5, 0.5,   1,   2,   2,   1,   1,   1,   1,   1,   2, 0.5,   1, 0.5},
                                {   1,   2, 0.5,   1, 0.5,   1,   1,   1,   2,   1,   1,   1,   2,   1, 0.5},
                                {   1,   1,   2, 0.5, 0.5,   1,   1,   1,   0,   2,   1,   1,   1,   1, 0.5},
                                {   1, 0.5,   2,   1, 0.5,   1,   1, 0.5,   2, 0.5,   1, 0.5,   2,   1, 0.5},
                                {   1,   1, 0.5,   1,   2, 0.5,   1,   1,   2,   2,   1,   1,   1,   1,   2},
                                {   2,   1,   1,   1,   1,   2,   1, 0.5,   1, 0.5, 0.5, 0.5,   2,   0,   1},
                                {   1,   1,   1,   1,   2,   1,   1, 0.5, 0.5,   1,   1,   2, 0.5, 0.5,   1},
                                {   1,   2,   1,   2, 0.5,   1,   1,   2,   1,   0,   1, 0.5,   2,   1,   1},
                                {   1,   1,   1, 0.5,   2,   1,   2,   1,   1,   1,   1,   2, 0.5,   1,   1},
                                {   1,   1,   1,   1,   1,   1,   2,   2,   1,   1, 0.5,   1,   1,   1,   1},
                                {   1, 0.5,   1,   1,   2,   1, 0.5,   2,   1, 0.5,   2,   1,   1, 0.5,   1},
                                {   1,   2,   1,   1,   1,   2, 0.5,   1, 0.5,   2,   1,   2,   1,   1,   1},
                                {   0,   1,   1,   1,   1,   1,   1,   1,   1,   1,   0,   1,   1,   2,   1},
                                {   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   2}};

        int i = 0, j = 0;
        for(int k = 0; k < types.length; k++) {
            if(types[k].equals(type)) {
                i = k;
            }
            if(types[k].equals(((PokemonWithType)other).getType())) {
                j = k;
            }
        }

        int maxDamage = (int) (40 * typeChart[i][j]);
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

    public String getType() {
        return type;
    }
    public String toString() {
        return super.toString()+", Type: "+type+" ";
    }

}
