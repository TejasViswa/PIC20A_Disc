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
// Your weekly random fact brought to you by our friend ChatGPT

// This program generates a random fact from its list.
// You can add your own facts to the array to the facts arrays to see more facts.

import java.util.Random;

public class RandomFactGenerator {
    public static void main(String[] args) {
        String[] facts = {
            "The shortest war in history was between Britain and Zanzibar in 1896. Zanzibar surrendered after just 38 minutes.",
            "The world's oldest piece of chewing gum is over 9,000 years old.",
            "A group of flamingos is called a flamboyance.",
            "The world's largest grand piano was built by a 15-year-old in New Zealand.",
            "The longest wedding veil was longer than 63 football fields."
        };
        
        Random rand = new Random();
        int index = rand.nextInt(facts.length);
        String fact = facts[index];
        
        System.out.println(fact);
    }
}

```
## Simple RPG
- [Simple RPG](https://github.com/TejasViswa/PIC20A_Disc/tree/main/SimpleRPG) is a simple RPG-like game. Look at the README to see the sample output.
- It has `Player.java`,`Monster.java`,`Game.java` and `Main.java` files to illustrate how classes work and additionally uses the `Scanner` and `Random` classes.
- Remember that it is a very simple implementation and you may tweak it as you wish or improve upon it for better game mechanics.
## Tue Apr 25
- [Pokemon Class Exercise](PokemonExercise.md) ?
- [Pokemon Class](Pokemon.java) ?
- [Student Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/StudentClassExercise.md) !
- [Student Tester Class](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/StudentTester.java) !
- [Variable Arguments](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/Varargs.md) !
- [HW1 Hints](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/HW1_Spring_Hints.md) ??
- Disc 1B recording
    - [link](https://ucla.zoom.us/rec/share/FKmL9gMs8VwUJHhSsjamloYJkkEQsThuuMAMaQAn5e_MCTDLXbYIZAqAZ46HJ394.V1E9qOKzxwOg4PUi)
    - Passcode: xHlK*e37

## Thu Apr 27
- [PokemonWithType Class Exercise](PokemonWithTypeExercise.md) ?
- [GroupTester](GroupTester.java) !
- [UndergradStudentTester](UndergradStudentTester.java) !
- [Arrays Vs Strings - Mutability](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/ArrayVsString.md) ?
- [Strings in Java - Immutability](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/StringImmutable.md) ?

# Winter 2023
## Tue Jan 31
- [GroupTester](GroupTester.java)

## Thu Feb 2
- [UndergradStudentTester](UndergradStudentTester.java)
