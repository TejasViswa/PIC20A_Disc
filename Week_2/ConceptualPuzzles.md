# Conceptual Java Puzzles

## Question 1
What is the output of the following snippet?
```java
public class A {
  public static void main(String[] args) {
    // negative maximum value of int is -2147483648
    // positive maximum value of int is 2147483647
    int a = -2147483647; 
    int b = 2;
    int c = a - b;
    int d = c * 2;
    System.out.println(d);
  }
}
```

## Question 2
What is the output of the follwing snippet?
```java
public class A {
    public static void main(String[] args) {
        int num1 = 5;
        float num2 = 5.0f;
        double num3 = 5.0;
        String num4 = "5";
        
        System.out.println(num1 == num2);
        System.out.println(num2 == num3);
        System.out.println(num3 == Integer.parseInt(num4));
    }
}
```

## Question 3
What is the output of the following snippet?
```java
public class A {
    static int staticVar = 0;
    int instanceVar = 0;
    
    public A() {
        staticVar++;
        instanceVar++;
        System.out.println("staticVar: " + staticVar);
        System.out.println("instanceVar: " + instanceVar);
    }
    
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}
```

## Question 4
What is the output of the following snippet?
```java
import java.util.*;

public class App {

    public void print(int x) {
        System.out.println("int: " + x);
    }
    
    public void print(double x) {
        System.out.println("double: " + x);
    }
    
    public void print(String x) {
        System.out.println("String: " + x);
    }
    public void print(float[] x) {
        System.out.println("float[]: " + Arrays.toString(x));
    }

    public void print(double x, double y, double z) {
        System.out.println("double: " + x + ", int: " + y + ", double: " + z);
    }

    public void print(double x, int y, int z) {
        System.out.println("double: " + x + ", int: " + y + ", int: " + z);
    }

    public static void main(String[] args) {
        App puzzle = new App();
        
        puzzle.print(3+2+"1"+4+"1"+1+4);
        puzzle.print(new float[] {1, 2, 3});
        puzzle.print(10.0, 1, 'c');
        puzzle.print(10.0, 1.5, 'c');
        puzzle.print(1.23f);
    }
}
```

## Question 5
What is the output of the following snippet?
```java
public class App {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
        
        sum = 0;
        for (int num : arr) {
            num+=2;
            sum += num;
        }
        System.out.println("Sum is : " + sum);

        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
    }
}
```

## Question 6
What is the output of the following snippet?

Draw the memory diagram of the references and the objects as well
```java
import java.util.*;
public class App {
    public static void main(String[] args) {
        String[] arr1 = {"one", "two", "three"};
        String[] arr2 = {"four", "five", "six"};
        
        modifyArray(arr1, arr2);
        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
    
    public static void modifyArray(String[] a, String[] b) {
        a = new String[3];
        a[0] = "seven";
        a[1] = "eight";
        a[2] = "nine";
        
        b[0] = "ten";
        b[1] = "eleven";
        b[2] = "twelve";
    }
}
```
## Question 7
What is the output of the following snippet?

Draw the memory diagram of the references and the objects as well
```java
```java
import java.util.*;
public class App {
    public static void main(String[] args) {
        String s = "Hello";
        char[] c = {'H', 'e', 'l', 'l', 'o'};
        
        modifyString(s);
        modifyArray(c);
        
        System.out.println("String: " + s);
        System.out.println("Array: " + Arrays.toString(c));
    }
    
    public static void modifyString(String str) {
        str = "World";
    }
    
    public static void modifyArray(char[] arr) {
        arr[0] = 'W';
        arr[3] = 'd';
    }
}
```
