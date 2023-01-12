# Comparison of data types in C++ vs Java

 Java contains fixed sized data types, while all basic data types in C and C++ depend on the actual platform (machine architecture + operating system) the program is compiled for.
 1

- C++ is dependent on the platform. for example - int will be in the size of the word - 32 bit or 64 bit, depends on your computer architecture.
- Java is relatively fixed - it runs on a JVM that dfines the sizes (similar to C#). They are not dependent on what OS and CPU you have.

## Primitive Data types

| Java      | C++ |
| :-----------: | :-----------: |
| 8 primitive fixed-length      | More primitive data types due to unsigned and unsigned. The lengths of primititive data types are not fixed at language design time, but at language implementation time.       |
| Fixed length for each  | Lengths are implementation dependent primitive data type on every platform. |
| char: Unicode 2 bytes  | Ascii, 1 byte |
| No unsigned int, char, long etc. in Java. | |
| [boolean](https://www.geeksforgeeks.org/comparison-boolean-data-type-c-java/) | [bool](https://www.geeksforgeeks.org/comparison-boolean-data-type-c-java/)|

## User Defined types

| Java | C++ |
| :-----------: | :-----------: |
| class | class |
| interface | struct |
| enum | enum |
| | union|
