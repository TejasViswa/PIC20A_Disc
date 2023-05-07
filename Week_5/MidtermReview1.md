# Midterm Review - Part 1

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
### `final` keyword
- In Java, the final keyword can be used to declare a variable as a constant. When a variable is declared as final, its value cannot be changed after initialization. This applies to all data types, including primitive data types.
```java
final int x = 5;
x = 10; // Compilation error: cannot assign a value to final variable x
```
- In this example, x is declared as a final variable with an initial value of 5. When we try to assign a new value to x in the next line, a compilation error occurs because x is a constant and its value cannot be changed.
- Additional info not required for exam: It's important to note that declaring a variable as final does not make it immutable. For example, if we declare a final variable of an object type, we can still modify the state of the object it references. It just means that we cannot change the address that it references.

## Conversions between primitive data types
- Please read `Conversions.java` carefully

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

### Compound Casting
Compound casting, also known as cascading or chained casting, is a technique used in Java to cast a variable to multiple data types in a single statement. It involves casting a variable to a wider data type and then casting it again to a narrower data type.
```java
int i = (int) (long) (float) 123.45;
````
This statement casts the floating-point literal 123.45 to float, then to long, and finally to int. It is equivalent to the following sequence of statements:
```jav
float f = 123.45f;
long l = (long) f;
int i = (int) l;
```
Compound casting is often used when converting between different data types, especially when working with mathematical expressions or in performance-critical code where minimizing the number of intermediate variables can be beneficial. However, it can also lead to unexpected results if not used carefully, especially when casting between signed and unsigned data types or when casting values beyond the range of a data type.

# Exercise
## Question 1
What is the result of the following code snippet?
```java
// max value of short is 32767
// max value of byte is 127
short s = 32767;
byte b = (byte) s;
int i = b * 2;
System.out.println(i == s*2);
```
### Answer
`false` - In this example, we start with a short variable s that has a value of 32767, which is the largest value a short can hold. We then cast it to a byte, which can only hold values between -128 and 127. This causes a loss of information, so b now has a value of -1 *(this is because of the wrap-around operation that happens when you assign a value that is greater than the limit of the datatype - to actually calculate this value, you can mod(%) the input value with the range of byte (127 - (-128) = 256) and wrap-around this remainder around its range -> 255 is the remainder and it wraps around the range of byte till we get the value '-1')*. We then multiply b by 2, which gives us -2, and assign the result to an int variable i. The result of i is -2.

## Question 2
What is the result of the following code snippet?
```java
// max value of byte is 127
// min value of byte is -128
float f = 1.28f;
byte b = (byte)(int)(long) (f * 100);
System.out.println(b);
```
### Answer
`-128` - In this example, we start with a float variable f that has a value of 1.28, which we then multiply by 100 and cast to a long. This gives us a value of 128, which fits within the range of a long. We then cast l to an int, which still fits within the range of an int. Finally, we cast i to a byte, which can only hold values between -128 and 127. Since the value of i is 128, which is one more than the range of a byte, the cast essentially wraps around the value to the min value of byte which is -128 (underflow).

## Question 3
What is the result of the following code snippet?
```java
// max value of short is 32767
// min value of short is -32768
short s1 = 32767;
short s2 = 32767;
int i = (int) s1 + s2;
System.out.println(s1 + s2 == i);
```
### Answer
`true` - In this example, we start with two short variables s1 and s2 that have their max values, respectively. We add them together while casting one of them to an int and store them in an int. Rememeber that addition of any integral datatypes below an int will result in an int. Thus, the addition automatically gives an int which can store that value because int's range is greater and when we compare them it will definitely be true.

## Question 4
What is the result of the following code snippet?
```java
// max value of short is 2_147_483_647
// min value of short is -2_147_483_648
int i1 = 2_147_483_647;
int i2 = 2_147_483_647;
long l = (long) i1 + i2;
System.out.println(i1 + i2 == l);
```
### Answer
`false` - In this example, we start with two int variables i1 and i2 that have their max values, respectively. We add them together while casting one of them to an long and store them in an long (Addition promotes both of them to long and they are stored without any loss of data). Rememeber that addition of any two int will result in an int. Thus, the addition automatically gives an int which cannot store that value because int's range is smaller than the sum and when we compare them it will be false.

## Question 5
What is the result of the following code snippet?
```java
// ASCII / Unicode values for:
// 'c' is 99
// 'd' is 100
double d = ('c'+'d')/'c';
float f = (float) d;
System.out.println(f);
```
### Answer
`2.0` - ('c'+'d') adds upto to 199 (char + char gives int) and 199/'c' gives 199/99 (integer division) which is 2 and is then stored into double as 2.0. Even though it is casted into float, there is no loss of data as it is within the range of float and thus the output is 2.0. Please remember that you cannot directly assign a double literal (something like `1.5`) into a float. It has to be casted into a float or a float literal has to be used (something like `1.5f`).
