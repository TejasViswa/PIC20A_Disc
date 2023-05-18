# Conceptual Java Puzzles

## Question 1
Write the output for the following:
```java
class A {
    int x = 10;
    static int y = 20;

    void print() {
        System.out.println("A: x = " + x + ", y = " + y);
    }

    static void staticPrint() {
        System.out.println("A: y = " + y);
    }
}

class B extends A {
    int x = 30;
    static int y = 40;

    void print() {
        System.out.println("B: x = " + x + ", y = " + y);
    }

    static void staticPrint() {
        System.out.println("B: y = " + y);
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new B();
        B obj3 = new B();

        obj1.print();
        obj2.print();
        obj3.print();

        obj1.staticPrint();
        obj2.staticPrint();
        obj3.staticPrint();

        B downcastObj1 = (B) obj2;
        A castObj2 = obj3;
        B castObj3 = (B) castObj2;

        downcastObj1.print();
        castObj2.print();
        castObj3.print();

        downcastObj1.staticPrint();
        castObj2.staticPrint();
        castObj3.staticPrint();
    }
}
```

## Question 2
What is the output of the following:
```java
class A {
    protected int x = 5;

    protected void calculate() {
        x += 10;
    }

    protected void display() {
        System.out.println("A: " + x);
    }
}

class B extends A {
    protected int x = 2;

    protected void calculate() {
        x *= 3;
    }

    protected void display() {
        System.out.println("B: " + x);
    }
}

class C extends B {
    protected int x = 8;

    protected void calculate() {
        x -= 4;
    }

    protected void display() {
        System.out.println("C: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        A objAA = new A();
        A objAB = new B();
        A objAC = new C();
        B objBA = new A();
        B objBB = new B();
        B objBC = new C();
        C objCA = new A();
        C objCB = new B();
        C objCC = new C();

        objAA.calculate();
        objAB.calculate();
        objAC.calculate();
        objBA.calculate();
        objBB.calculate();
        objBC.calculate();
        objCA.calculate();
        objCB.calculate();
        objCC.calculate();

        objAA.display();
        objAB.display();
        objAC.display();
        objBA.display();
        objBB.display();
        objBC.display();
        objCA.display();
        objCB.display();
        objCC.display();
    }
}
```

## Question 3
```java
class A {
    protected int x = 2;

    protected void calculate() {
        x += 3;
    }

    protected void display() {
        System.out.println("A: " + x);
    }
}

class B extends A {
    private int x = 4;
    protected int y = 5;

    protected void calculate() {
        x *= 2;
        y += 10;
    }

    protected void display() {
        System.out.println("B: x=" + x + ", y=" + y);
    }

    protected void printX() {
        System.out.println("B: x=" + x);
    }
}

class C extends B {
    private int x = 6;
    protected int z = 7;

    protected void calculate() {
        x -= 1;
        z *= 3;
    }

    protected void display() {
        System.out.println("C: x=" + x + ", y=" + y + ", z=" + z);
    }

    protected void printX() {
        System.out.println("C: x=" + x);
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new C();
        B obj2 = new C();
        C obj3 = new C();

        obj1.calculate();
        obj2.calculate();
        obj3.calculate();
        obj1.x++;
        obj2.x--;
        obj3.x += 2;
        obj2.y -= 3;
        obj3.z += 4;

        obj1.display();
        obj2.display();
        obj3.display();

        obj2.printX();
        obj3.printX();
    }
}
```

## Question 4
What is the output of the following(It contains two files):
```java
package com.example.package1;

class A {
    protected int x = 5;

    protected void calculate() {
        x += 10;
    }
}

class B extends A {
    private int y = 2;

    void calculate() {
        y *= 3;
        x += y;
    }
}

class C extends B {
    protected int z = 4;

    void calculate() {
        z += x;
        x -= y;
    }
}

package com.example.package2;

class E extends com.example.package1.C {
    protected int v = 6;

    void calculate() {
        v += x;
        x -= y;
    }

    void display() {
        System.out.println("E: x=" + x + ", y=" + y + ", z=" + z + ", v=" + v);
    }
}

public class Main {
    public static void main(String[] args) {
        E obj = new E();
        obj.calculate();
        obj.display();
    }
}

```
