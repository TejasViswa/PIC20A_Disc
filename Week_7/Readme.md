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
- [Flappy Bird](https://github.com/TejasViswa/PIC20A_Disc/tree/main/FlappyBird)

## Tue May 16
- [Smiley Panel](TestGUI.java)

## Thu May 18
- [Ice cream Confirm dialog](MyGUI.java)
- [Ice cream Confirm dialog with smiley and sad emoji](MyGUITest.java)

# Winter 2023
## Tue Feb 21
- [Smiley Panel](TestGUI.java)

## Thu Feb 23
- [Ice cream Confirm dialog](MyGUI.java)
- [Ice cream Confirm dialog with smiley and sad emoji](MyGUITest.java)
