# Types of variables in Java

In Java, you can essentially create 3 types of variables based on its scope:

- Local variables
- Instance fields/variables
- Static fields/variables

```java
class CallMeClass{

    static int sfc = 5;   // static field
    int ifc = 6;    // instance field
    
    public static void callMe(){
        int lvc = 7;    // local variable
        System.out.println("You just called me!");
    }
}
public class StaticVarClass {

    static int sfh = 5;   // static field
    int ifh = 6;   // instance field
    
    public static void main(String[] args) {
        int lvh = 7;    // local variable
        
        System.out.println("local variable lvh = "+lvh);
        // System.out.println("local variable lvhc = "+lvhc);  // not allowed as lvhc does not exist beyond the scope of the method
        System.out.println("static field sfh = "+sfh);  // static fields within the same class can be accessed directly
        
        StaticVarClass s = new StaticVarClass();
        System.out.println("static field s.ifh = "+ s.ifh);  // instance fields can only be accessed after making a instance of the class
        
        System.out.println("static field CallMeClass.sfc = "+ CallMeClass.sfc);  // static fields of another class can be accessed using the class name and the dot operator
        
        CallMeClass c = new CallMeClass();
        System.out.println("static field c.ifc = "+c.ifc);  // instance fields can only be accessed after making a instance of the class
        
        // System.out.println("local variable lvc = "+lvc);  // not allowed as lvc does not exist beyond the scope of the method
        
    }
    
    public static void callMe(){
        int lvhc = 8;    // local variable
    }
}
```
- Local variables
    - A variable defined within a block, method or constructor is called a local variable.(don't worry about blocks or constructors for now, just know that any variable you declare within a method is a local variable)
    - These variables are created when the block is entered, or the function is called and destroyed after exiting from the block or when the call returns from the function.
    - The scope of these variables exists only within the block in which the variables are declared, i.e., we can access these variables only within that block.
    - Initialization of the local variable is mandatory before using it in the defined scope. (Unlike C++ which gives you a garbage/random value, accessing the value of an uninitialized local variable in Java will throw a compiler error)
- Instance fields
    - Instance variables are non-static variables and are declared in a class outside of any method, constructor, or block. 
    - As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed (goes out of scope).
    - Unlike local variables, we may use access specifiers(ie: public, private, etc) for instance variables. If we do not specify any access specifier, then the default access specifier will be used. (you don't have to worry about this for now)
    - Initialization of an instance variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
    - Instance variables can be accessed only by creating objects.
    - We initialize instance variables using constructors while creating an object. We can also use instance blocks to initialize the instance variables.
- Static variables
    - Static variables are also known as class variables. 
    - These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
    - Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
    - Static variables are created at the start of program execution and destroyed automatically when execution ends.
    - Initialization of a static variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
    - If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won’t halt the program. The compiler will replace the object name with the class name automatically.
    - If we access a static variable without the class name, the compiler will automatically append the class name. But for accessing the static variable of a different class, we must mention the class name as 2 different classes might have a static variable with the same name.
    - Static variables cannot be declared locally inside an instance method.
    - Static blocks can be used to initialize static variables.
