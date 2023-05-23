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
// Your weekly simple chatbot program brought to you by our friend ChatGPT

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, I'm a chatbot! What's your name?");
        String name = input.nextLine();

        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("How are you feeling today?");
        String mood = input.nextLine();

        if(mood.equals("good")) {
            System.out.println("That's great to hear!");
        } else if(mood.equals("bad")) {
            System.out.println("I'm sorry to hear that. Is there anything I can do to help?");
        } else {
            System.out.println("I'm not sure what you mean. Can you elaborate?");
            String response = input.nextLine();
            System.out.println("Okay, I understand. Thanks for telling me!");
        }
    }
}
```

- [Flappy Bird](https://github.com/TejasViswa/PIC20A_Disc/tree/main/FlappyBird)

## Tue May 23
- [Smiley Test](SmileyTest.java)
- HW4 Hints

## Thu May 25
- [Practice for try-catch](https://www.geeksforgeeks.org/output-java-programs-set-41-try-catch/?ref=rp)
- HW4 Hints

# Winter 2023
## Tue Feb 28
- HW4 Hints

## Thu Mar 2
- [Practice for try-catch](https://www.geeksforgeeks.org/output-java-programs-set-41-try-catch/?ref=rp)
- HW4 Hints
