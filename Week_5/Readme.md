# READ ME
[Back to Discussion Main Page](https://github.com/TejasViswa/PIC20A_Disc)
### Legend
Symbols at the end of links and what they mean (hopefully) in order of importance:
- ?? - Exam or assignment help
- ? - Directly related to course content
- ! - Indirectly related to course content
- !! - Additional or Fun

# Spring 2023

```java
// Your weekly coin toss simulator brought to you by our friend ChatGPT

// When you run this program, it will ask you how many times you want to toss a coin.
// It will then simulate that many coin tosses and keep track of the number of heads and tails.
// Finally, it will display the results and tell you whether you won, lost, or tied the game. Have fun!

import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int heads = 0;
        int tails = 0;
        
        System.out.print("How many times do you want to toss the coin? ");
        int numTosses = input.nextInt();
        
        for (int i = 1; i <= numTosses; i++) {
            int result = rand.nextInt(2);
            if (result == 0) {
                System.out.println("Toss " + i + ": heads");
                heads++;
            } else {
                System.out.println("Toss " + i + ": tails");
                tails++;
            }
        }
        
        System.out.println("\nResults: ");
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        if (heads > tails) {
            System.out.println("You win!");
        } else if (tails > heads) {
            System.out.println("You lose!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}


```
## Simple RPG
- [Simple RPG](https://github.com/TejasViswa/PIC20A_Disc/tree/main/SimpleRPG) is a simple RPG-like game. Look at the README to see the sample output.
- It has `Player.java`,`Monster.java`,`Game.java` and `Main.java` files to illustrate how classes work and additionally uses the `Scanner` and `Random` classes.
- Remember that it is a very simple implementation and you may tweak it as you wish or improve upon it for better game mechanics.

## Pokemon Battle
- [Pokemon Battle](https://github.com/TejasViswa/PIC20A_Disc/tree/main/PokemonBattle) is a simple Pokemon Battle simulator. You will need to be connected to the internet for it to work. It emulates (well atleast it tries to ) a pokemon battle from the game "FireRead/LeafGreen" but you are restricted to only 1 move ie:tackle and assigned some pokemon at random and do not have any items. It does use type advantage for the pokemon so you have to strategize to win.

## Tue May 2
- [PokemonBattle Class](https://github.com/TejasViswa/PIC20A_Disc/blob/main/PokemonBattle/PokemonBattle.java) !!
- [PokemonWithType Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonWithTypeExercise.md) ?
- [PokemonWithType Class](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonWithType.java) ?
- [UndergradStudentTester](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/UndergradStudentTester.java) !
- [Arrays Vs Strings - Mutability](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/ArrayVsString.md) ?
- [Strings in Java - Immutability](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/StringImmutable.md) ?

## Thu May 4
- [EmployeeTester](EmployeeTester.java) ?

# Winter 2023

## Tue Feb 7
- Midterm Review

## Thu Feb 9
- [EmployeeTester](EmployeeTester.java)
