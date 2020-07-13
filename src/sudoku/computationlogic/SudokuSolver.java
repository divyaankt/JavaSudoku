package sudoku.computationlogic;

import sudoku.problemdomain.Coordinates;

import static sudoku.problemdomain.SudokuGame.GRID_BOUNDARY;

public class SudokuSolver {

    /**
     * Enumerate all empty cells in typewriter order (left to right, top to bottom)
     * <p>
     * 1. Traverse x from from 0-8 for each y, from 0-8, adding to a 1 dimensional array.
     * <p>
     * NOTE: Assume that the maximum number of empty cells is 40, as per GameGenerator
     *
     * @param puzzle
     * @return
     */
    private static Coordinates[] typeWriterEnumerate(int[][] puzzle) {
        Coordinates[] emptyCells = new Coordinates[40];
        int iterator = 0;
        for (int y = 0; y < GRID_BOUNDARY; y++) {
            for (int x = 0; x < GRID_BOUNDARY; x++) {
                if (puzzle[x][y] == 0) {
                    emptyCells[iterator] = new Coordinates(x, y);
                    if (iterator == 39) return emptyCells;
                    iterator++;
                }
            }
        }
        return emptyCells;
    }
}
