# For-Loops Vs Enhanced For-Loops

In Java, an array is a collection of elements of the same data type. You can use a loop to iterate over the elements of an array, and both the for-loop and enhanced for-loop can be used to do this.

The basic for-loop is a traditional loop that you can use to iterate over the elements of an array using the index of the element. The syntax for the basic for-loop is:

```java
for (int i = 0; i < array.length; i++) {
    // code to be executed repeatedly
}
```
In this loop, the variable i is used as the index of the array, and it starts at 0 and increments by 1 for each iteration until it reaches the length of the array. You can then use the index to access the elements of the array using the square brackets notation array[i].

On the other hand, the enhanced for-loop is a simplified loop that you can use to iterate over the elements of an array without using an index. The syntax for the enhanced for-loop is:

```java
for (element_type element : array) {
    // code to be executed repeatedly
}
```
In this loop, the variable element is assigned to each element in the array, one by one. The loop continues until all elements in the array have been processed. You can then use the variable element to access the elements of the array directly.

One of the advantages of the enhanced for-loop is that it is simpler and more concise than the basic for-loop, especially when you are iterating over all the elements of an array. However, it has some limitations. For example, you cannot use the enhanced for-loop to modify the elements of an array, as it only provides read-only access to the elements. You also cannot use the enhanced for-loop to iterate over a range of indexes in an array, as it does not provide access to the index of the current element.

In summary, the basic for-loop and enhanced for-loop can both be used to iterate over the elements of an array in Java, but they have different syntax and capabilities. The basic for-loop is more flexible and can be used to iterate over a range of indexes in an array, while the enhanced for-loop is simpler and more concise but provides read-only access to the elements of an array.

[Difference between for-loop and enhanced for-loop in more detail](https://www.geeksforgeeks.org/difference-between-for-loop-and-enhanced-for-loop-in-java/)
