# Strings in Java

In Java, a String is an object that represents a sequence of characters. String objects are immutable, which means that once a String object is created, its contents cannot be changed.

When a String object is created in Java, it is stored in the heap, along with other objects. However, Java has a special mechanism for storing String objects in a pool, known as the string pool.

The string pool is a specific area of the heap where Java stores unique String objects. When a String object is created using a string literal, such as "Hello, world!", Java first checks the string pool to see if an identical string already exists in the pool. If it does, then the new String object is simply a reference to the existing object in the pool. If the string is not already in the pool, then a new String object is created and added to the pool.

Here's an example:

```java
String s1 = "Hello, world!";
String s2 = "Hello, world!"; // s2 is a reference to the same object as s1
String s3 = new String("Hello, world!"); // s3 is a new object, not in the string pool

System.out.println(s1 == s2); // prints true
System.out.println(s1 == s3); // prints false
System.out.println(s1.equals(s3)); // prints true
```
In this example, s1 and s2 both reference the same object in the string pool, since they were created using the same string literal. s3, on the other hand, is a new String object that was created using the new keyword, so it is not in the string pool.

Because String objects are immutable, any operation that appears to modify a String object actually creates a new String object. For example:

```java
String s1 = "Hello";
String s2 = s1 + ", world!";

System.out.println(s1); // prints "Hello"
System.out.println(s2); // prints "Hello, world!"
System.out.println(s1 == s2); // prints false
```
In this example, s2 is created by concatenating s1 with the string ", world!". However, this operation does not modify the existing s1 object; instead, a new String object is created and assigned to s2.

More info - Because String objects are immutable, they can be safely shared between multiple threads in a multithreaded application. Additionally, because Java can store identical String objects in the string pool, this can help reduce the memory usage of a Java program.

## Examples

### Example 1:

String literals are stored in the string pool

```java
String s1 = "Hello";
String s2 = "Hello";

System.out.println(s1 == s2); // prints true
```
In this example, s1 and s2 are both assigned the string literal "Hello". Because string literals are stored in the string pool, both variables reference the same String object in memory, so s1 == s2 returns true.

### Example 2:
String objects created using the new keyword are stored in the heap

```java
String s1 = new String("Hello");
String s2 = new String("Hello");

System.out.println(s1 == s2); // prints false
```
In this example, s1 and s2 are both created using the new keyword, which creates a new String object in the heap. Because each String object is a distinct object in memory, s1 == s2 returns false.

### Example 3:
Concatenating strings using the + operator creates a new object in the heap

```java
String s1 = "Hello";
String s2 = " world!";
String s3 = s1 + s2;

System.out.println(s3 == "Hello world!"); // prints false
```
In this example, s3 is created by concatenating the String object referenced by s1 with the string " world!" using the + operator. Because the + operator creates a new String object in the heap, the expression "Hello world!" is a new String object in the heap, so s3 == "Hello world!" returns false.

### Example 4:
String objects created using the intern() method are stored in the string pool

```java
String s1 = new String("Hello").intern();
String s2 = new String("Hello").intern();

System.out.println(s1 == s2); // prints true
```
In this example, s1 and s2 are both created using the new keyword, which creates a new String object in the heap. However, the intern() method is called on each String object, which adds them to the string pool. Because both String objects now reference the same object in the string pool, s1 == s2 returns true.
