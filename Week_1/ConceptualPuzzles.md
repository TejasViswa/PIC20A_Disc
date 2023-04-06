# Conceptual Java Puzzles

## Question 1
What is the output of the following snippet?
```java
public class A {
    public static void main(String[] args)
    {
        if (true)
            break;
    }
}
```
Choices:
1. Nothing
2. Error

## Question 2
What is the output of the following snippet?
```java
public class A {
    public static void main(String[] args)
    {
        System.out.println('j' + 'a' + 'v' + 'a');
    }
}
```
Choices:
1. java
2. Something else (Other than simple concatenation)

## Question 3
What is the output of the following snippet?
```java
public class A {
    public static void main(String[] args)
    {
        int $_ = 5;
    }
}
```
Choices:

1. Nothing
2. Error

## Question 4
What is the output of the following snippet?

[Learn more about post and pre increment operators](#post-and-pre-increment-operators)
```java
public class A {
    public static void main(String[] args)
    {
        int x = 10;
        System.out.println(x++ + ++x);
    }
}
```

## Question 5
What is the output of the following snippet?
```java
public class A {
    public static void main(String[] args)
    {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("x is not 1, 2, or 3");
        }
    }
}
```

## Question 6
What is the output of the following code snippet?

[Learn more about post and pre increment operators](#post-and-pre-increment-operators)
```java
public class A {
    public static void main(String[] args)
    {
        int x = 10;
        if (x++ == 10 && ++x == 12) {
            x += 10;
        }
        System.out.println(x);
    }
}
```

## Question 7
What is the output of the following code snippet?
```java
public class A {
    public static void main(String[] args)
    {
        int x = 5;
        int y = 10;
        boolean z = x < y == true;
        System.out.println(z);
    }
}
```

## Question 8
What is the output of the following code snippet?

[Learn more about post and pre increment operators](#post-and-pre-increment-operators)
```java
public class A {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        int c = a++ * b--;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

```

## Post and pre increment operators:
In Java, the post-increment (i++) and pre-increment (++i) operators are used to increment the value of a variable by 1. The difference between the two operators lies in the order in which the increment operation is performed.

The post-increment operator (i++) first returns the value of the variable, and then increments it. For example:

```java
int i = 5;
int j = i++;  // j will be assigned the value of i (5), and then i will be incremented to 6
After the above code is executed, i will have the value 6 and j will have the value 5.
```
On the other hand, the pre-increment operator (++i) increments the value of the variable first, and then returns the new value. For example:

```java
int i = 5;
int j = ++i;  // i will be incremented to 6, and j will be assigned the new value of i (6)
After the above code is executed, both i and j will have the value 6.
```
It's important to note that both the post-increment and pre-increment operators can be used with variables of any numerical type, including int, long, float, and double. Additionally, they can also be used with certain types of objects, but their behavior may be different depending on the specific implementation of the object.

### Note:
- Similar rules apply even when they are using in mathematical expressions because remember the expression can be divided into sub-expressions and each sub-expression returns something and evaluated from left to right (based on their order of precedence).
- Similar rules apply for post(i--) and pre(--i) decrement operators
