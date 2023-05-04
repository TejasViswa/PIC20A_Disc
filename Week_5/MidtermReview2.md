# Midterm Review Part - 2

# Basics
## Math Functions
- Read the snippet `MathFunctions.java`
# Exercise
### Question 1
What is the output of the following code snippet?
```java
double x = -4.5;
System.out.println(Math.abs(Math.round(x)));
```
`5`- The Math.round(x) method will return -4 since -4.5 rounds to -4. Then, the Math.abs() method will return the absolute value of -4, which is 4.
### Quesrtion 2
What is the output of the following code snippet?
```java
double x = 3.14;
System.out.println(Math.floor(x));
```
`3` - The Math.floor(x) method will return the largest double value that is less than or equal to x, which is 3.0.
### Question 3
What is the output of the following code snippet?
```java
double x = 2.5;
double y = 3.0;
System.out.println(Math.pow(x, y));
```
`15.625` - The Math.pow(x, y) method will return x raised to the power of y, which is 2.5 raised to the power of 3.0. This is equivalent to 2.5 * 2.5 * 2.5, which equals 15.625.
### Question 4
What is the output of the following code snippet?
```java
double x = 2.5;
double y = 3.0;
System.out.println(Math.max(x, Math.pow(y, x)));
```
`15.0` - The Math.pow(y, x) method will return y raised to the power of x, which is 3.0 raised to the power of 2.5. This is approximately 15.59. Then, the Math.max(x, Math.pow(y, x)) method will return the larger of x and y^x, which is 15.0.
### Question 5
What is the output of the following code snippet?
```java
double x = 5.0;
System.out.println(Math.sqrt(-x));
```
`NaN` - The Math.sqrt() method only accepts non-negative arguments. Since -5.0 is negative, the method will return NaN, which stands for "Not a Number".
### Question 6
What is the output of the following code snippet?
```java
double x = 3.7;
System.out.println(Math.round(x));
```
`4` - The Math.round(x) method will return the closest long value to x, which is 4 since 3.7 is closer to 4 than to 3.
### Question 7
What is the output of the following code snippet?
```java
double x = -0.5;
System.out.println(Math.ceil(x));
```
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





