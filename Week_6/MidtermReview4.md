# Midterm Review - Part 4

# Basics
## Basics of Java Classes
- Read all the snippets from `Classes.zip` as well as `Further example on java class.zip`.
- Additionally, you may choose to practice from the following examples:
  - [Pokemon Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonExercise.md)
    - [Solution](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/Pokemon.java) 
  - [Student Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/StudentClassExercise.md)
    - [Solution](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/StudentTester.java)
  - [PokemonTeam Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonTeamExercise.md)
    - [Solution](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonTeam.java) 
  - [Student Group Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/GroupClassExercise.md)
    - [Solution](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/GroupTester.java) 
### Example
```java
public class Employee {
    private String name;
    private int age;
    private String department;
    private static int numEmployees = 0;
    
    // Default constructor
    private Employee() {
        this.name = "";
        this.age = 0;
        this.department = "";
    }
    
    // Parameterized constructor
    private Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    
    // Factory method to create an Employee object with default values
    public static Employee createEmployee() {
        numEmployees++;
        return new Employee();
    }
    
    // Factory method to create an Employee object with given values
    public static Employee createEmployee(String name, int age, String department) {
        numEmployees++;
        return new Employee(name, age, department);
    }
    
    // Non-static method
    public void changeDepartment(String department) {
        this.department = department;
    }
    
    // Static method
    public static void displayNumEmployees() {
        System.out.println("Number of employees: " + numEmployees);
    }
    
    // Override toString() method
    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Department: " + this.department;
    }
}
```
- In this example, we have an `Employee` class that has `private` fields for `name`, `age`, and `department`. There is also a `static` field called `numEmployees` that keeps track of the number of `Employee` objects created. There are two constructors - a default constructor and a parameterized constructor that takes in `name`, `age`, and `department`.
- We also have two factory methods, which are `createEmployee()` methods that create an `Employee object` with either default values or given values. Both of these methods increment the `numEmployees` counter when an `Employee` object is created.
- The class also has a `non-static` method called `changeDepartment(String)` that changes the employee's `department`, a `static` method called `displayNumEmployees()` that prints out the number of employees, and an override of the `toString()` method to provide a `String` representation of the object.
- The `this` keyword is used to refer to the instance variables of the `Employee` object within the class methods, to differentiate them from any local variables or method parameters with the same name.

# Inheritance
## Inheritance and Polymorphism
- Please read the snippets in `FirstExample.zip` and `Polymorphism.zip`.
- Additionally, you may choose to practice from the following examples:
  - [PokemonWithType Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonWithTypeExercise.md)
    - [Solution](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonWithType.java)
  - [UndergradStudent Class](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/UndergradStudentTester.java)
## Example
```java
class Animal {
    public String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void speak() {
        System.out.println("The " + name + " makes a sound");
    }
    
    public void eat() {
        System.out.println("The " + name + " is eating");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    public void speak() {
        System.out.println("The "+name+" barks!");
    }
    
    public void fetch() {
        System.out.println("The "+name+" fetches the ball");
    }
}

public class Main {
    public static void main(String[] args) {

        // Normal assignment
        Animal animal = new Animal("animal");
        Dog dog = new Dog("dog");
        
        // Upcasting
        Animal animalDog = new Dog("animalDog"); // Upcast -> Parent ref points to Child obj
        animalDog.speak();  // Output: The animalDog barks! - Overidden method is called
        animalDog.eat();    // Output: The animalDog is eating
        // animalDog.fetch(); // Compile-time error - Parent ref cannot call methods unique to Child class
        
        // Wrong Downcasting
        // Dog dogAnimal = new Animal("animal"); // Compile-time error
        // Dog dogAnimal = (Dog)(new Animal("animal")); // Run-time error

        // Correct Downcasting
        Animal a = new Dog("dogAnimal"); // Upcast first
        Dog dogAnimal = (Dog) a; // Downcast after upcasting -> Child ref actually points to Child obj
        dogAnimal.speak(); // Output: The dogAnimal barks! - Overidden method is called
        dogAnimal.eat(); // Output: The dogAnimal is eating
        dogAnimal.fetch(); // Output: The dogAnimal fetches the ball
    }
}
```
- In this example, we have two classes - `Animal` and `Dog`. `Dog` is a subclass of `Animal`, which means it inherits all the properties and methods of the `Animal` class.
- The `Animal` class has a `public` name field and two `public` methods - `speak()` and `eat()`. The `speak()` method outputs a generic message about the animal making a sound, and the `eat()` method outputs a message about the animal eating.
- The `Dog` class has a constructor that takes in a name parameter and passes it up to the `Animal` constructor using the `super` keyword. It also has a `speak()` method that overrides the `speak()` method in `Animal` and outputs a message specific to dogs. It also has a `fetch()` method that outputs a message about the dog fetching a ball.
- In the `main` method, we create an `Animal` object and a `Dog` object. We also perform upcasting and downcasting operations to demonstrate the concepts.
- **Upcasting** is when a subclass object is assigned to a superclass reference variable.
  ```java
  Parent p = new Child(); // Upcasting is fine!
  ```
  - Note that with upcasting, the superclass reference can only call the methods defined in the superclass and any method that were overridden will call the overridden version defined in the subclass instead of the methods in the superclass. And note that it cannot call the methods defined in the subclass object even though it is pointing to it (unless its an overridden method).
  - In this example, we create an `Animal` reference variable animalDog and assign it to a new `Dog` object with the name `animalDog`.
  - We can then call the overridden `speak()` method on the animalDog variable, and it will call the `speak()` method in the `Dog` class. Remember we say that a method is overridden, if it is a `non-static` method in the subclass and has the same method signature (return type, method name and argument datatypes are the same) as in the superclass.
  - We can also call the `eat()` method which calls the `eat()` method in the `Animal` class because the `eat()` method is not overidden in the `Dog` class.
  - But we cannot call the `fetch()` method which attempts to call the `fetch()` method in the `Dog` class because the animalDog variable is ultimately an `Animal` class reference and it can call only `Animal` class methods. Note that if the `Animal` class methods are overridden in the `Dog` class, then the overriden methods are called but if they are not overridden then the methods in the `Animal` class itself will be called.
- **Downcasting** is when a superclass reference variable is assigned to a subclass reference variable.
  - Downcasting in the actual meaning of the word is not directly allowed. ie: subclass class ref points to superclass object - This is **not allowed**!!
  ```java
  Child c = new Parent(); // This is NOT ALLOWED!!
  ```
  - But, if we upcast first (ie: make a superclass ref point to a subclass object) and then downcast (ie: make a subclass ref point to the casted version) - Then it is okay!
  ```java
  Parent p = new Child(); // Upcast first
  Child c = (Child)p; // And then downcast
  // This is essentially making a Child ref point to a Child object anyway
  ```
  - In our example, we first create an Animal class reference called 'a' and make it point to a `Dog` object with the name `dogAnimal`.
  - Next, we create a `Dog` reference variable called dogAnimal and assign it the dog-casted version of the `a` Animal class reference which essentially makes the dogAnimal reference point to a `Dog` object anyway. Thus, it is okay to perform this. (Although we call it a downcast, it is not really a true downcast)
  - We can then call the `speak()` method on the dogAnimal variable, and it will call the `speak()` method in the `Dog` class because the method is overridden in the `Dog` class.
  - We can also call the `eat()` method which calls the `eat()` method in the `Animal` class because the `eat()` method is not overidden in the `Dog` class.
  - We can also call the `fetch()` method which call the `fetch()` method in the `Dog` class because it is only defined in the `Dog` class and this is okay because it is essentially a `Dog` class reference pointing to a `Dog` class object and nothing is violated here.

![image](https://user-images.githubusercontent.com/45400093/226465909-8de1e24f-52be-464a-81f3-7aebf7c64ce6.png)
