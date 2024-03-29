# How are method calls executed in Java?

In Java, when a method is called, a new frame is created on the call stack to store the method's local variables and parameters. This frame is pushed onto the top of the stack, and when the method returns, the frame is popped off the stack.

Here's an example of how a method call works in Java:

```java
public class Example {
  public static void main(String[] args) {
    int x = 5;
    int y = 7;
    
    int sum = addNumbers(x, y);
    
    System.out.println(sum);
  }
  
  public static int addNumbers(int a, int b) {
    int result = a + b;
    return result;
  }
}
```
In the main method, we define two integers x and y, and then call the addNumbers method with these values. The addNumbers method returns the sum of a and b, which is then assigned to the sum variable.

Here's a visual representation of the call stack before and after the addNumbers method call:

Before addNumbers call:

![image](https://user-images.githubusercontent.com/45400093/230575378-4b7e936b-bbbd-4493-a4ce-3376af201606.png)

After addNumbers call:

![image](https://user-images.githubusercontent.com/45400093/230576155-368017ab-1262-4464-b089-69bde4c38246.png)

Before the method call, the call stack contains the main method's local variables x and y, as well as the args parameter.

After the method call, a new frame is pushed onto the stack for the addNumbers method, and it contains the method's local variables a, b, and result.

Once the addNumbers method completes and returns the result, its frame is popped off the stack and the sum variable is assigned the result. The call stack returns to its previous state with only the main method's variables and parameters.
![image](https://user-images.githubusercontent.com/45400093/230576385-ebe97cb9-d6e5-4b8c-b027-c75d75fb6795.png)
