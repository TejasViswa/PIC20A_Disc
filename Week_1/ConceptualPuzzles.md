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
