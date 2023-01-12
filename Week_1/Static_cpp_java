# Comparison of static keyword in C++ and Java

Static keyword is used for almost the same purpose in both C++ and Java. There are some differences though. This post covers similarities and differences of static keyword in C++ and Java. 

### Similarities between C++ and Java for Static Keyword:

- Static data members can be defined in both languages.
- Static member functions can be defined in both languages.
- Easy access of static members is possible, without creating some objects.

### Differences between C++ and Java for Static Keyword:

- C++ doesn’t support static blocks. Java supports static block (also called static clause). It is used for the static initialization of a class.
- Static Local Variables can be declared. Static Local Variables are not supported.

### Static Data Members
Like C++, static data members in Java are class members and shared among all objects. For example, in the following Java program, the static variable count is used to count the number of objects created.

```c++
class Test {
	static int count = 0;

	Test() { count++; }
	public static void main(String arr[])
	{
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println("Total " + count
						+ " objects created");
	}
}

```

### Static Member Methods
In C++ and Java, static member functions can be defined. Methods declared as static are class members and have the following restrictions:
1. They can only call other static methods. For example, the following program fails in the compilation. fun() is non-static and it is called in static main().
```java
class Main {
	public static void main(String args[])
	{
		System.out.println(fun());
	}
	int fun() { return 20; }
}
```
2. They must only access static data.
3. They cannot access this or super. (If you don't know what these are, it is alright)
4. Like C++, static data members and static methods can be accessed without creating an object. They can be accessed using the class names. For example, in the following program, static data member count and static method fun() are accessed without any object. 
```java
class Test {
	static int count = 0;
	public static void fun()
	{
		System.out.println("Static fun() called");
	}
}

class Main {
	public static void main(String arr[])
	{
		System.out.println("Test.count = " + Test.count);
		Test.fun();
	}
}
```
Output
```
Test.count = 0
Static fun() called
```
### Static Block
Unlike C++, Java supports a special block, called static block (also called static clause) which can be used for static initialization of a class. This code inside the static block is executed only once.
### Static Local Variables
Unlike Java, C++ supports static local variables. For example, the following Java program fails in the compilation. 
```java
class Test {
	public static void main(String args[])
	{
		System.out.println(fun());
	}
	static int fun()
	{

		// Compiler Error: Static local
		// variables are not allowed
		static int x = 10;
		return x--;
	}
}
```
