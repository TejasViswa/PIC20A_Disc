# Static fields

In Java, you can essentially create 3 types of variables based on its scope:
- static fields
- instance fields
- local variables (local to method)

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
