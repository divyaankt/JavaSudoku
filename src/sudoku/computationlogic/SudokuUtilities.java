package sudoku.computationlogic;

import sudoku.problemdomain.SudokuGame;

import java.util.Arrays;

public class SudokuUtilities {
    /**
     * Copy the values from one sudoku grid into another
     *
     *
     * @param oldArray
     * @param newArray
     */
    public static void copySudokuArrayValues(int[][] oldArray, int[][] newArray) {
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++){
                newArray[xIndex] = Arrays.copyOf(oldArray[xIndex], SudokuGame.GRID_BOUNDARY);
        }
    }

    /**
     * Creates and returns a new Array with the same values as the inputted Array.
     *
     * @param oldArray
     */
    public static int[][] copyToNewArray(int[][] oldArray) {
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
        for (int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++){
            newArray[xIndex] = Arrays.copyOf(oldArray[xIndex], SudokuGame.GRID_BOUNDARY);
        }

        return newArray;
    }

}
