# READ ME

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
## Tue Jan 31
- [GroupTester](GroupTester.java)

## Thu Feb 2
- [UndergradStudentTester](UndergradStudentTester.java)
