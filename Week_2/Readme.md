# READ ME

### Legend
Symbols at the end of links and what they mean (hopefully) in order of importance:
- ?? - Exam or assignment help
- ? - Directly related to course content
- ! - Indirectly related to course content
- !! - Additional or Fun

# Spring 2023

```java
// Your weekly haiku brought to you by our friend ChatGPT

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
        int line1 = rand.nextInt(phrases.length);
        int line2 = rand.nextInt(phrases.length);
        int line3 = rand.nextInt(phrases.length);

        System.out.println(phrases[line1]);
        System.out.println(phrases[line2]);
        System.out.println(phrases[line3]);
    }
}
```
## Tue Apr 11
- [Theory](Theory.md) !
- [HW1 Hints](HW1_hints.md) ?

## Thu Apr 13
- [Theory](Theory.md) !
- Debugger !

# Winter 2023
## Tue Jan 17
- [Theory](Theory.md)
- [HW1 Hints](HW1_hints.md)

## Thu Jan 19
- [Theory](Theory.md)
- Debugger
