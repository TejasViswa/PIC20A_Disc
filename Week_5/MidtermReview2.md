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
`0.0` - The Math.ceil(x) method will return the smallest double value that is greater than or equal to x, which is 0.0.

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

[Some more on varargs ambiguity](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_5/VarargAmbiguity.md)

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
        System.out.println("double: " + x + ", double: " + y + ", double: " + z);
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
### Answer
```
String: 514114
float[]: [1.0, 2.0, 3.0]
double: 10.0, int: 1, int: 99
double: 10.0, double: 1.5, double: 99.0
double: 1.2300000190734863
```
- Any primitive datatype concatenated with a `String` always gets converted into a `String` and since all the operators in that expressions are just simple addition, the operator precedence is the same and as a result everything is evaluated from left to right. We initially have an `int` + `int` addition which yields an `int` again (3 + 2 = 5). Then, we have `int` + `String` (5 + "1" = "51") and then evrything after that also yields a `String` because, one of the operand is now always going to be `String`. ("51" + 4 = "514") |-> ("514" + "1" = "5141") |-> ("5141" + 1 = "51411") |-> ("51411" + 4 = "514114"). Finally, the generated `String` literal "514114" is passed into the method that accepts a `String` and the output is printed to the console as `String: 514114`
- Even though, we passed in `int`s to the `new` `float` array object we created, the values are promoted to `float` literals (ie: `1.0f`, `2.0f` and `3.0f`) and stored in the `float` array object and passed to the method that accepts `float` arrays and the output is printed to the console as `float[]: [1.0, 2.0, 3.0]`
- The compiler always picks the method that is most specific to the datatypes of the arguments that were passed in. It tries to find the method where the least number of promotions have to be performed for the method call. In this specific instance, we can see that there are two appealing choices - `print(double, double, double)` and `print(double, int, int)`. Now notice that we are passing in the values - `10.0, 1, 'c'`. Here, both the methods are approriate calls for the first argument which is a double (ie:`10.0`). The confusion arises for the next two arguments which are `1` and `'c'`. If we notice, that the second method is more specific because the second datatype is an `int` which is the same as the datatype of `1` whereas for the first method, the compiler will have to promote `1` to `1.0` before passing it to it. Meanwhile, for the third argument(ie:`'c'`), both the method calls will have to perform a promotion to `double` and `int` respectively anyway. Therefore, overall, the second method call will only have to perform 1 promotion whereas the first method call will have to perform 2 promotions. This means that the second method call is more specific than the first method call and the compiler will have to perfom less effort to call the same. Thus, we have the output as: `double: 10.0, int: 1, int: 99`
- Similar to the previous question, this method call seems confusing but let us look at how the compiler resolves this. Here, the arugments passed in are `10.0, 1.5, 'c'`. Now, the first argument is the same as the previous question and it makes no difference to the compiler. Whereas, the second argument is a double(ie:`1.5`) and it can only be accepted by the method `print(double, double, double)` because the other method `print(double, int, int)` cannot accept a double anyway because remember, we will be passing a `double` to an `int` which is a narrowing conversion and the compiler will not implicitly do that for us, we need to forcibly cast it ourselves to pass that into the method (ie:`(int) 1.5`). Therefore, the compiler automatically picks the first method call without even checking for the third argument because that is the only method that can be called. Thus, the output: `double: 10.0, double: 1.5, double: 99.0` is printed to the console.
- Since, there is no `print(float)`, the compiler can only pick the `print(double)` method and it will do the same but remember that even this promotion (athough a widening conversion) is not a widening conversion without any data loss. Converting a `float` to `double` also sometimes results in a data loss like in this case. It isn;t exactly the value you expect it to be. Thus, the output is printed to the console as `double: 1.2300000190734863`. You do not have to know which all values cause this error but just note that there are some values that can cause errors like this. This is not unique to the Java language and in fact and can happen in any language because it is in fact, a hardware problem and can also happen in any hardware.
- [Limitations of floating point numbers](https://wiki.sei.cmu.edu/confluence/display/c/FLP00-C.+Understand+the+limitations+of+floating-point+numbers)
