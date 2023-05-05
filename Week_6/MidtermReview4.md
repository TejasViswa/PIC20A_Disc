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
