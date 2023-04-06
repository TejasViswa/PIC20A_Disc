# READ ME

[Back to Discussion Main Page](https://github.com/TejasViswa/PIC20A_Disc)

Please refer to the dates under Spring 2023. Usually, everything that I teach during discussion will be mentioned here.

### Legend
Symbols at the end of links and what they mean (hopefully) in order of importance:
- ?? - Exam or assignment help
- ? - Directly related to course content
- ! - Indirectly related to course content
- !! - Additional or Fun

# Spring 2023

```java
// Your weekly knock-knock joke brought to you by our friend ChatGPT
// When you run this code, it will print out a random knock-knock joke from the arrays of setups and punchlines. Enjoy!

import java.util.Random;

public class KnockKnockJoke {
  public static void main(String[] args) {
    String[] setups = {"Boo", "Alpaca", "Wanda", "Lettuce", "Tank", "Gladys"};
    String[] punchlines = {"Don't cry, it's just a joke.",
                           "Alpaca the suitcase, you load up the car.", 
                           "Wanda you do with a hundred pounds of chocolate?", 
                           "Let us in, it's cold out here!",
                           "You're welcome.",
                           "Gladys my last knock-knock joke?"};
    Random random = new Random();
    int index = random.nextInt(setups.length);
    System.out.println("Knock, knock.");
    System.out.println("Who's there?");
    System.out.println(setups[index] + ".");
    System.out.println(setups[index] + " who?");
    System.out.println(punchlines[index]);
  }
}

```

## Tue Apr 11
- [Different types of variables in Java](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_1/Static_fields.md) ?
- [Naming conventions in Java and Python](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_1/NamingConvention.md) !
- [Overflow and underflow in Java](UnderFlowOverFlow.md) ?
- [Java does not allow default arguments](DefaultArguments.md) ?
- [Theory](Theory.md) !
- [HW1 Hints](HW1_hints.md) ??

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
