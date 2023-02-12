# HW3 Hints

## Task 1
Well... here's one of the lines from the show:

> Jen: ["They've turned me into one of them. I am one of them. That's why you need me. I am your conduit. I am your bridge. Ich bin ein nerd!"](https://www.youtube.com/watch?v=sD3SF6foL00&t=5s)

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
  1. For checking the rows, a simple approach is use two counters for `R` and `Y` which keep incrementing and resetting(if `R` is encountered then the counter for `R` is incremented and `Y` counter is reset to zero and vice versa. When empty slot is encountered, both are reset to zero) appropriately when checking along the row. If any point, any of the counters reach 4 then you break out of the nest for loops.
  2. Similar approach with i and j exchanged. Remember that the limits for i and j are not the same. COLS=7 and ROWS=6.
  3. The concept for checking diagonals can be made similarly but with a rotated square.
  ```c++
  // Note that the following for-loop is allowed and can be really useful as an inner for-loop for this part
  for(int i = 0, j = n; i <= n ; i++, j-- )
  {
    .....
  }
  ```
  4. Similar to the previous for left diagonal with different conditions in the for-loop.
9. Refer to Task 6 - point 8.
10. Refer to Task 6 - point 9.

## Task 8
Test, test, test. Keep testing with the debugger
