# Midterm Review - Part 3

# Basics
## Control Flow and Loops
- Read the snippet `ControlFlowAndLoop.java`.
- If you want to practice similar questions, try out these questions - [Practice problems on arrays and strings](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/ProblemSolving.md)
- If you have any questions, do ask me or email me.

## Objects
- Read the snippet `Objects.java` and draw the memory diagrams for the same and verify using the debugger.
- Go through the following links to refresh your memory on memory diagrams:
  - [Sample Code and Memory Diagram](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/SampleCodeNMemDiag.md)
  - [Sample Code with Arrays and Memory Diagrams](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/SampleArrayNMemDiag.md)
  - [Sample Code with 2D Array and Memory Diagrams](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/SampleMultiArrayNMemDiag.md)

## Java Packages
Read the snippets (except `JavaAPI.java`) in `a brief tutorial on package.zip`.
### Create and use a Java package
1. **Create a directory for your package** - Choose a name for your package and create a directory with that name. For example, if you want to create a package named `myPackage`, create a directory named `myPackage`.
2. **Create your Java classes** - Create your Java classes and save them in the directory you created in step 1. Make sure that each class has a package statement at the beginning, specifying the name of your package. For example, if you created a class named `MyClass`, the package statement should be:
```java
package myPackage;
```
3. **Compile your classes**: Compile your Java classes using the command line or an IDE. If you're using the command line, navigate to the directory containing your package and use the **javac** command to compile your classes. For example, if your package is in a directory named `myPackage` and your class is named `MyClass`, use the following command:
```java
javac myPackage/MyClass.java
```
4. **Run your file**: `cd` to the directory where the file is located and execute the following command:
```java
java myPackage/MyClass
```
5. **Use your package**: To use your package in another Java program, you may import your classes and use them in your program. For example, if you want to use the `MyClass` class from your `myPackage` package, use the following import statement:
```java
import myPackage.MyClass;

// You can then create an instance of the class and use its methods:
MyClass myObject = new MyClass();
myObject.myMethod();
```
### Access Modifiers
| | private | default (package - private) | public |
| :== | :==: | :==: | :==: |
| Same Class | Yes | Yes | Yes |
| Different Class but same package | No | Yes | Yes |
Different Class, different package | No | No | Yes |

where:
- Yes indicates that the class is accessible with the access specifier
- no indicates that the class is inaccessible with the access specifier

## Java API
- Read `JavaAPI.java` in `a brief tutorial on package.zip`.
- There are many useful classes defined in packages such as `java.lang` and `java.util`, and one can import them at
the beginning of the program in order to use them conveniently.
### Importing Java APIs
There are different ways to import Java APIs like java.lang based on the specificity of the classes you need to use.
1. **Import specific classes** - You can import specific classes from the java.lang package using the import statement followed by the fully qualified name of the class. For example:
```java
import java.lang.String;
// This approach allows you to import only the classes you need and avoid namespace conflicts.
```
2. **Import all classes from a package** - You can import all classes from a package using the asterisk (`*`) wildcard character. For example:
```java
import java.lang.*;
// This approach imports all classes from the specified package and can save you time typing import statements, but it can also lead to namespace conflicts.
```
3. **Use fully qualified names** - Instead of importing classes, you can use their fully qualified names in your code. For example:
```java
java.lang.String myString = "Hello, world!";
// This approach avoids namespace conflicts and can make your code more readable, but it can also make your code more verbose.
```
4. **Static import** - If you want to use static methods or constants from a class, you can use the static import statement. For example:
```java
import static java.lang.Math.PI;
import static java.lang.Math.cos;

double angle = PI / 4;
double result = cos(angle);
// This approach allows you to use static methods or constants without having to qualify them with the class name. However, it can also make your code less readable if used excessively.
```
