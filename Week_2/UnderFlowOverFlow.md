# Overflow and Underflow in Java

In Java, overflow and underflow can occur when working with numerical data types, such as `int`, `long`, `float`, and `double`. Overflow occurs when a value exceeds the maximum representable value for its data type, while underflow occurs when a value falls below the minimum representable value for its data type.

For example, consider the following code:

```java
int a = 2147483647;    // max value for an int
a = a + 1;             // a now overflows, becoming -2147483648 (the min value for an int)
```
In this example, the variable a is initialized with the maximum value representable by an int. When we attempt to increment it by 1, it overflows and becomes the minimum value for an int, which is negative.

Similarly, underflow can occur when subtracting from the minimum representable value of a data type. For example:

```java
int b = -2147483648;   // min value for an int
b = b - 1;             // b now underflows, becoming 2147483647 (the max value for an int)
```
In this example, the variable b is initialized with the minimum value representable by an int. When we attempt to subtract 1 from it, it underflows and becomes the maximum value for an int.

Overflow and underflow can also occur when working with floating-point data types, such as float and double. In these cases, the overflow and underflow conditions are different, and depend on the exponent of the floating-point number.

To prevent overflow and underflow, it's important to ensure that the values being used and calculated with are within the range of their respective data types. In some cases, you may need to use a larger data type to accommodate larger values. You can also use error-checking techniques, such as range checking and boundary checking, to detect and prevent overflow and underflow conditions.

## Questions to ask yourself
1. What is the output if you add a to itself instead of 1 (ie:`a = a + a`)?
2. What is the output if you multiply a with itself instead of adding 1 (ie:`a = a * a`)?
### Hint:
- Remember there is a wrap-around happening. Meaning, it loops within the range over and over whenever the value exceeds its range.
- A good way to think about this is the `%` (modulo) operator and how it works. Anytime you divide a number a number `m` with another number `n`, the remainder is always in the range  - `0 to n-1`. Meaning, regardless of how big the number `m` is, the final output range is always within `0 to n-1`.
- For eg: `47 % 5 = 2`, `578 % 5 = 3`, `5000 % 5 = 0` - Notice how the result is always within the range of `0 to 5` regardless of the size of the number the I'm dividing.

[Reference]((https://www.baeldung.com/java-overflow-underflow))
