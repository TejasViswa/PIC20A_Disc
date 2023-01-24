# Theory

## Integral Primitive Data types and their representation
- Let us start from a single slot which is otherwise known as a bit:
  - A bit can be thought of as a simple slot or a switch with its only value/state being 1 or 0
  - ie: [1] or [0]    (the square brackets are only for visual representation)
  - This means that it can store only 2 values or states and its range is limited from 0 to 1
- Let us add another slot to this bit:
  - ie: Now the possible range of values are [0|0], [0|1], [1|0] or [1|1]
  - This means that it can store 4 values and its range is from 0 (00 binary) to 3 (11 binary)
- Adding another slot gives us:
  - ie: [0|0|0], [0|0|1], [0|1|0], [0|1|1], [1|0|0], [1|0|1], [1|1|0] and [1|1|1]
  - This means that it can store 8 values and its range is from 0 (000 binary) to 7 (111 binary)
- We can see a pattern here with N slots, we can have 2^N possible numbers with a range from 0 to 2^N - 1
- Also, 8 bits make a byte. This means that 1 byte has 8 slots and it can have 2^8 possible values and its numbers range from 0 to 2^8 - 1 which is basically 0 to 255 (Side note: Generally RGB or grayscales values in a lot of graphics programs have values ranging from 0 to 255)
- An unsigned int has 4 bytes -> 32 bits. Essentially, it can have values from 0 to 2^32 - 1.
- Now, if a data type has to be signed then one bit has be separately used for assigning this. Usually, it is the MSB (Most significant bit) or the left most bit. If the bit is 0 then the number is positive and if it is 1, then it is negative. ie: [0|0|0|......|0] is positive and [1|0|0|......|0] is negative. Now to accomodate for this extra bit, we are going to lose some space and that means we lose some positive range. We can essentially shift the number line as follows:
```math
\{0,1,2,3................... 2^{32}\}\text{ to } \{-2^{31} ....-2,-1,0,1,2...... 2^{31} - 1\}
```
- Finally, the ranges for long, byte, short, etc are defined similarly. The number of bytes they occupy let you know their ranges.

## Floating Primitive Data Types
- [Look at this video](https://www.youtube.com/watch?v=dQhj5RGtag0)
- For float, the idea is to represent numbers using scientific notation but with binary numbers
- [Take a look at this article to get a better picture](https://www.geeksforgeeks.org/ieee-standard-754-floating-point-numbers/)
