# Midterm Review Part - 2

# Basics
## Math Functions
- Read the snippet `MathFunctions.java`
## Exercise
### Question 1
What is the output of the following code snippet?
```java
double x = -4.5;
System.out.println(Math.abs(Math.round(x)));
```
### Answer
`4`- The Math.round(x) method will return -4 since -4.5 rounds to -4. Then, the Math.abs() method will return the absolute value of -4, which is 4.
### Question 2
What is the output of the following code snippet?
```java
double x = 5.0;
System.out.println(Math.sqrt(-x));
```
### Answer
`NaN` - The Math.sqrt() method only accepts non-negative arguments. Since -5.0 is negative, the method will return NaN, which stands for "Not a Number".
### Question 3
What is the output of the following code snippet?
```java
double x = -0.5;
System.out.println(Math.ceil(x));
```
### Answer
`0.0` - The Math.ceil(x) method will return the smallest double value that is greater than or equal to x, which is 0.0 since -0.5 is closer to 0.0 than to -1.0.

## Varargs
Read the snippet `VarArgs.java`. [Additional information on varargs](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/Varargs.md)

In Java, varargs (variable arguments) allow methods to take a variable number of arguments of the same type. Here are some rules for using varargs in Java:
- A method can have at most one varargs parameter.
- The varargs parameter must be the last parameter in the method's parameter list.
- The type of the varargs parameter is an array type, and the component type of the array can be any valid Java type.
- When calling a method with a varargs parameter, you can pass any number of arguments (including zero) of the specified type, separated by commas.
- The compiler automatically creates an array of the specified type and length to hold the arguments passed to the varargs parameter.
- If the method has other parameters in addition to the varargs parameter, you must pass values for those parameters before the varargs parameter.
- You can also pass an array to a varargs parameter by using the syntax arrayName, where arrayName is the name of the array.
```java
public static int sum(int... numbers) {
    int total = 0;
    for (int n : numbers) {
        total += n;
    }
    return total;
}
```
- In this example, the method sum takes a variable number of int arguments using the varargs syntax (int... numbers). The method uses a for loop to add up all of the values passed in and returns the total sum.

## Exercise

### Question 1
What is the output of the following code?
```java
public class VarArgsTest {

    public static void main(String[] args) {
        foo(1, 2);
        foo(1, 2, 3);
    }

    public static void foo(int num1, int num2) {
        System.out.println("Two parameters method");
    }

    public static void foo(int... numbers) {
        System.out.println("Varargs method");
    }

}
```
### Answer
```
Two parameters method
Varargs method
```
The methods are matched according to how specific they are.
### Question 2
What is the output of the following code?
```java
public class VarArgsTest {

    public static void main(String[] args) {
        foo(1);
    }

    public static void foo(int num, int... number) {
        System.out.println("int, int...");
    }

    public static void foo(int... numbers) {
        System.out.println("int...");
    }

}
```
### Answer
```
Compile Time Error - Varargs ambiguity
```
There is varargs ambiguity because both the methods are equally specific

## Method Overloading
Reading the snippets `OverloadingStaticMethods.java` and `TypeTester.java`

The methods are matched according to how specific it is and according to the parameter orders.

## Exercise
### Question 1
What is the output of the following code?
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
