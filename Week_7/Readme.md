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

## Tue May 16
- [Books And Authors](BooksAndAuthors.java) !
- [Superheroes And Abilities](SuperheroesAndAbilities.java) !
- [Inheritance Exercise](InheritanceExercise.md) ?
- [Clothing](Clothing.java) ?
- [Smiley Panel](TestGUI.java) ?

## Thu May 18
- [Ice cream Confirm dialog](MyGUI.java)
- [Ice cream Confirm dialog with smiley and sad emoji](MyGUITest.java)

# Winter 2023
## Tue Feb 21
- [Smiley Panel](TestGUI.java)

## Thu Feb 23
- [Ice cream Confirm dialog](MyGUI.java)
- [Ice cream Confirm dialog with smiley and sad emoji](MyGUITest.java)
