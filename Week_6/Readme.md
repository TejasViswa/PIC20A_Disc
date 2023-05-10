# READ ME

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
// Your weekly simple encryption program brought to you by our friend ChatGPT

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = input.nextLine();
        System.out.print("Enter a key: ");
        int key = input.nextInt();
        String encryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    c = (char) ('A' + (c - 'A' + key) % 26);
                } else {
                    c = (char) ('a' + (c - 'a' + key) % 26);
                }
            }
            encryptedMessage += c;
        }
        System.out.println("Encrypted message: " + encryptedMessage);
    }
}

```
Sample Output:
```
Enter a message: Hello, How are you?
Enter a key: 7
Encrypted message: Olssv, Ovd hyl fvb?
```
## Tue May 9
- [Midterm Review - Control Flow and loops, Objects, Java Packages, Java API](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_5/MidtermReview3.md) ??
- [Midterm Review - Basics of Java Classes, Inheritance, Polymorphism](MidtermReview4.md) ??
- Practice Midterm Review ??
- [Practice Midterm Problem 2b - Shakespeare/Rectangle Problem](PracMidRectQ.md) ??
- [Practice Midterm Problem 3 - C class Problem](PracMidCQ.md) ??
- [Conceptual Java Puzzles](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/ConceptualPuzzles.md) ?
- Disc 1B recording
    - [link](https://ucla.zoom.us/rec/share/VzvVjVSWd1l_0wtNU6--rxtrGO7izpldCwa_qX5S0JEguLo89ytZez8NpY1p61mb.pUVgawMEiuW9pC_K)
    - Passcode: z=g9Rt6Z

## Thu May 11
- [Midterm Solutions](MidtermSolns.md) ??
- [Midterm Problem 2 Solution](MidProb2.md) ??
- [HW3 Hints](HW3HintsSpring.md) ??
- [Pokemon Type](https://github.com/TejasViswa/PIC20A_Disc/tree/main/PokemonType) !

# Winter 2023

## Tue Feb 14
- Midterm Solutions Discussion
- [HW3 Hints](HW3_Hints.md)

## Thu Feb 16
- Midterm Solutions Discussion
- [HW3 Hints](HW3_Hints.md)
