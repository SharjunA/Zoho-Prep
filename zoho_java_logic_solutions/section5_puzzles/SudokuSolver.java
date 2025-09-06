public class SudokuSolver {
    static final int N = 9;
    static boolean isSafe(int[][] grid, int row, int col, int num) {
        for (int x = 0; x < N; x++)
            if (grid[row][x] == num || grid[x][col] == num ||
                grid[row - row % 3 + x / 3][col - col % 3 + x % 3] == num)
                return false;
        return true;
    }
    static boolean solveSudoku(int[][] grid, int row, int col) {
        if (row == N - 1 && col == N) return true;
        if (col == N) { row++; col = 0; }
        if (grid[row][col] != 0) return solveSudoku(grid, row, col + 1);
        for (int num = 1; num <= N; num++) {
            if (isSafe(grid, row, col, num)) {
                grid[row][col] = num;
                if (solveSudoku(grid, row, col + 1)) return true;
                grid[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] grid = new int[9][9]; // Add test grid here
        if (solveSudoku(grid, 0, 0)) System.out.println("Solved!");
        else System.out.println("No solution");
    }
}