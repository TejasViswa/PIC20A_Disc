# Pokemon Class Exercise

Write a Pokemon class with the following details:
- Attributes/fields
  - name
  - HP
  - random (must be an instance of Random object, you need to import it. ie: `import java.util.Random;`)
- Behavior/methods
  - constructor (parameters - name)
    - sets name
    - sets HP to 100
    - sets random to a new Random object
  - addCourses
    - parametes - varargs courses
  - toString

Finally, add the following main method to your class:
```java
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
```
And you should be able to see an output like the following (it is not neccessary that you will win the battle, you may also lose it):
```
A wild Pikachu has appeared!
You sent out your Charmander to battle the Pikachu

Charmander used scratch!
Charmander dealt a damage of 1 to Pikachu! It was not so effective.
Pikachu used tackle!
Pikachu dealt a damage of 20 to Charmander! It was super effective!
Pokemon - Name: Charmander, HP: 80 
Pokemon - Name: Pikachu, HP: 99 

Charmander used scratch!
Charmander dealt a damage of 26 to Pikachu! It was super effective!
Pikachu used tackle!
Pikachu dealt a damage of 2 to Charmander! It was not so effective.
Pokemon - Name: Charmander, HP: 78 
Pokemon - Name: Pikachu, HP: 73 

Charmander used scratch!
Charmander dealt a damage of 14 to Pikachu! It was moderately effective.
Pikachu used tackle!
Pikachu dealt a damage of 2 to Charmander! It was not so effective.
Pokemon - Name: Charmander, HP: 76 
Pokemon - Name: Pikachu, HP: 59 

Charmander used scratch!
Charmander dealt a damage of 5 to Pikachu! It was not so effective.
Pikachu used tackle!
Pikachu dealt a damage of 23 to Charmander! It was super effective!
Pokemon - Name: Charmander, HP: 53 
Pokemon - Name: Pikachu, HP: 54 

Charmander used scratch!
Charmander dealt a damage of 27 to Pikachu! It was super effective!
Pikachu used tackle!
Pikachu dealt a damage of 6 to Charmander! It was not so effective.
Pokemon - Name: Charmander, HP: 47 
Pokemon - Name: Pikachu, HP: 27 

Charmander used scratch!
Charmander dealt a damage of 5 to Pikachu! It was not so effective.
Pikachu used tackle!
Pikachu dealt a damage of 31 to Charmander! It was a critical hit!
Pokemon - Name: Charmander, HP: 16 
Pokemon - Name: Pikachu, HP: 22 

Charmander used scratch!
Charmander dealt a damage of 37 to Pikachu! It was a critical hit!
Pikachu used tackle!
Pikachu dealt a damage of 1 to Charmander! It was not so effective.
Pokemon - Name: Charmander, HP: 15 
Pokemon - Name: Pikachu, HP: 0 

Wild Pikachu was defeated!
You won the battle!
```
