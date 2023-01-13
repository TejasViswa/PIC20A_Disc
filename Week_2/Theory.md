# Theory

## Some Useful Stuff
- [Overflow and Underflow in Java](https://www.baeldung.com/java-overflow-underflow)
  - There is an wrap around that happens when underflow (eg: 1 lesser than min value goes to the max value) or overflow (eg: 1 more than max values goes to the min value) happens.
- [Does Java support Default values?](https://stackoverflow.com/questions/997482/does-java-support-default-parameter-values)
  - It does not (unlike C++) and only method overloading is allowed. (Look at the solution in the above link to see what else can be used instead)
- [Difference between for loop and enhanced for loop](https://www.geeksforgeeks.org/difference-between-for-loop-and-enhanced-for-loop-in-java/)
  - for each loop (enhanced for loop) cannot edit the elements
- [Pass by value vs Pass by reference](https://stackoverflow.com/questions/373419/whats-the-difference-between-passing-by-reference-vs-passing-by-value/430958#430958)
  - Pass by value means that a copy of the variable is created and then this copy is manipulated. Pass by reference means that a reference or handle to the variable is passed which can essentially manipulate the said variable itself and no copy is created.
