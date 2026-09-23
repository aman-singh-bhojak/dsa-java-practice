package Leetcode.Backtracking;

public class _0037_SudokuSolver {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'3', '.', '6', '5', '.', '8', '4', '.', '.'},
                {'5', '2', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '8', '7', '.', '.', '.', '.', '3', '1'},
                {'.', '.', '3', '.', '1', '.', '.', '8', '.'},
                {'9', '.', '.', '8', '6', '3', '.', '.', '5'},
                {'.', '5', '.', '.', '9', '.', '6', '.', '.'},
                {'1', '3', '.', '.', '.', '.', '2', '5', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '7', '4'},
                {'.', '.', '5', '2', '.', '6', '3', '.', '.'}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1, col = -1;
        boolean emptyLeft = true;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == '.') {
                    row = i; col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft) break;
        }

        if(emptyLeft) return true;

        for(char number = '1'; number <= '9'; number++) {
            if(isSafe(board, row, col, number)) {
                board[row][col] = number;
                if(solve(board)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }
    
    static void display(char[][] board) {
        
        for(char[] row : board) {
            for(char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        for(int i = 0; i < board.length; i++) {
            if(board[row][i] == num) return false;
        }
        for(char[] r : board) {
            if(r[col] == num) return false;
        }
        int sqrt = 3;
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == num) return false;
            }
        }
        return true;
    }

}
