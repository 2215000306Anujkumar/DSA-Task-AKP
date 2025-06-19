import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>(); // To store all solutions
        boolean[][] board = new boolean[n][n]; // Initialize board
        Queen(board, 0, n, results);
        return results; // Return results instead of result
    }

    public static void Queen(boolean[][] board, int row, int tq, List<List<String>> results) {
        if (tq == 0) {
            // Convert the board to a readable list format and add it to results
            results.add(convertBoardToList(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isItsSafe(board, row, col)) {
                board[row][col] = true;
                Queen(board, row + 1, tq - 1, results);
                board[row][col] = false; // Backtrack
            }
        }
    }

    public static boolean isItsSafe(boolean[][] board, int row, int col) {
        // Check vertically upwards
        int r = row;
        while (r >= 0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }

        // Check left diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // Check right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }

    public static List<String> convertBoardToList(boolean[][] board) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder rowRepresentation = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    rowRepresentation.append("Q"); // Queen's position
                } else {
                    rowRepresentation.append("."); // Empty space
                }
            }
            solution.add(rowRepresentation.toString());
        }
        return solution;
    }
}