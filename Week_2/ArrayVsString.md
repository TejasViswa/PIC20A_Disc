# Arrays Vs Strings

In Java, arrays and strings differ in terms of mutability:

- Arrays are mutable: The values stored in an array can be modified after the array has been created. Elements can be added, removed, or changed within an array.

- Strings are immutable: Once a string object is created, its contents cannot be modified. Any operation that appears to modify a string actually creates a new string object with the modified contents.

Here are some examples to illustrate the difference:

Modifying an array:

```java
int[] myArray = {1, 2, 3};
myArray[1] = 4;
```
In this example, the value at index 1 of the myArray array is modified from 2 to 4.

Modifying a string:

```java
String myString = "Hello, world!";
myString = myString.replace("Hello", "Hi");
```
In this example, a new string object is created with the modified contents ("Hi, world!"), and the myString variable is assigned to this new object.

In summary, arrays are mutable in Java, meaning that their contents can be modified after they are created. Strings, on the other hand, are immutable and cannot be modified once they are created. Any operation that appears to modify a string actually creates a new string object with the modified contents.

[Learn more about the differences between arrays and strings](https://www.geeksforgeeks.org/difference-between-array-and-string-in-java/)
