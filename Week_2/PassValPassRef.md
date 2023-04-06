# Pass by value Vs Pass by reference

## C++
In C++, when a variable is passed to a function, a copy of the variable is created and passed to the function. Any changes made to the variable inside the function will not affect the original variable. However, it is possible to pass a reference to a variable by using the `&` operator. When a reference is passed to a function, any changes made to the reference inside the function will affect the original variable. Here is an example:

```c++
#include <iostream>
using namespace std;

void increment(int &x) {
    x++;
}

int main() {
    int x = 5;
    increment(x);
    cout << "x = " << x << endl; // Output: x = 6
    return 0;
}
```
In this example, the function increment() takes a reference to an integer x. When the increment() function is called with x as an argument, the reference to x is passed to the function. Inside the function, the reference to x is incremented by 1. This change is reflected in the original variable x when the function returns.

## Python
In Python, everything is an object, and variables are simply references to objects. When a variable is passed to a function, a reference to the object is passed to the function. Any changes made to the object inside the function will affect the original object. Here is an example:

```py
def increment(x):
    x += 1

x = 5
increment(x)
print("x =", x) # Output: x = 5
```
In this example, the increment() function takes a variable x. When the increment() function is called with x as an argument, a reference to the integer object 5 is passed to the function. Inside the function, the += operator creates a new integer object with a value of 6, but this new object is not associated with the original variable x.

In summary, in C++, pass by value is the default way to pass variables to a function, but a reference can be passed using the '&' operator. In Python, everything is an object, and variables are simply references to objects, so passing by reference is the default behavior. In Java, both pass by value and pass by reference are supported, depending on the whether a primitive variable or an object is being passed.

But officially, in Java, everything is pass by value.

What does this mean?

In Java, most of the data types such as `int`, `float`, `double`, `boolean`, and `char` are passed by value. When a variable is passed by value, a copy of the variable is created and passed to the method. Any changes made to the variable inside the method will not affect the original variable. For example:

```java
public class Example {
    public static void main(String[] args) {
        int x = 5;
        increment(x);
        System.out.println("x = " + x); // Output: x = 5
    }
    public static void increment(int x) {
        x++;
    }
}
```
In this example, the value of x is 5 before the method increment() is called. Inside the method, a copy of x is created, and it is incremented by 1. However, the value of x outside the method remains unchanged.

Please read this before you read the next section: [References and Objects in Java](RefAndObj.md)

Now, remember that almost everything in Java is pass by value. What do I mean exactly by that?

Take a look at the following code:

```java
public class Example {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        increment(arr);
        System.out.println(Arrays.toString(arr)); // Output: [2, 3, 4]
    }
    public static void increment(int[] farr) {
        for (int i = 0; i < arr.length; i++) {
            farr[i]++;
        }
    }
}
```
In this example, an array arr is created with three elements. When the method increment() is called, a reference to the array (arr) is passed by value to farr, and inside the method, each element of the array is incremented by 1. The changes made inside the method affect the original array, and the output of the program is [2, 3, 4].

This may seem confusing as why something passed by value can still change something in the main method but let us draw the memory diagram for this:
1. When `int[] arr = {1, 2, 3}`, we have the following in stack and heap:
![image](https://user-images.githubusercontent.com/45400093/230513465-2a4013c7-7ab5-40c8-b638-1741905cee14.png)
2. When `increment(arr)` is called and `farr` is initialized, both reference the same object:
![image](https://user-images.githubusercontent.com/45400093/230513856-39c786d1-2fd7-439a-bf52-917e09bac635.png)
3. When `for-loop` is executed and the values are changed, the changes are reflected in both the array references:
![image](https://user-images.githubusercontent.com/45400093/230513417-dbd83ac9-c3b1-427d-ad58-43061a514e91.png)
4. After `increment(arr)` finishes execution and `farr` goes out of scope:
![image](https://user-images.githubusercontent.com/45400093/230513523-8ac5fdce-b442-4886-8432-dee480a28d39.png)


[Learn more about pass by value Vs pass by reference](https://stackoverflow.com/questions/373419/whats-the-difference-between-passing-by-reference-vs-passing-by-value/430958#430958)

[Learn about more about why Java is mostly pass by value](https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value)
