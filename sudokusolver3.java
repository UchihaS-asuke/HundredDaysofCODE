public class sudokusolver3 {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }
        // column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // grid
        int startrow = (row / 3) * 3;
        int startcol = (col / 3) * 3;
        for (int i = startrow; i < startrow + 3; i++) {
            for (int j = startcol; j < startcol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void prntsudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean sudokusolver(int[][] sudoku, int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // recursion
        int nxtrow = row;
        int nxtcol = col + 1;
        if (col+1 == 9) {
            nxtrow = row + 1;
            nxtcol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nxtrow, nxtcol);
        }
        for (int digit = 1; digit < 10; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if(sudokusolver(sudoku, nxtrow, nxtcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
        };
        if (sudokusolver(sudoku, 0, 0)) {
            prntsudoku(sudoku);
        }else{
            System.out.println("Solution does not exist");
        }
    }
}