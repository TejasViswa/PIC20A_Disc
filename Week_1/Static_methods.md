# Static Methods

## Need for static

Following are three "Hello World" programs in three different languages namely C++, Python and Java respectively:

```c++
// A C++ Hello World Program

#include <iostream>

int main() {
    std::cout << "Hello World!";
    return 0;
}
```

```py
# A Python Hello World Program

def main():
    print("Hello World!")

if __name__ == "__main__":
    main()
```
```java
// A Java Hello World Program

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
In all three programs, irrespective of language, the code that needs to be executed/your program is written within the main method/function.

Now, realize that this main method/function is also a method/function, meaning, it is a method/function that needs to be called.
And for any language that you write this method, it is called either by the operating system (OS) or the language interpreter.
as it is the starting point for the serial execution of your program.
ie: All the lines of code are executed left to right and top to bottom.

For C++, the operating system, you are running it on, calls the main function.
For python, the interpreter calls the main function.
For Java, the interpreter which is a part of the JVM (Java Virtual Machine) calls the main method.

But then, we know that Java is a purely object oriented language (in the future, you will learn of an exception called lambdas but you can ignore this for now) and that means we cannot call a method as it is without creating an object. (more specifically an instance method)

What do I mean by that?

You cannot have a method defined like this in Java but it is okay to do so in C++ and Python:
```java
// This is not allowed
public void callMe(){
    System.out.println("You just called me!");
}

public class Hello {
    public static void main(String[] args) {
        callMe();
    }
}
```
Java does not allow this and similarly, Java does not also allow this:
```java
// This is not allowed
public static void main(String[] args) {
    callMe();
}
```
Java requires that every variable/field or method/function that you create must be wrapped around in its own class. Nothing can exist outside this.
Interesting, this also means that the concept of global variables does not exist in Java like it does in C++ where the following is allowed:
```c++
#include <iostream>
// This is allowed and in fact, this variable is a global variable, meaning, it can be accessed from anywhere within this program(any function/main function)
int gbl = 5;

int main()
{
    std::cout<<gbl<<std::endl;  // Outputs 5
    return 0;
}
```

Now then, to solve this problem of the method existing outside the class, we wrap it around a class as shown:
```java
// While this is allowed, this still does not solve the problem as the method cannot be called without creating an object
class CallMeClass{
    public void callMe(){
        System.out.println("You just called me!");
    }
}
public class Hello {
    public static void main(String[] args) {
        callMe();
    }
}
```
Note: While we are allowed to define multiple classes within the file, we can define only 1 public class within the same file. To define the other class as public, we need to create another file for that class. Also note that the name of the file will also be the same as the public class name.

Now, we have successfully wrapped the method around with a class but, remember that, to call member method of a class, you will need to instantiate/create an object of that class to call it. Otherwise it will give you an error.

Therefore, we change the program to as follows:
```java
class CallMeClass{
    public void callMe(){
        System.out.println("You just called me!");
    }
}
public class Hello {
    public static void main(String[] args) {
        CallMeClass c = new CallMeClass();  // c is an object of type CallMeClass
        c.callMe(); // Using c, we can now call the callMe method
    }
}
```
In Java, we can create objects from a class using the `new` method as shown above. Once, we create an object, we use it using the `.`(dot) operator to call its method as shown in the above code.

Alternatively, we could've create the method as part of the same class and created an isntance of the same class and call it as shown:
```java
public class Hello {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.callMe();
    }
    public void callMe(){
        System.out.println("You just called me!");
    }
}
```

If all of this seems too much of a hassle to do just to call a method, we can reduce the effort by using the static keyword as shown below:
```java
public class Hello {
    public static void main(String[] args) {
        callMe();
    }
    public static void callMe(){
        System.out.println("You just called me!");
    }
}
```
Notice what the `static` keyword does... it allows us the call the method without actually creating an object of the class. It, now, seems similar to the free function in C++ and Python, right?

Additonally, if we were to use static for the other method, we should've used the class' name to call the method as shown:
```java
class CallMeClass{
    public static void callMe(){
        System.out.println("You just called me!");
    }
}
public class Hello {
    public static void main(String[] args) {
        CallMeClass.callMe(); // Notice how I'm still not creating an object but only calling the method albeit using the class name now
    }
}
```

Now, we can finally understand why there is a `static` keyword in the main method as the Java interpreter only calls your method but does not create an object each time it calls it.

`static` means something that is associated with the class and not the object. (You will learn more about this later)

## NOTE:
Unlike C++, `static` variables/fields are not allowed within methods in Java but they can be declared within a class and outside a method.
