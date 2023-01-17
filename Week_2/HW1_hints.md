# HW1 Hints

## Task 1
- Loop thru the array and get average.

## Task 2
- [Converting decimal to binary](https://www.cuemath.com/numbers/decimal-to-binary/) - See this if you are unsure how to convert decimal to binary
- Remember you only have ints here and you are finding only the positive binary conversion and adding a sign if required
- while loops are more convenient because the number of loops are not set

## Task 3
- Remember arrays in Java are jagged (ie: they need not be rectangular) so make sure to check if all of the arrays have the same length, exit as soon as any one of them does not have the same length.
- For magic squares, the values range only from 1 to N^2 and exactly once. Exit if anything appears twice or something is beyond this range.
- Everything should sum upto magic total (Remember you get N from the length of an individual array) and summing up rows is with 2 loops, inner loop for second index and outer loop for first index. And vice versa for column. For the two diagonals - think about the indexes of diagonals - how are they special?

## Task 4
- How can you optimize the prime number program?
- A few hints could be:
  - Do you need to search for all the numbers?
    - You know that some numbers cannot be prime - like even numbers
    - you don't have to search all the numbers until the candidate to see if its divisible - where do you think you should stop?
 
