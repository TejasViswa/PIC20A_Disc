# Midterm Practice Prob 3

## Question
```java
public class Question3 {
    public static void main(String[] args) {
        // int i; int j = i; System.out.println(j);
        // C c0 = new C(); System.out.println(c0.i);
        // C c1 = new C(1); c1.f();
        // C c2 = new C(22); c2.g();
        // C c3 = new C(333); C c4 = new C(c3); System.out.println(c3.i + c4.i);
        // h(4444);
    }
}
class C {
    public int i;
    public C(int i) {
        this.i = i;
    }
    public C(C c) {
        this(33);
        c.i = 666;
    }
    private void f() { System.out.println(i); }
    public  void g() { f(); }
    public static void h(int j) {
        System.out.println(j);
    }
}
```
## Answer
- `// int i; int j = i; System.out.println(j);`
  - `int i;` - This statement by itself is not wrong because all we are doing is declaring a variable (although not initializing it).
  - `int j = i` - This statement is the one that causes the error because we are trying to access a variable that is uninitialized. Thus, it is a compile-time error right here.
  - `System.out.println(j)` - The compiler never reaches this statement because we already exited the program with the error in the previous statement.
- `// C c0 = new C(); System.out.println(c0.i);`
  - `C c0 = new C()` - This statement is wrong because we trying to call the default constructor (constructor with no arguments/parameters) to create the `C` object for this `c0` reference. Now, remember that if we never defined any constructors for our class then it would've been a perfectly valid statement because then the compiler will provide a default constructor for us. But, because we already provided a constructor with some parameters/arguments, the compiler will no longer provide a default constructor for us and that statement will thus give us a compile-time error.
  - `System.out.println(c0.i)` - The compiler never reaches this statement because we already exited the program with the error in the previous statement.
- `// C c1 = new C(1); c1.f();`
  - `C c1 = new C(1)` - This statement is fine. We create a new `C` object with the instance variable `i` and use the constructor call `C(1)` which then calls `C(int)` to initialize this `C` object and assigns its `i` to 1 and makes `c1` point to this newly created `C` object on the heap with its `i` equal to 1.
  - ` c1.f()` - This statement is not fine because if we take a look at the access modifier of the method `f()`, it is actually `private` and thus it cannot be called outside its class (Remember even if the main method was inside the `C` class, even then this main method is considered as being outside the scope of the class and would not allow the method call) and thus this gives us a compile-time error.
- `// C c2 = new C(22); c2.g();`
  - `C c2 = new C(22)` - This statement is fine. We create a new `C` object with the instance variable `i` and use the constructor call `C(22)` which then calls `C(int)` to initialize this `C` object and assigns its `i` to 22 and makes `c2` point to this newly created `C` object on the heap with its `i` equal to 22.
  - `c2.g()` - This statement is actually fine because the method `g()` is actually `public` and its fine to call it outside the class as is the case here. Now the `g()` method calls `f()` inside it and this is fine even though `f()` is `private` because `g()` itself is inside the `C` class.
  - And thus, the output is printed to the console as `22`
- `// C c3 = new C(333); C c4 = new C(c3); System.out.println(c3.i + c4.i);`
  - `C c3 = new C(333)` - This statement is fine. We create a new `C` object with the instance variable `i` and use the constructor call `C(333)` which then calls `C(int)` to initialize this `C` object and assigns its `i` to 333 and makes `c3` point to this newly created `C` object on the heap with its `i` equal to 333. This looks like the following:
  - ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/2765ec0f-a0f1-4a51-a773-6cd100b20ca5)
  - `C c4 = new C(c3)` - This statement is also fine. We create a new `C` object with the isntance variable `i` and this time we use the constructor call `C(c3)` which then calls `C(C)` to initialize this `C` object.
    - Inside this `C(C)` constructor, remember this local variable `c` actually references `c3` object because when we called `C(c3)` - it is equivalent to `C c = c3` where `c` on the left side is the local variable `c`. At this point, the memory diagram looks like (Notice how the `i` of `c4` object hasn't been initialized yet at this point):
    - ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/a2ca8acd-56b0-4722-97ed-25ac7dcec9e5)
    - Next, when `this(33)` is executed, then `this` actually refers to the `c4` object and `this(33)` is the same as calling `C(33)` (chained constructor call). Therefore, with `this(33)`, `C(int)` is called and the `i` of `c4` object is initialized to 33 as follows:
    - ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/eeed3eee-5b23-49c6-9b3d-5ba28bbaff6f)
    - Later, when `c.i = 666` is executed, the instance variable `i` of the object that `c` was referencing (which `c3` is also referencing) is modified to 666 as shown:
    - ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/77bfe512-c969-4ad7-9902-bb083c6d53d8)
    - Finally, when the constructor call ends and when we return to the main method, the memory diagram looks like the following(the local variables/references are erased):
    - ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/48963de1-f904-4f2d-b25e-eedc14a199cd)
  - `System.out.println(c3.i + c4.i)` - This statement prints to console adding the two double values as `699` (Because `c3.i` is 666 and `c4.i` is 33 and 666 + 33 = 699)
- `// h(4444);` - This statement is not okay because the we trying to call a `static` method of another class without using the class name. This gives us a compile-time error. If we had to correct this statement, it would look like `C.h(4444)`. Remember to call a `static` method of another class, we need to use the class name as well. If this `h` method was a part of the `Question3` class then this `h(4444)` would've been fine because the compiler automatically adds the class name to it if it is a part of the same class (ie:`Question3.h(4444)`).
