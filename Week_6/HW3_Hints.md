# HW3 Hints

## Task 1
Well... here's one of the lines from the show:

> Jen: ["They've turned me into one of them. I am one of them. That's why you need me. I am your conduit. I am your bridge. Ich bin ein nerd!"](https://www.youtube.com/watch?v=sD3SF6foL00)

## Task 2
Notice that Player class has factory methods - `createHuman` and `createComputer` to create instances of player as a human and an AI. And thus, the constructor is made private.

## Task 3
Take note of the `play` and `prepareForNextMove` methods really well.

## Task 4
`TestGames.java` is the file you need to run to test eveything. It has two games of tictactoe and connectfour each. One from each is human vs AI and other with human vs human.

## Task 5
Alternatively, you may choose to place breakpoints in certain lines of code (ones that you are editing) within `TicTacToe.java` and `ConnectFour.java`. Then, use the debugger on `TestGames.java` to check how your lines of code are actually working.

## Task 6
1. Write the constructor for the `TicTacToe` class. Change the `super(.....)` method appropriately. Additionally, you may also fill the `super.board` with `' '` (white space character) initially which will later help when you print it.
2. Remember that for the `toString` method, you need to return a `String`. Create a new `String` and appropriately concatenate it with all the elements of the `super.board` and all the required formatting. Remember that a newline character is specified with `'\n'` and when concatenated with the `String`, it gives you a new line.
3. `askForMove` needs to only print some stuff onto the console. Look up `demo.txt` for what it needs to print. Note that `super.current` gives you access to the current `player` and `player` class has a method called `getName` which may prove useful.
4. `receiveMove` method only receives input from the user and does not validate it. And `generateMove` method only generates a random move. Nothing to change here but note how it works.
5. `validMove` needs to make sure that the input received is within range of `super.board`'s rows and columns. Additionally, it should also check if the element in that location is empty.
6. `applyMove` needs to only fill the location in `super.board` and nothing more.
7. `someoneWon` needs to check if there are 3 continuous `X`'s or `O`'s in any direction. You may choose check for this manually for each element within `super.board` for each direction or you may also choose to write a generalized code which can extend to a square of any size. If you choose the second method, it can really help with the second part of your HW (ie: ConnectFour).
8. `celebrateMove` is just printing stuff to the console again. Refer to point 3.
9. Remember that there was a `prepareForNextMove` in the `TwoPlayerBoardGames` class. Thus, you can override it here with the additional functionality of changing the char `XO`. You may use the `ternary` operator for making your code simple.
```c++
// Using the ternary operator:
// Here, c is compared with 'a' and if true, 'b' is assigned to it otherwise 'a' is assigned to it
char c;
c = (c == 'a')? 'b' : 'a';
```

## Task 7
1. Refer to Task 6 - point 1.
2. Refer to Task 6 - point 2.
3. Refer to Task 6 - point 3.
4. `receiveMove` and `generateMove` methods in `ConnectFour` are similar to the ones in `TicTacToe`
5. `validMove` needs to make sure that the input received is within range of `super.board`'s columns. Additionally, you must also iterate through the elements of that column to check if there are any empty slots remaining.
6. `applyMove` needs to only fill the location in `super.board` by iterating through the elements in that column until it finds an empty slot
7. Now, this is the most interesting part of the HW. Checking for the continuous four `R`'s or `Y`'s is relatively easier than checking for the diagonals. 
    - For checking the rows, a simple approach is use two counters for `R` and `Y` which keep incrementing and resetting(if `R` is encountered then the counter for `R` is incremented and `Y` counter is reset to zero and vice versa. When empty slot is encountered, both are reset to zero) appropriately when checking along the row. If at any point, any of the counters reach 4 then you return `true` from the method.
    - Similar approach with i and j exchanged. Remember that the limits for i and j are not the same. COLS=7 and ROWS=6.
    - The concept for checking right diagonals can be made similarly but with a rotated square. You will also need a nested for-loop here but the way it should iterate is slightly different. And, when the values that it should iterate over exceeds the range you want it to be in, then you may use a `continue` statement to skip over that value/iteration.
    ```
    Your board actually looks like: (in terms of indexes where first number is i and second is j)
    
    | 00 01 02 03 04 05 06 |
    | 10 11 12 13 14 15 16 |
    | 20 21 22 23 24 25 26 |
    | 30 31 32 33 34 35 36 |
    | 40 41 42 43 44 45 46 |
    | 50 51 52 53 54 55 56 |
    
    Then, when you iterate over i and j for right diagonal check, the values should be like:
    (where first number is i and second is j)
    
    00      
    01 10       
    02 11 20  
    03 12 21 30  
    04 13 22 32 40  
    05 14 23 32 41 50  
    06 15 24 33 42 51  
    16 25 34 43 52    
    26 35 44 53       
    36 45 54        
    46 55             
    56             
    ```
    ```c++
    // Note that the following for-loop is allowed and can be really useful as an inner for-loop for this part
    for(int i = 0, j = n; i <= n ; i++, j-- )
    {
        if(...beyond certain limits...)
            continue;
    }
    ```
    - Similar to the previous for left diagonal with different conditions in the inner for-loop.
    ```
    When you iterate over i and j for left diagonal check, the values should be like:
    (where first number is i and second is j)
    
    06
    05 16
    04 15 26
    03 14 25 36
    02 13 24 35 46
    01 12 23 34 45 56
    00 11 22 33 44 55
    10 21 32 43 54
    20 31 42 53
    30 41 52
    40 51
    50
    ```
8. Refer to Task 6 - point 8.
9. Refer to Task 6 - point 9.

## Task 8
Test, test, test. Keep testing with the debugger
