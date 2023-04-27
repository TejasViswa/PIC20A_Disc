import java.util.Scanner;
import java.util.Random;

public class PokemonTeam {

    public static void main(String[] args) {

        PokemonTeam yourTeam = new PokemonTeam();
        PokemonTeam enemyTeam = new PokemonTeam();
        
        String[][] pokemonPool = {{"Rattata","Normal"},{"Sandshrew","Ground"},{"Pidgey","Flying"},
                                  {"Pikachu","Electric"},{"Charmander","Fire"},{"Squirtle","Water"},
                                  {"Bulbasaur","Grass"},{"Geodude","Rock"},{"Gastly","Ghost"},
                                  {"Abra","Psychic"},{"Mankey","Fighting"},{"Ekans","Poison"},
                                  {"Caterpie","Bug"},{"Dratini","Dragon"},{"Spearow","Flying"},
                                  {"Seel","Ice"},{"Voltorb","Electric"},{"Machop","Fighting"},
                                  {"Diglett","Ground"},{"Poliwag","Water"},{"Vulpix","Fire"},
                                  {"Meowth","Normal"},{"Nidoran","Poison"},{"Bellsprout","Grass"},};

        int i = 0, index = 0;
        Pokemon pokemon;
        Random rand1 = new Random(), rand2 = new Random();
        boolean[] used = new boolean[pokemonPool.length];
        Scanner scan = new Scanner(System.in);

        while(i < 6) {
            do { index = rand1.nextInt(pokemonPool.length); } while(used[index]); used[index] = true;
            pokemon = new PokemonWithType(pokemonPool[index][0]);
            yourTeam.addPokemon(pokemon);

            do { index = rand2.nextInt(pokemonPool.length); } while(used[index]); used[index] = true;
            pokemonWithType = new PokemonWithType(pokemonPool[index][0]);
            enemyTeam.addPokemon(pokemon);

            i++;
        }

        System.out.println("Your team has:");
        System.out.println(yourTeam);
        // System.out.println("Enemy team has:");
        // System.out.println(enemyTeam);

        System.out.println("RIVAL Blue");
        System.out.print("would like to battle!");
        scan.nextLine();
        System.out.println();

        System.out.println("RIVAL Blue sent");
        System.out.print("out "+enemyTeam.currentPokemon.getName());
        scan.nextLine();
        System.out.println();
        System.out.println("Go! "+yourTeam.currentPokemon.getName()+"!");

        while(!yourTeam.wipedOut() && !enemyTeam.wipedOut()) {
            if(enemyTeam.currentPokemon.hasFainted()) {
                System.out.println(enemyTeam.currentPokemon.getName()+" has");
                System.out.println("FAINTED!");
                scan.nextLine();
                System.out.println();
                enemyTeam.autoSwapPokemon();
            }
            if(yourTeam.currentPokemon.hasFainted()) {
                System.out.println(yourTeam.currentPokemon.getName()+" has");
                System.out.println("FAINTED!");
                scan.nextLine();
                System.out.println();
                System.out.println("Choose a POKEMON.");
                System.out.println(yourTeam);
                while(!yourTeam.swapPokemon(scan.nextInt()));
                System.out.println();
            }

            System.out.println("What will");
            System.out.println(yourTeam.currentPokemon.getName()+" do?");
            System.out.println("1. Fight");
            System.out.println("2. Pokemon");

            switch(scan.nextInt()) {
                case 1 : System.out.println();
                         System.out.println(yourTeam.currentPokemon.getName()+" used");
                         System.out.print("TACKLE!");
                         scan.nextLine();
                         System.out.println();
                         yourTeam.currentPokemon.attack(enemyTeam.currentPokemon);
                         break;
                case 2 : System.out.println();
                         System.out.println("Choose a POKEMON.");
                         System.out.println(yourTeam);
                         while(!yourTeam.swapPokemon(scan.nextInt()));
                         break;
                default : System.out.print("You cannot do that!");
                          scan.nextLine();
                          break;

            }
            System.out.println();
            if(enemyTeam.currentPokemon.hasFainted()) { 
                continue;
            }
            System.out.println(enemyTeam.currentPokemon.getName()+" used");
            System.out.print("TACKLE!");
            scan.nextLine();
            enemyTeam.currentPokemon.attack(yourTeam.currentPokemon);
            System.out.println();
            System.out.println(enemyTeam.currentPokemon);
            System.out.println(yourTeam.currentPokemon);
            System.out.println();
            scan.nextLine();
        }

        if(enemyTeam.wipedOut()) {
            System.out.println(enemyTeam.currentPokemon.getName()+" has");
            System.out.println("FAINTED!");
            scan.nextLine();
            System.out.println();
            System.out.println("You defeated RIVAL Blue!");
        } else {
            System.out.println(yourTeam.currentPokemon.getName()+" has");
            System.out.println("FAINTED!");
            scan.nextLine();
            System.out.println();
            System.out.println("You were defeated by RIVAL Blue!");
        }

    }

    //fields
    Pokemon[] team;
    Pokemon currentPokemon;

    PokemonTeam () {
        this.team = null;
        this.currentPokemon = null;
    }

    // varargs constructor
    PokemonTeam (Pokemon ... team) {

        this.team = new Pokemon[team.length];
        for (int i = 0; i < team.length; i++) {
            this.team[i] = team[i];
        }

        if(team.length != 0) {
            this.currentPokemon = team[0];
        }
    }

    public void addPokemon (Pokemon pokemon) {

        if (this.team == null) {
            this.team = new Pokemon[1];
            this.team[0] = pokemon;
            currentPokemon = pokemon;
            return;
        }

        Pokemon[] temp = new Pokemon[this.team.length+1];
        for (int i = 0; i < this.team.length; i++) {
            temp[i] = this.team[i];
        }
        temp[temp.length-1] = pokemon;
        this.team = temp;
    }

    public boolean wipedOut() {

        for(Pokemon pokemon : this.team) {
            if(!pokemon.hasFainted()) {
                return false;
            }
        }
        return true;
    }

    // methods
    public boolean swapPokemon(int i) {
        
        if(i < 1 || i > this.team.length) {
            System.out.println("Input number is invalid! Enter a valid number!");
            return false;
        }

        if(team[i-1].hasFainted()) {
            System.out.println(team[i-1].getName()+" has already fainted! Choose another Pokemon!");
            return false;
        }

        System.out.println(this.currentPokemon.getName()+", good!");
        System.out.println("Come back!");

        this.currentPokemon = team[i-1];
        System.out.println("Go! "+this.currentPokemon.getName()+"!");

        return true;
    }

    public boolean swapPokemon(String pokemonName) {

        for (Pokemon pokemon : this.team) {
            if(pokemon.getName().equals(pokemonName)) {
                if(pokemon.hasFainted()) {
                    System.out.println(pokemon.getName()+" has already fainted! Choose another Pokemon!");
                    return false;
                }

                System.out.println(this.currentPokemon.getName()+", good!");
                System.out.println("Come back!");

                this.currentPokemon = pokemon;
                System.out.println("Go! "+this.currentPokemon.getName()+"!");

                return true;
            }
        }

        System.out.println("Name is invalid! Enter a valid name!");
        return false;
    }

    public boolean autoSwapPokemon() {

        for (Pokemon pokemon : this.team) {
            if(!pokemon.hasFainted()) {

                System.out.println(this.currentPokemon.getName()+" was swapped with ");

                this.currentPokemon = pokemon;
                System.out.println(this.currentPokemon.getName()+"!");

                return true;

            }
        }

        System.out.println("All Pokemon have fainted!");
        return false;
    }

    // toString for printing on console
    public String toString()
    {
        String s = "";
        for (int i = 0; i < team.length; i++) {
            s+=(i+1+". "+team[i]+"\n");
        }
        return s;
    }

}
