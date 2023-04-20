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
// Your weekly haiku brought to you by our friend ChatGPT (slightly modified to ensure no repeating lines)

// This program generates a random haiku by selecting three random phrases from an array of haiku lines.
// You can add your own haiku lines to the phrases array to create more variations.

import java.util.Random;

public class HaikuGenerator {
    public static void main(String[] args) {
        String[] phrases = {"Autumn moonlight", 
                            "A worm digs silently", 
                            "I kill an ant", 
                            "The light of a candle",
                            "In the cicada's cry", 
                            "No sign can foretell", 
                            "The ancient pond",
                            "A frog jumps in", 
                            "The sea darkens",
                            "Over the barren fields", 
                            "Only a scarecrow stands", 
                            "The first snow!"};

        Random rand = new Random();
        int line1 = rand.nextInt(phrases.length),line2,line3;
        while((line2 = rand.nextInt(phrases.length)) == line1){}
        while((line3 = rand.nextInt(phrases.length)) == line1 ||
               line3 == line2 ){}

        System.out.println(phrases[line1]);
        System.out.println(phrases[line2]);
        System.out.println(phrases[line3]);
    }
}
```

## Simple RPG
- [Simple RPG](https://github.com/TejasViswa/PIC20A_Disc/tree/main/SimpleRPG) is a simple RPG-like game. Look at the README to see the sample output.
- It has `Player.java`,`Monster.java`,`Game.java` and `Main.java` files to illustrate how classes work and additionally uses the `Scanner` and `Random` classes.
- Remember that it is a very simple implementation and you may tweak it as you wish or improve upon it for better game mechanics.

## Tue Apr 18
- [How are method calls are executed in Java ?](MethodCall.md) ?
- [Sample Code and Memory Diagram](SampleCodeNMemDiag.md) !
- [Sample Code with Arrays and Memory Diagram](SampleArrayNMemDiag.md) !
- Debugger ! [shown in discussion, look at the last 10 minutes in recording]
- [Pass by value Vs Pass by reference](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/PassValPassRef.md) !
- [How are primitive data types stored/represented in Java ?](Theory.md) !!
- [HW1 Hints](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/HW1_Spring_Hints.md) ??
- Disc 1B recording
    - [link](https://ucla.zoom.us/rec/share/sqFT3Byp5SK6TAdsxukvEySKbtNSFThQ6AetVgT6RXy7WAVHcaE4rse-oNrWw9o6.Z6dHksri9LtJbVDG)
    - Passcode: 0*!91TaL

## Thu Apr 20
- [Where are objects in objects stored in Java ?](ObjectInObject.md) !
- [Arrays Vs Strings - Mutability](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/ArrayVsString.md) ?
- [Strings in Java - Immutability](StringImmutable.md) ?
- [Student Class Exercise](StudentClassExercise.md) !
- [Variable Arguments](Varargs.md) ?

# Winter 2023

## Tue Jan 24
- [Theory](Theory.md)

## Thu Jan 26
- [Student Class](StudentTester.java)
- [Variable Arguments](https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/)
