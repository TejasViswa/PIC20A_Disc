# Examples of Code and Memory Diagrams

## Example 1
### Code
```java
public class Hello {

    int inst = 5;
    static int stat = 5;
    public static void main (String[] args) {
      
        // Stage - 1
        int x = 5;

        Hello h1 = new Hello();
        h1.inst++;
        Hello.stat++;

        // Stage - 2
        anotherMethod();
      
        CallMeClass c1 = new CallMeClass();
        c1.inst++;
        CallMeClass.stat++;

        // Stage - 4
        CallMeClass.callMe();
      
        // Stage - 6

    }

    public static void anotherMethod() {
        int y = 5;

        Hello h1 = new Hello();
        Hello.stat++;
        
        // Stage - 3
    }

}

class CallMeClass {
    int inst = 5;
    static int stat = 5;

    public static void callMe() {

        int z = 5;

        CallMeClass c1 = new CallMeClass();
        c1.inst++;
        CallMeClass.stat++;

        // Stage - 5
    }
}
```
### Memory Diagram
1. At Stage - 1
    - <img width="710" alt="image" src="https://user-images.githubusercontent.com/45400093/232159847-f1ebdbd7-39a2-40ba-a96d-3ff135741e2c.png">
2. At Stage - 2
    - <img width="710" alt="image" src="https://user-images.githubusercontent.com/45400093/232159700-b4262af1-5526-483b-9abf-b00fe998e53d.png">
3. At Stage - 3
    - <img width="787" alt="image" src="https://user-images.githubusercontent.com/45400093/232160428-3dd2a70b-259f-4932-810a-c265fc19a1f7.png">
4. At Stage - 4
    - <img width="787" alt="image" src="https://user-images.githubusercontent.com/45400093/232160902-0cf4205f-cb8d-4a1d-8146-58dcfb770eae.png">
5. At Stage - 5
    - <img width="852" alt="image" src="https://user-images.githubusercontent.com/45400093/232161544-3946f4cc-095b-4a43-89f0-fd9df1c29928.png">
6. At Stage - 6
    - <img width="852" alt="image" src="https://user-images.githubusercontent.com/45400093/232161629-a87ebdc6-d3b0-4301-9d5e-5eab2395fbc0.png">

