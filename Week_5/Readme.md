# READ ME
[Back to Discussion Main Page](https://github.com/TejasViswa/PIC20A_Disc)
### Legend
Symbols at the end of links and what they mean (hopefully) in order of importance:
- ?? - Exam or assignment help
- ? - Directly related to course content
- ! - Indirectly related to course content
- !! - Additional or Fun

# Spring 2023

```java
// Your weekly random ASCII maze generator brought to you by our friend ChatGPT

// This algorithm uses a recursive backtracking approach to generate the maze.
// It starts at a random cell and randomly chooses a direction to move in.
// If the adjacent cell in that direction is unvisited,
// it carves a path to that cell by replacing the wall characters with empty space characters.
// It then recursively repeats this process from the new cell until there are no more unvisited cells to move to.
// The shuffleArray method is used to randomize the order in which directions are attempted,
// which helps to produce more interesting and varied mazes.

import java.util.Random;

public class RandomMazeGenerator {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 20;

        Random rand = new Random();
        char[][] maze = new char[rows][cols];

        // Initialize maze with walls
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = '#';
            }
        }

        // Generate maze
        generateMaze(rand, maze, 1, 1);

        // Print maze
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    private static void generateMaze(Random rand, char[][] maze, int row, int col) {
        int[] directions = { 1, 2, 3, 4 };
        shuffleArray(rand, directions);

        for (int dir : directions) {
            int newRow = row;
            int newCol = col;

            if (dir == 1) {
                newRow -= 2;
            } else if (dir == 2) {
                newCol += 2;
            } else if (dir == 3) {
                newRow += 2;
            } else if (dir == 4) {
                newCol -= 2;
            }

            if (newRow < 1 || newRow >= maze.length - 1 || newCol < 1 || newCol >= maze[0].length - 1
                    || maze[newRow][newCol] != '#') {
                continue;
            }

            maze[newRow][newCol] = ' ';
            maze[(newRow + row) / 2][(newCol + col) / 2] = ' ';
            generateMaze(rand, maze, newRow, newCol);
        }
    }

    private static void shuffleArray(Random rand, int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

```
Sample Output
```
####################
#   #       #     ##
# # # ##### # # ####
# # # #     # #   ##
### # # ##### ### ##
# #   # #     #   ##
# ##### ####### # ##
#               # ##
####################
####################
```
## Simple RPG
- [Simple RPG](https://github.com/TejasViswa/PIC20A_Disc/tree/main/SimpleRPG) is a simple RPG-like game. Look at the README to see the sample output.
- It has `Player.java`,`Monster.java`,`Game.java` and `Main.java` files to illustrate how classes work and additionally uses the `Scanner` and `Random` classes.
- Remember that it is a very simple implementation and you may tweak it as you wish or improve upon it for better game mechanics.

## Pokemon Battle
- [Pokemon Battle](https://github.com/TejasViswa/PIC20A_Disc/tree/main/PokemonBattle) is a simple Pokemon Battle simulator. You will need to be connected to the internet for it to work. It emulates (well atleast it tries to ) a pokemon battle from the game "FireRead/LeafGreen" but you are restricted to only 1 move ie:tackle and assigned some pokemon at random and do not have any items. It does use type advantage for the pokemon so you have to strategize to win.

## Tue May 2
- [PokemonBattle Class](https://github.com/TejasViswa/PIC20A_Disc/blob/main/PokemonBattle/PokemonBattle.java) !!
- [PokemonWithType Class Exercise](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonWithTypeExercise.md) ?
- [PokemonWithType Class](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/PokemonWithType.java) ?
- [UndergradStudentTester](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_4/UndergradStudentTester.java) !
- [Arrays Vs Strings - Mutability](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/ArrayVsString.md) !
- [Strings in Java - Immutability](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_3/StringImmutable.md) !
- Disc 1B recording
    - [link](https://ucla.zoom.us/rec/share/P4Eid48RqYr22frIRHWwv7zKnZyhyiusZECO-8noYxpy7UO8tBochzZrUxcGHiJD.O_WQRs_21wvK4Y33)
    - Passcode: N@yZ7*?5

## Thu May 4
- [Midterm Review - Compile and Run java programs, Primitive types, conversions](MidtermReview1.md) ??
- [Midterm Review - Math functions, varargs, method overloading](MidtermReview2.md) ??
- [Conceptual Java Puzzles](https://github.com/TejasViswa/PIC20A_Disc/blob/main/Week_2/ConceptualPuzzles.md) ?
- Disc 1B recording
    - [link](https://ucla.zoom.us/rec/share/x_pGQW7L03enrjMeofc44qVCoSdp5wqh5F4JC1MgNhvGI4qknjpq76tmvvcp8SBb.PKhNgVVYLCjp5a6M)
    - Passcode: 5LE7t=Em

# Winter 2023

## Tue Feb 7
- Midterm Review

## Thu Feb 9
- [EmployeeTester](EmployeeTester.java)
