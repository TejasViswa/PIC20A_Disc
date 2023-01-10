# Theory

## C++ vs Java

In Java, every variable, constant, and function (including main) must be inside some class. Here's a simple example program:

```java
class Test {
  public static void main( String [] args )
  {
      System.out.println("Hello world!");
  }
}
```

### Things to note:
- There is no final semi-colon at the end of the class definition.
- Function main is a member of class Test.
- In general, main must:
  - Be inside some class (there can be more than one main function -- there can even be one in every class!)
  - Be public static void.
  - Have one argument: an array of String. This array contains the command-line arguments. You can use args.length to determine the number of arguments (the number of Strings in the array).
  - To write to standard output, you can use either of the following:
	  - `System.out.println( ... )`
	  - `System.out.print( ... )`
    The former prints the given expression followed by a newline, while the latter just prints the given expression.
    
- Like the C++ << operator, these functions can be used to print values of any type. For example, all of the following are fine:
```java
	System.out.print("hello");   // print a String
	System.out.print(16);        // print an integer
	System.out.print(5.5 * .2);  // print a floating-point number
```       
- The + operator can be useful when printing. It is overloaded to work on Strings as follows:

- If either operand is a String, it converts the other operand to a String (if necessary) creates a new String by concatenating both operands
  - Example
  ```java
  int x = 20, y = 10;
	System.out.println("x: " + x + "\ny: " + y);
  ```
  - The output is:
  ```java
  x: 20
  y: 10
  ```
       
- This is because the argument to println is an expression of the form:
`op1 + op2 + op3 + op4`
- The only operator is +, so the expression is evaluated left-to-right (if there were another operator with higher precedence, the sub-expression involving that operator would be evaluated first). The leftmost sub-expression is: `"x: " + x`
- One operand (the left one) is a String, so the other operand is converted from an int to a String, and the two strings are concatenated, producing the value: `"x: 20"`
- Evaluation of the argument to println continues, producing as the final value the String shown above (note that \n means the newline character):
```java
	x: 20
 	y: 10
```       

## Excercise
Assume the following declarations have been made:
```java
int x = 20, y = 10;
```
What is printed when each of the following statements is executed?
```java
    System.out.println(x + y);
    System.out.println(x + y + "!");
    System.out.println("printing: " + x + y);
    System.out.println("printing: " + x * y);
```
solution
```
30
30!
printing: 2010
printing: 200
```
## C++ Files vs Java Files

A C++ programmer deals with source files, object files, and executable files:

- Source Files: .h and .cpp

  - created by:  you (the programmer)
  - contain   :  C++ source code
  - two kinds :
        - .h (header files) contain class definitions and function specifications (just headers - no bodies) must be included by every file that uses the class / calls the functions
        - .cpp contain implementations of class member functions and "free" functions, including the main function
	
- Object Files: .o

  - created by:  the compiler, when called w/ -c flag; for example: `g++ -c main.cc` compiles main.cc creating main.o
  - contain   :  object code (not executable)
               source code is compiled, but not linked/loaded
  
- Executable Files

  - created by:  the compiler (no -c flag)
  - contain   :  executable code
	 	      - Code is compiled if necessary, then linked and loaded. These are the files that you can actually run, just by typing the name of the file.
  - name      :  default = a.out
          - any other name is possible via the -o flag; for example: `g++ main.o -o test` creates an executable named "test"
  
A Java programmer deals with source files and bytecode files (no executable files):

- Source Files: .java

  - created by   :  you (the programmer)
  - contain      :  Java source code (one or more classes per file)
  - restrictions :
     1. each source file can contain at most one public class
     2. if there is a public class, then the class name and file name must match
     
  - Examples
    - If a source file contains the following:
    ```java
      public class Test { ... }
      class Foo { ... }
      class Bar {... }
    ```
    - then it must be in a file named Test.java
    - If a source file contains the following:
    ```java
      class Test { ... }
      class Foo { ... }
      class Bar {... }
    ```
    - then it can be in any ".java" file
	


- Bytecode Files: .class

  - created by:  the Java compiler
  - contain   :  Java bytecodes, ready to be "executed" -- really interpreted -- by the Java interpreter
  - names     :  for each class in a source file (both public and non-public classes), the compiler creates one ".class" file, where the file name is the same as the class name
  - Example
     - If a source file contains the following:
     ```java
     public class Test { ... }
     class Foo { ... }
     class Bar {... }
     ```
     - then after compiling you will have three files:
     ```java
     Test.class
     Foo.class
     Bar.class
     ```
  
### Notes:
- Every function must be part of a class.
- Every class is part of a package (packages are discussed in a later set of notes.).
- A public class can be used in any package.
- A non-public class can only be used in its own package.

### Execution
  
Here's how to compile and run the example "hello world" program given above, assuming that it is in a file named "tst.java":

to compile the source code, type: javac tst.java
to run the interpreter using the name of the class whose main function you want to run, type: java Test
Remember, when compiling a program, you type the full file name, including the ".java" extension; when running a program, you just type the name of the class whose main function you want to run.

