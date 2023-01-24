# Theory

## Primitive Data types and their representation
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
- We can see a pattern here with N slots, we can have 2^N possible numbers with a range from 0 to 2^(N-1)
- Also, 8 bits make a byte. This mean
