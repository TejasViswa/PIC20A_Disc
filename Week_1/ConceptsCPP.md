# Some concepts in C++

## Reference Parameters

Reference parameters allow a function to modify the value of a variable that was passed to it as an argument. When a variable is passed by reference, the function can modify the original value of the variable, rather than creating a copy of it. This can be useful in cases where you want to avoid copying large objects or when you need to modify the value of a variable within a function.

Here's an example of a function that takes a reference parameter:

```c++
void increment(int& x) {
    x++;
}

int main() {
    int a = 10;
    increment(a);
    std::cout << a << std::endl; // Output: 11
    return 0;
}
```

In this example, the increment function takes an integer reference parameter x. When a is passed to this function, the function modifies the original value of a by incrementing it. As a result, the value of a is 11 when it is printed in main.

### Additional (This is completely optional)
For those who are interested about scope in C++:
- [Scope in C++ - Local and Global Variables](https://github.com/TejasViswa/PIC10B_Disc1B_Disc2B/blob/main/Week_1/scope.md)

For those who are interested in knowing about C++ references in more detail:
- [Exercise Questions on C++ References](https://github.com/TejasViswa/PIC10B_Disc1B_Disc2B/blob/main/Week_1/References.md)
- [Return by References in C++](https://github.com/TejasViswa/PIC10B_Disc1B_Disc2B/blob/main/Week_1/Ret_by_ref.md)

## Pointers

Pointers are variables that store memory addresses. They can be used to manipulate data indirectly by pointing to the memory location where the data is stored. Pointers can be used to dynamically allocate memory, access arrays, and create data structures such as linked lists and trees.

Here's an example of a pointer in C++:

```c++
int main() {
    int a = 10;
    int* ptr = &a;
    std::cout << *ptr << std::endl; // Output: 10
    return 0;
}
```
In this example, a pointer ptr is declared and assigned the memory address of a using the address-of operator (&). The value of a is then printed using the dereference operator (\*), which accesses the value stored at the memory address pointed to by ptr.

### Additional (This is completely optional)
For those who are interested in knowing about C++ pointers in more detail:
- [C++ Pointers](https://github.com/TejasViswa/PIC10B_Disc1B_Disc2B/blob/main/Week_1/Pointers_and_memory.md)
- [C++ Pointers Vs Arrays](https://github.com/TejasViswa/PIC10B_Disc1B_Disc2B/blob/main/Week_2/Arrays.md)

## Classes

Classes are user-defined data types that encapsulate data and functions. They are used to model real-world objects and provide a way to group related data and functions together. Classes can have member variables (also called data members) and member functions (also called methods). They can also have constructors and destructors, which are special member functions that are called when an object is created or destroyed.

Here's an example of a simple class in C++:

```c++
class Rectangle {
private:
    int width;
    int height;
public:
    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    int area() {
        return width * height;
    }
};

int main() {
    Rectangle rect(5, 10);
    std::cout << rect.area() << std::endl; // Output: 50
    return 0;
}
```

In this example, a Rectangle class is defined with private member variables width and height, and a public member function area that calculates the area of the rectangle. A constructor is also defined to initialize the width and height of the rectangle when an object is created. In main, an object rect of type Rectangle is created with width 5 and height 10, and its area is printed to the console using the area method.

### Additional (This is completely optional)
For those who are interested in knowing about C++ classes and objects in more detail:
- [C++ classes and objects](https://github.com/TejasViswa/PIC10B_Disc1B_Disc2B/blob/main/Week_2/classes.md)
