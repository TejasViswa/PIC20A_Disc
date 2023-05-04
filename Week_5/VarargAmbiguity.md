# Method Overloading and Vararg Ambiguity

Overloading allows different methods to have same name, but different signatures where signature can differ by number of input parameters or type of input parameters or both. We can overload a method that takes a variable-length argument by following ways:

# Example 1
Methods with only Varargs parameters: In this case, Java uses the type difference to determine which overloaded method to call. If one method signature is strictly more specific than the other, then Java chooses it without an error.
```java
//Java program to illustrate
//method overloading in varargs
public class varargsDemo
{
	public static void main(String[] args)
	{
		fun();
	}

	//varargs method with float datatype
	static void fun(float... x)
	{
		System.out.println("float varargs");
	}
	
	//varargs method with int datatype
	static void fun(int... x)
	{
		System.out.println("int varargs");
	}
	
	//varargs method with double datatype
	static void fun(double... x)
	{
		System.out.println("double varargs");
	}
}
```
Output:
```
int varargs
```
Here, int datatype is considered as being more specific that the other two
