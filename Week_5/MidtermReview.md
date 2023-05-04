# Midterm Review

# Basics
## Compile and run Java files
![image](https://user-images.githubusercontent.com/45400093/236096191-11d60e10-7ad9-45ff-b82d-2bd34ef8a494.png)

[Additional Information on how Java Files are executed](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_1/JavaExecution.md)

## Primitive Types
- Read the `VariablesOfPrimitiveType.java` file really well
### Rules for Operations on Mixed Datatype operands
The following rules apply for all the standard primitive data types - `byte`, `short`, `char`, `int`, `long`, `float`, and `double` :
 - If either operand is a double, the other operand is converted to a double.
 - Otherwise, if either operand is a float, the other operand is converted to a float.
 - Otherwise, if either operand is a long, the other operand is converted to a long.
 - Otherwise, both operands are converted to an int.
 
1. If either operand is a double, the other operand is converted to a double:
```java
double d = 3.14;
int i = 10;
double result = d + i; // i is promoted to double before the addition
System.out.println(result); // Output: 13.14
```
2. If either operand is a float, the other operand is converted to a float:
```java
float f = 2.5f;
long l = 100;
float result = f * l; // l is promoted to float before the multiplication
System.out.println(result); // Output: 250.0
```
3. If either operand is a long, the other operand is converted to a long:
```java
long l = 10000000000L;
int i = 10;
long result = l / i; // i is promoted to long before the division
System.out.println(result); // Output: 1000000000
```
4. Otherwise, both operands are converted to an int:
```java
byte b = 5;
char c = 'A';
int result = b + c; // both b and c are promoted to int before the addition
System.out.println(result); // Output: 72
```
## Assigning values to a variable beyond its range
- There is a wrap-around operation that happens for integral datatypes when you assign a value that is beyond the range of data type. This is applicable for the integral data types like `byte`, `short`, `char`, `int`, and `long`.
- For example, if you assign a value greater than the maximum value of an `int` to an `int` variable, the value will wrap around to the minimum value of an `int`. Similarly, if you assign a value less than the minimum value of an `int` to an `int` variable, the value will wrap around to the maximum value of an `int`. This is known as integer overflow and underflow, respectively.
- [Read more on Underflow and Overflow](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/UnderFlowOverFlow.md)
```java
int x = 2147483647; // maximum value of int
x = x + 1;
System.out.println(x); // output: -2147483648
```
- For floating precision data types like `float` and `double`, the value is capped to positive or negative infinity.
- For example, assigning a value greater than the maximum value of a double to a double variable will result in the value being set to `Double.POSITIVE_INFINITY`. Conversely, assigning a value less than the minimum value of a double to a double variable will result in the value being set to `Double.NEGATIVE_INFINITY`.
```java
double x = Double.MAX_VALUE;
x = x * 2;
System.out.println(x); // output: Infinity
```
## Conversions
|To \ From|byte|short|char|int|long|float|double|
| :---        |    :----:   | :----:   | :----:   | :----:   | :----:   | :----:   | :----:   | 
|byte|N/A|N|N|N|N|N|N|
|short|W|N/A|N|N|N|N|N|
|char|W|W|N/A|N|N|N|N|
|int|W|W|W|N/A|N|N|N|
|long|W|W|W|W|N/A|N|N|
|float|WL|WL|WL|WL|WL|N/A|N|
|double|WL|WL|WL|WL|WL|WL|N/A|

Where:
- W denotes a widening conversion, which is guaranteed to not result in a loss of data.
- Wl denotes a widenin conversion, which may result in a possible loss of data.
- N denotes a narrowing conversion, which may result in a possible loss of data.
- N/A indicates that no conversion is necessary.

In general:
- Widening conversions between integral types(`byte`,`short`,`char`,`int`,`long`) guarantee that there is no loss of data
- Widening conversions between integral to floating or floating to floating types (floating types are `float` and `double`) may or may not result in data loss
- All narrowing conversions may or may not result in data loss
