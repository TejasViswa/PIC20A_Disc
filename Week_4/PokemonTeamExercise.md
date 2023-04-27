# Pokemon Team Class Exercise

Write a PokemonTeam class with the following details:
- imports (add these lines at the top)
  - `import java.util.Scanner;`
  - `import java.util.Random;`
- Variables/Attributes/fields
  - team
  - currentPokemon
- Functions/Behavior/methods
  - default constructor (no parameters/arguments)
    - set both team and currentPokemon to null
  - constructor (varargs Pokemons)
    - perform a deep copy from pokemons to team
    - set the first pokemon to currentPokemon provided length is not zero
    - if length of pokemons is zero call the default constructor
  - addPokemon (Parameter - Pokemon) (returns nothing)
    - if your team is null then create a new 1-element Pokemon array and assign team to that and also set your currentPokemon to that
    - otherwise, add this pokemon to your team (remember, arrays are fixed sized meaning, you will have to reassign team to a new array object of team.length+1 and this pokemon to that)
  - wipedOut (No parameters) (returns boolean)
    - checks if every pokemon in your team has fainted and returns true else false
  - swapPokemon (Parameter - int i) (returns boolean)
    - checks if i is invalid (out of range of index of team+1) then returns false
      - what this means is that i is a value from 1 to N whereas the index for team is from 0 to N-1
    - checks if team[i-1] has fainted then returns false
    - then swaps current pokemon to team[i-1] and returns true. You also print to the console the names of the swapped pokemon
  - autoSwapPokemon (No parameters) (returns boolean)
    - automatically swaps to next non-fainted pokemon and returns true
    - if all pokemon have fainted then return false
  - toString
    - Must return a string which includes the index+1 and toString of each pokemon
      - ie: 1. Pikachu

Finally, add the following main method to your class:
```java
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
        pokemon = new Pokemon(pokemonPool[index][0]);
        yourTeam.addPokemon(pokemon);

        do { index = rand2.nextInt(pokemonPool.length); } while(used[index]); used[index] = true;
        pokemon = new Pokemon(pokemonPool[index][0]);
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
```
