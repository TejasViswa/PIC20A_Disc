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
// Your weekly number fact generator program brought to you by our friend ChatGPT

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class RandomFactGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.print("Enter a number (-1 for random fact): ");
            String input = sc.nextLine();

            if (!input.matches("-?\\d+")) {
                System.out.println("Invalid input. Please enter a number or -1 for random fact.");
                continue;
            }

            int number = Integer.parseInt(input);

            String urlStr;
            if (number == -1) {
                urlStr = "http://numbersapi.com/random/trivia";
                System.out.println("Generating random fact...");
                try {
                    Thread.sleep(rand.nextInt(3000) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                urlStr = "http://numbersapi.com/" + number + "/trivia";
                System.out.println("Fact for " + number + ":");
            }

            try {
                URL url = new URL(urlStr);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String fact = in.readLine();
                System.out.println(fact);
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (number != -1) {
                System.out.println("Press Enter to continue...");
                sc.nextLine();
            }
        }
    }
}

```

- [Flappy Bird](https://github.com/TejasViswa/PIC20A_Disc/tree/main/FlappyBird)

## Tue Jun 6
- [Exception Handling in Java](Exceptions.md) ?
- [Longest Word](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_9/LongestWord.java) !
- Disc 1B recording
    - [link](https://ucla.zoom.us/rec/share/k7MtULYkaUqrK00lDUazeJ4SHXZUknoTqL4UEiEIltbk9l2ebulAPChmc7It_xZT._n91surwljBchYGQ)
    - Passcode: A!c+hU!0

## Thu Jun 8
- [Final Revision](Final_Revision.md)

# Winter 2023
## Tue Mar 14
- HW5 Hints

## Thu Mar 16
- [Final Revision](Final_Revision.md)
### Note - Final Revsion file is updated and corrected
# All the Best for your Finals!!!
