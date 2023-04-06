# How do References and Objects in Java work?

In Java, references and objects are created and stored in different parts of the computer's memory. The stack and the heap are two different areas in memory that are used for storing data.

The stack is a small section of memory used for storing local variables and method calls. Each thread in a Java program has its own stack, and each method call creates a new frame on the stack to hold its local variables and parameters. When a method call returns, its frame is removed from the stack.

The heap is a larger section of memory used for storing objects. When an object is created in Java, memory is allocated on the heap to hold the object's data.

Here's a visual representation of how Java creates references and objects on the stack and heap:

When a new object is created, memory is allocated on the heap to hold the object's data:
```java
obj = new MyObject();
```
The reference variable now points to the memory location of the newly created object on the heap:
```
   Stack            Heap
+--------+      +----------+
|  obj   |      | MyObject |
+--------+      +----------+
|  0x100 |----> |   data   |
+--------+      +----------+

```
When the object is no longer needed, it can be garbage collected and the memory on the heap can be reclaimed:
```java
obj = null;
```
```
   Stack
+--------+
|  obj   |    
+--------+
|  null  |
+--------+
```
In summary, in Java, references are created on the stack and objects are created on the heap. When an object is created, memory is allocated on the heap to hold the object's data, and a reference variable on the stack is assigned to point to the memory location of the object. When the object is no longer needed, it can be garbage collected and the memory on the heap can be reclaimed.
