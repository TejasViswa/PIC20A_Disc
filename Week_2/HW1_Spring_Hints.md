# HW1 Hints

## General Tips on how to write really good code
### Part 1 - Reading and understanding the Question well
- This might sound trivial but it matters a lot especially in tense or stressful scenarios like your exams where a silly mistake can cost you a lot
- First understand the question really well. Do not misread or misunderstand the question. Read it twice or thrice especially in your exam.
### Part 2 - Imagine a rough outline of your solution
- Before you actually sit down to crack down on the specifics of your code, it is always best practice to understand what you are trying to solve and have a rough outline for the same.
- You can then write down a pseudocode for the same. Your solution outline written stepwise in plain english is your pseudocode.
- While you outline your solution, you also need to ensure that you write it stepwise, ie: make it modular.
### Part 3 - Implementing your pseudocode stepwise
- Go through each step of your pseudocode and see if it can be broken down further. You can attempt to continually break it down further and further until its small/atomic enough when you can see your solution in complete clarity and write down for it without any ambiguity.
### Part 4 - Testing your code and handling edge cases
- Once you have written a working code for your problem, make sure to test for all edge cases and in some cases, there will be predefined edge cases that needs to handled beforehand.
### Part 5 - Make your code look readable and elegant
- This step is necessary for you and for anyone you hand down your code to. Let's say that you come back to your code after several days, you might not understand it yourself or you might have to invest significant time to understand your own code.
- Writing neater code also ensures that your mind starts to think with more clarity and you can untangle the problem statement more quickly when you follow a structured pattern.

Now, all of this seems like a badly written WikiHow article until I actually give you all an example of what I mean:

## Example
Write a Java program to check the number of `true` elements in a given boolean array.
### Solution
### Part 1 - Reading and understanding the Question well
- This question is telling that I will receive a boolean array specifically and that I need to count the number of `true` elements in them. So, if I'm to write a method for this I need to realize that I will taking a boolean array as a parameter (because that is what I'm given) and that I need to return a number (of `true` values specifically) and thus whenever you count elements, realize that the value cannot have a decimal point. You can have 3 elements but not 3.5. Therefore, I will use `int` as my return type anytime I need to return the count of something.
### Part 2 - Imagine a rough outline of your solution
- I have an array now and I need a count of the number of `true`s within it. This means that I will need to traverse it, ie: look at every element in that array at least once. Therefore, I will need to loop through it. And now, while I loop through it, I will also need to "check" if each element is `true` or not. And How do I perform "check"s in Java? Use If statements. Anytime, you hear traverse something then automatically assume some sort of loop is being used and anytime you hear a check needs to be performed then use an if statement.
- Now, I also need to keep count of if my check is `true`, therefore, I can use a variable for that purpose and increment it each time, I find something `true`.
- Threfore, my pseudocode will look like this:
```
variable count
- loop through the boolean array
  - check if element in array is true
    - if true then increment count
return count
```


## Task 1
- Loop thru the array and get average.

## Task 2
### Part 1
- Loop thru the array and get average.
### Part 2
- 

## Task 3
- Remember arrays in Java are jagged (ie: they need not be rectangular) so make sure to check if all of the arrays have the same length, exit as soon as any one of them does not have the same length.
- For magic squares, the values range only from 1 to N^2 and exactly once. Exit if anything appears twice or something is beyond this range.
- You may use a boolean array whose indexes act as the values you are checking for in the magic square. ie: if you find 5 in the magic square then you are going to mark the 5th location in this boolean array as true (ie: used[4] - here used is the name of the boolean array and 4 actually refers to the 5th location because indexing in ana array is N-1 as it starts from 0).
- In total, you will first need two for loops to iterate through the array of arrays and a bunch of if statements within them to check for out of range and repeated occurence condition (if a value appears twice then used[value-1] (indexing hence value-1 instead of value) is goging to already be true instead of false) and only then are you going to amrk it to be true. Then another separate for loop outside these nested for loops to check if all the locations within the boolean array is marked true. This way you are sure that all the values from 1 to N^2 are there and appear exactly once.
- Everything should sum upto magic total (Remember you get N from the length of an individual array) and summing up rows is with 2 loops, inner loop for second index and outer loop for first index. And vice versa for column. For the two diagonals - think about the indexes of diagonals - how are they special?

## Task 4
- How can you optimize the prime number program?
- A few hints could be:
  - Do you need to search for all the numbers?
    - You know that some numbers cannot be prime - like even numbers (other than 2)
    - you don't have to search all the numbers until the candidate to see if its divisible - where do you think you should stop? (hint: think of factors and square roots)
    - [Sieve of Erasthosthenes](https://web.nmsu.edu/~pbaggett/Lessons/primeNumbers/primeNumbers.html)
    - Another really important thing - your task requires you to get all list of primes. To find if a number is prime or not, then the main criteria it needs to fulfill is that it shouldn't be divisible by the previous list of primes (which you already have). This probably enough to really boost your program execution speed.
 
