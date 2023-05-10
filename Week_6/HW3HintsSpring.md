# HW3 Hints

## Task 1
- Learn `Tic-Tac-Toe` please.

## Task 2
- Notice that Player class has factory methods - `createHuman` and `createComputer` to create instances of player as a human and an AI. And thus, the constructor is made private.

## Task 3
- Take note of the `play` and `prepareForNextMove` methods really well.

## Task 4
- `TestGames.java` is the file you need to run to test eveything. It has two games of tictactoe.
- One is human vs AI and other is human vs human.

## Task 5
- Alternatively, you may choose to place breakpoints in certain lines of code (ones that you are editing) within `TicTacToe.java`.
- Then, use the debugger on `TestGames.java` to check how your lines of code are actually working.

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
char c = 'a';
c = (c == 'a')? 'b' : 'a';
```

## Task 7
- Test, test, test. Keep testing with the debugger
