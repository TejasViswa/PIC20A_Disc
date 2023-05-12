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
- `TicTacToe` constructor
  - In the constructor for the `TicTacToe` class, just **change the `super(.....)` method appropriately**.
  - Once the constructor finished execution, the `super.board` actually looks like the following:
  - ```
     | | 
    -----
     | |
    -----
     | | 
    ```
  - Thus, it is filled with `' '` (white space character) initially which will later help when you print it. **Nothing to change in this**.
- `toString`
  - It is already implemented, **nothing to change here**.
  - Remember that for the `toString` method, you need to return a `String`.
  - We create a new `String` and appropriately concatenate it with all the elements of the `super.board` and all the required formatting.
  - Remember that a newline character is specified with `'\n'` and when concatenated with the `String`, it gives you a new line.
- `askForMove(int)`
  - It needs to only print some stuff onto the console.
  - Look up `demo.txt` for what it needs to print.
  - Note that `super.current` gives you access to the current `player` and `player` class has a method called `getName` which may prove useful.
  - Remember, it has access to `round` variable which you can use to check is `odd` or `even` and then decide whether to print `X` or `O` to the console.
- `receiveMove`
  - It is already implemented, **nothing to change here**.
  - This method only receives input from the user and does not validate it.
- `generateMove`
  - It is already implemented, **nothing to change here**.
  - This method only generates a random move.
- `validMove`
  - It needs to only make sure that the input received is within 0 to 2.
  - Additionally, it should also check if the element in that location is empty (ie: `' '` white space character).
- `applyMove(int)`
  - Remember, it has access to `round` variable which you can use to check is `odd` or `even` and then set the location to `X` or `O` respectively.
  - To get the value in row - `i` and column - `j`, you can call `super.board[2*i][2*j]`
  - It needs to only fill the location in `super.board` and nothing more.
- `someoneWon`
  - To get the value in row - `i` and column - `j`, you can call `super.board[2*i][2*j]`
  - It needs to check if there are 3 continuous `X`'s or `O`'s in any direction.
  - You may choose check for this manually for each element within `super.board` for each direction or you may also choose to write a generalized code which can extend to a square of any size.
- `celebrateMove`
  - It just prints stuff to the console again. Refer to `askForMove`.
  
## Task 7
- Test, test, test. Keep testing with the debugger
