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

// This program uses an array of three lines to construct a haiku,
// and then uses the Random class to select a random line from the array
// each time the program is run. The result is a different haiku each time!

import java.util.Random;

public class HaikuGenerator {
    public static void main(String[] args) {
        String[] lines = {
            "An old silent pond",
            "A frog jumps into the pond—",
            "Splash! Silence again."
        };
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.println(lines[rand.nextInt(lines.length)]);
        }
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
