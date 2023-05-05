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
    protected String name;
    
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
        System.out.println("The dog barks!");
    }
    
    public void fetch() {
        System.out.println("The dog fetches the ball");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        Dog dog = new Dog("dog");
        
        // Upcasting
        Animal animalDog = dog;
        animalDog.speak();  // Output: The dog barks!
        animalDog.eat();    // Output: The dog is eating
        // Downcasting
        Dog dogAnimal = (Dog) animal;
        dogAnimal.speak();  // Output: The animal makes a sound
        dogAnimal.fetch();  // Compilation error: cannot find symbol
        
        System.out.println(animal);   // Output: Animal@4e25154f
        System.out.println(dog);      // Output: Dog@70dea4e
    }
}
```
- In this example, we have two classes - `Animal` and `Dog`. `Dog` is a subclass of `Animal`, which means it inherits all the properties and methods of the `Animal` class.
- The `Animal` class has a `protected` name field and two `public` methods - `speak()` and `eat()`. The `speak()` method outputs a generic message about the animal making a sound, and the `eat()` method outputs a message about the animal eating.
- The `Dog` class has a constructor that takes in a name parameter and passes it up to the `Animal` constructor using the `super` keyword. It also has a `speak()` method that overrides the `speak()` method in `Animal` and outputs a message specific to dogs. It also has a `fetch()` method that outputs a message about the dog fetching a ball.
- In the `main` method, we create an `Animal` object and a `Dog` object. We also perform upcasting and downcasting operations to demonstrate the concepts.
- **Upcasting** is when a subclass object is assigned to a superclass reference variable. In this example, we create an `Animal` reference variable animalDog and assign it the value of the `Dog` object dog. We can then call the overridden `speak()` method on the animalDog variable, and it will call the `speak()` method in the `Dog` class.
- **Downcasting** is when a superclass reference variable is assigned to a subclass reference variable. In this example, we create a `Dog` reference variable dogAnimal and cast the `Animal` object animal to it. We can then call the `speak()` method on the dogAnimal variable, and it will call the `speak()` method in the `Animal` class, because the animal object is of type `Animal`, not `Dog`. However, if we try to call the `fetch()` method on the dogAnimal variable, we will get a compilation error, because the animal object does not have a `fetch()` method.
![image](https://user-images.githubusercontent.com/45400093/226465909-8de1e24f-52be-464a-81f3-7aebf7c64ce6.png)
