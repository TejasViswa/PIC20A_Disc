# Pokemon Class Exercise

Write a PokemonWithType class that inherits from Pokemon Class with the following details:
- Variables/Attributes/fields
  - type
- Functions/Behavior/methods
  - constructor (parameters - name, type)
    - calls superclass's constructor
    - sets type
  - getType
    - return Type
  - attack (parameter - other PokemonWithType)
    - if other pokemon has fainted then print that the other pokemon has already fainted
    - Use the following types array and typeChart 2D array in your code
    ```java
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
    ```
    which is adapted from this chart:
    ![image](https://user-images.githubusercontent.com/45400093/231074866-e88d71f7-aaa1-4beb-933c-88be9c0abdfa.png)
    - Find the string types indexes for the types of both the pokemon
    - Using these indexes, get the effectiveness factor from the typeChart and set the maxDamage as maxDamage = 40 * factor
    - get a random damage number using random (ie: `random.nextInt(maxDamage+1)`)
        - `nextInt` gives a value between 0 and the (input value - 1), thus when we pass `random.nextInt(maxDamage+1)` and maxDamage = 40, we get a value between 0 and 40 (and not 39).
    - if damage more than 0.75*maxDamage
        - print  - `It was a critical hit!`
    - if damage less than 0.75*maxDamage and damage greater than or equal to 0.5*maxDamage
        - print - `It was super effective!`
    - if damage less than 0.5*maxDamage and damage greater than or equal to 0.25*maxDamage
        - print - `It was moderately effective.`
    - else
        - print - `It was not so effective.`
    - Make other pokemon take damage
  - toString
    - Must return a string which includes the values of all the variables

Finally, add the following main method to your class:
```java
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
```
And you should be able to see an output like the following (if you use the pokemon from my main method then you will always win):
```
A wild Bulbasaur has appeared!
You sent out your Charmander to battle the Bulbasaur

Charmander used scratch!
Charmander dealt a damage of 77 to Bulbasaur! It was a critical hit!
Bulbasaur used tackle!
Bulbasaur dealt a damage of 3 to Charmander! It was not so effective.
Pokemon - Name: Charmander, HP: 97 , Type: Fire 
Pokemon - Name: Bulbasaur, HP: 23 , Type: Grass 

Charmander used scratch!
Charmander dealt a damage of 36 to Bulbasaur! It was moderately effective.
Bulbasaur used tackle!
Bulbasaur dealt a damage of 2 to Charmander! It was not so effective.
Pokemon - Name: Charmander, HP: 95 , Type: Fire 
Pokemon - Name: Bulbasaur, HP: 0 , Type: Grass 

Wild Bulbasaur was defeated!
You won the battle!
```
