# Midterm Solutions

## Problem 1
Read the following code (saved in a file called `Question1.java`), and answer the following   
questions (a)-(e).
```java
public class Question1 {
    public static void main(String[] args) {
        byte minByte = -128;
        byte maxByte =  127;
        short minShort = -32768;
        short maxShort =  32767;
        int minInt = -2147483648;
        int maxInt =  2147483647;

        final double PI = 3.14;
        // PI = 3.1415;     System.out.println(PI);

        short s = 1000;
        // System.out.println(s == (int) (byte) s);

        byte b = 100;
        // f(b + s);

        float f = 0.0f; double d = 10.5;
        // f = d;   System.out.println(f);

        int n = g('J','a','v','a');
        System.out.println(n);
    }

    public static void f(byte b) {System.out.println("byte type");}
    public static void f(short s) {System.out.println("short type");}
    public static void f(int i) {System.out.println("int type");}
    public static void f(long l) {System.out.println("long type");}

    public static int g(char... ch) {
        int NUM = 0;
        for(char c:ch) {
            int num = c;
            if (num > NUM) { NUM = num; }
        }
        return NUM;
    }
}
```
### Part (a)
Suppose we use the Command-Line interface to compile and run `Question1a.java`.  
Suppose we already changed the directory to the folder where `Question1a.java` is   
located. What line(s) should we input to the Command-Line interface?
- (A) `java Question1a`
- (B) `javac Question1a.java`
- (C) `javac Question1a`    
      `java Question1a.java`    
- (D) `javac Question1a.java`   
      `java Question1a`
#### Answer
- (D) `javac Question1a.java`   
      `java Question1a`

### Part (b)
What happens when you uncomment the line that reads   
`// PI = 3.1415926; System.out.println(PI);`?
- (A) compile-time error, give a reason in the box below if you select this option.
- (B) code executes successfully to give an output of `3.14`.
- (C) code executes successfully to give an output of `3.1415926`.
#### Answer
- (A) compile-time error
```
Reassigning a variable that is declared 'final' is not allowed
```

### Part (c)
What happens when you uncomment the line that reads   
`// System.out.println(s == (int) (byte) s));`?
- (A) compile-time error, give a reason in the box below if you select this option.
- (B) code executes successfully to give an output of `true`.
- (C) code executes successfully to give an output of `false`.
#### Answer
- (C) code executes successfully to give an output of `false`.

### Part (d)
What happens when you uncomment the line that reads   
`// f(b+s);`?
- (A) compile-time error, give a reason in the box below if you select this option.
- (B) code executes successfully to give an output of Input is `byte type.`.
- (C) code executes successfully to give an output of Input is `short type.`.
- (D) code executes successfully to give an output of Input is `int type.`.
- (E) code executes successfully to give an output of Input is `long type.`.
#### Answer
- (D) code executes successfully to give an output of Input is `int type.`.

### Part (e)
What happens when you uncomment the line that reads   
`// f = d; System.out.println(f);`?
- (A) compile-time error, give a reason in the box below if you select this option.
- (B) code executes successfully to give an output of `0.0`.
- (C) code executes successfully to give an output of `10.5`.
#### Answer
- (A) compile-time error
```
Compiler cannot perform an implicit narrowing conversion from 'double' to 'float'
```

### Part (f)
`// int n = g('J','a','v','a');`   
`// System.out.println(n);`?
Hint: The following ASCII table might be helpful.
- (A) compile-time error, give a reason in the box below if you select this option.
- (B) code executes successfully, write down the output in the box below if you
select this option.
#### Answer
- (B) code executes successfully
```
118
```

## Problem 2
The following code (saved in a file called `Question2.java`)
compiles and executes successfully.
```java
public class Question2 {
    public static void main(String[] args) {
        int[] arr1, arr2, arr3, arr4;

        arr1 = new int[] {1, 1, 1, 1, 1};
        arr2 = new int[] {5, 5, 5, 5, 5};
        arr3 = arr2;

        arr3[3] = 1;

        arr2 = new int[] {8, 8, 8, 8, 8};

        f1(arr1);
        f2(arr2);

        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
        System.out.println(java.util.Arrays.toString(arr3));
    }

    public static void f1(int[] arr) {
        arr[0] = 2;
        arr = new int[] {0, 0, 0, 0};
    }

    public static void f2(int[] arr) {
        arr = new int[] {0, 0, 0, 0};
        arr[0] = 2;
    }
}
```
Write down the output from executing the code in the following box.
#### Answer
```
[2, 1, 1, 1, 1]
[8, 8, 8, 8, 8]
[5, 5, 5, 1, 5]
```

[Detailed Memory Diagram for Problem 2](MidProb2.md)

## Problem 3
The following code implements the `Point3D` class (saved in a file called `Point3D.java`).
```java
// Point3D.java

class Point3D {
    public double x;
    public double y;
    public double z;

    public Point3D(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    public Point3D() { x = 0; y = 0; z = 0; }

    public Point3D(Point3D p) { this(p.x, p.y, p.z); }

    public static Point3D fromXYZ(double x, double y, double z) {
        return new Point3D(x, y, z);
    }

    public static Point3D copy(Point3D p) { return new Point3D(p); }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public double lengthTo(Point3D other) {
        double dx = x - other.x;
        double dy = y - other.y;
        double dz = z - other.z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    private void modifyPoint3D(double scale){
        x = scale * x; y = scale * y; z = scale * z;
    }

    public Point3D modifyAndCopy(double scale){
        modifyPoint3D(scale);
        return new Point3D(x, y, z);
    }
}
```
The following code is saved in a file called `Question3a.java`.
```java
// Question3a.java

class Question3a{
    public static void main(String[] args){

        Point3D p1 = new Point3D();
        // System.out.println(p1);

        Point3D p2 = Point3D.copy(p1);
        p2.x = 1.0;
        // System.out.println(p1);
        // System.out.println(p2);

        Point3D p3 = Point3D.fromXYZ(0.5, 0.5, 0.5);
        // System.out.println(p3);

        // p3.modifyPoint3D(2.0);
        // System.out.println(p3);

        // Point3D p4 = p3.modifyAndCopy(2.0);
        // System.out.println(p4);
        
    }
}
```
Suppose we place both `Point3D.java` and `Question3a.java` in the same folder. Then   
`Question3a.java` compiles and runs properly. For each line in the main method that   
is commented, consider what happens when you uncomment it (while leaving the other   
lines commented).
- EITHER explain why uncommenting the line gives a compile-time error;
- OR write down the output the line produces upon uncommenting it.

### Part (a)
`// System.out.println(p1);`
#### Answer
```
(0.0,0.0,0.0)
```

### Part (b)
`// System.out.println(p1);`   
`// System.out.println(p2);`
#### Answer
```
(0.0,0.0,0.0)
(1.0,0.0,0.0)
```

### Part (c)
`// System.out.println(p3);`
#### Answer
```
(0.5,0.5,0.5)
```

### Part (d)
`// p3.modifyPoint3D(2.0);`   
`// System.out.println(p3);`
#### Answer
```
Compile-time error: modifyPoint3D(double) is declared `private` and
cannot be accessed in the main method, outside the class 'Point3D'
```

### Part (e)
`// Point3D p4 = p3.modifyAndCopy(2.0);`   
`// System.out.println(p4);`
#### Answer
```
(1.0,1.0,1.0)
```

The following code implements the `Ball3D` class (saved in a file called `Ball3D.java`).
```java
// Ball3D.java

class Ball3D extends Point3D {
    public double radius;

    public Ball3D() {
        super();
        radius = 1.0;
    }

    public Ball3D(double x, double y, double z, double radius) {
        super(x,y,z);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius="+radius+","+"Center="+super.toString();
    }

    public void modifyBall3D(double newRadius){
        radius = newRadius;
    }

    public boolean f(Point3D other) {
        double dist = other.lengthTo(new Point3D(x,y,z));
        if (dist <= radius){
            return true;
        }

        return false;
    }
}
```
The following code is saved in a file called `Question3b.java`.
```java
// Question3b.java

public class Question3b{
    public static void main(String[] args){
        Ball3D b1 = new Ball3D();
        // System.out.println(b1);

        Point3D p1 = b1;
        // p1.x = 1.0;
        // System.out.println(p1);

        // p1.modifyBall3D(8.0);
        // System.out.print(p1);

        Point3D p2 = new Ball3D(1.0, 1.0, 1.0, 4.0);
        // Point3D p3 = new Point3D(0.0, 0.0, 0.0);
        // System.out.println(((Ball3D) p2).f(p3));

        // Point3D p4 = new Point3D(-3.0, -2.0, -1.0);
        // System.out.println(((Ball3D) p2).f(p4));
    }
}
```
Suppose we place `Point3D.java` , `Ball3D`, and `Question3b.java` in the same folder.   
Then `Question3b.java` compiles and runs properly. For each line in the main method   
that is commented, consider what happens when you uncomment it (while leaving the   
other lines commented).
- EITHER explain why uncommenting the line gives a compile-time error;
- OR write down the output the line produces upon uncommenting it.
- Last two questions are bonus problems, they worth 1 point each. They are not   
counted in your midterm grade. However, if you solve any of the bonus problems   
correctly, the corresponding point(s) will be directly added to your course grade.   
Do NOT work on them if you have any other problems unfinished.

### Part (a)
`// System.out.println(b1);`
#### Answer
```
Radius=1.0,Center=(0.0,0.0,0.0)
```

### Part (b)
`// p1.x = 1.0;`   
`// System.out.println(p1);`
#### Answer
```
Radius=1.0,Center=(1.0,0.0,0.0)
```

### Part (c)
`// p1.modifyBall3D(8.0);`   
`// System.out.print(p1);`
#### Answer
```
Compile-time error: superclass 'point3D' reference 'p1' cannot call
method 'modifyBall3D(double)' that is unique to subclass `Ball3D`
```

### Part (d)
`// Point3D p3 = new Point3D(0.0, 0.0, 0.0);`   
`// System.out.println(((Ball3D) p2).f(p3));`
#### Answer
```
true
```

### Part (e)
`// Point3D p4 = new Point3D(-3.0, -2.0, -1.0);`   
`// System.out.println(((Ball3D) p2).f(p4));`
#### Answer
```
Compile-time error: superclass 'point3D' reference 'p2' cannot call
method 'f(Point3D)' that is unique to subclass `Ball3D`
```
