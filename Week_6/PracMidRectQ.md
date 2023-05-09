# Problem 2b - Rectangle Question in Practice Midterm

## Question
```java
public class Shakespeare {
        public static void changeToSquareOfSameArea(Rectangle r) {
            r = new Rectangle(Math.sqrt(r.area()));
        }
        public static void stretchByTwo(Rectangle r) {
            r.sideLength1 *= 2;
            r.sideLength2 *= 2;
        }
        public static void main(String[] args) {
            Rectangle r = new Rectangle(2, 8);
            changeToSquareOfSameArea(r);
            stretchByTwo(r);
            System.out.println(r.sideLength1 + " x " + r.sideLength2);
} }
    class Rectangle {
        public double sideLength1;
        public double sideLength2;
        public Rectangle(double sl1, double sl2) {
            sideLength1 = sl1;
            sideLength2 = sl2;
        }
        public Rectangle(double sl) {
            this(sl, sl);
        }
        public double area() {
            return sideLength1 * sideLength2;
} }

```
## Answer
- Lets hone in only on the main method part:
```java
 public static void main(String[] args) {
      Rectangle r = new Rectangle(2, 8);
      changeToSquareOfSameArea(r);
      stretchByTwo(r);
      System.out.println(r.sideLength1 + " x " + r.sideLength2);
}
```
- Lets solve this line by line:
- `Rectangle r = new Rectangle(2, 8);`
  - Create a new `Rectangle` object using the `Rectangle(double, double)` constructor (That is only the constructor that the compiler can match. Notice that the actual call is `Rectangle(2, 8)` which is actually like `Rectangle(int, int)` and thus when the compiler selects `Rectangle(double, double)`, the passed-in arguments are promoted to `double`s). Thus, the object diagram will look like the following:
  ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/b7408a73-c310-424d-a7f7-bca116c919dc)
- `changeToSquareOfSameArea(r);`
  - Inside this method, we can see that there is a new local variable/Rectangle reference `r` that initially points to the same object as the as the argument we passed in (This is equivalent to `Rectangle r = r` - where the `r` on the left side is the local variable inside the `changeToSquareOfSameArea` method and the `r` on the right side is the `r` from the main method). This looks like the following:
    ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/3e03fdc2-77ec-4e14-b405-43a7172ea42a)
  - Next, when the line `r = new Rectangle(Math.sqrt(r.area()));` is executed, we have this local variable `r` being reassigned to a new `Rectangle` object. This new `Rectangle` object is created using the `Rectangle(double)` method because only 1 argument is passed to it. Let us examine the argument passed to it - `Math.sqrt(r.area())` - `r.area()` gives us `sideLength1 * sideLength2` -> 2.0 * 8.0 = 16.0 and this is passed to passed to `Math.sqrt` which finally gives us `sqrt(16.0)` -> 4.0. Therefore, the final constructor call will look like - `Rectangle(4.0)` which calls `Rectangle(double)` which again calls `this(sl,sl)` inside it (Remember, `this()` is always a constructor call and therefore `this(sl,sl)` is same as calling `Rectangle(sl,sl)` which sets both `sideLength1` and `sideLength2` to 4.0) and finally this returns a new `Rectangle` object with `sideLength1` and `sideLength2` set to 4.0. This looks like the following:
    ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/88c77fc0-1a80-405d-b1c6-2ba5c88b8edb)
  - And, finally, when the method call ends and we return back into the main method, we have diagram that looks like the following(local variables/references are erased):
    ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/5f73724c-0dbe-4cae-a8a1-711bc2e527c2)
  - Note that our original `r` was never modified
- `stretchByTwo(r);`
  - Inside this method, we can see that there is again a new local variable/Rectangle reference `r` that initially points to the same object as the as the argument we passed in (This is equivalent to `Rectangle r = r` - where the `r` on the left side is the local variable inside the `stretchByTwo` method and the `r` on the right side is the `r` from the main method). This looks like the following:
    ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/b316a6b7-fdd4-4940-a8be-ed80237723ab)
  - Next, the two following lines - `r.sideLength1 *= 2;` and `r.sideLength2 *= 2;` actually modify the instance variables of the original `r` variable because, both the `r`s are referencing the same object. This looks like the following after the two lines:
    ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/4437bb5d-9636-4bef-aad8-35f3226abd43)
  - And, finally, when the method call ends and we return back into the main method, we have diagram that looks like the following(local variables/references are erased):
    ![image](https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/fe7eef50-10e4-49c1-abfd-48ec33225381)
  - Note that our original `r` was actually modified
- `System.out.println(r.sideLength1 + " x " + r.sideLength2);`
  - This actually prints the values from the original `r` object whose values were only changed by the `stretchByTwo(r);` statement as follows:
  - `4.0 x 16.0`
