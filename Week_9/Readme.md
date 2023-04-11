# READ ME

```java
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

## Tue Mar 7
- HW4 Hints
- [Problem set on throw](https://www.geeksforgeeks.org/output-java-programs-set-39-throw-keyword/?ref=rp)
- [Problem set on throws](https://www.geeksforgeeks.org/output-java-programs-set-44-throws-keyword/?ref=rp)
- Note: In discussion, I erred when I talked about the first problem of the throws set. The reason it doesn't work is because the class is using the throws keyword. throws keyword can only be used on methods and constructors and it be used for any exception(basically any throwable class and not specific to checked exception)

## Thu Mar 9
- ASCII and Unicode
- [Find the longest word from a file](LongestWord.java)
