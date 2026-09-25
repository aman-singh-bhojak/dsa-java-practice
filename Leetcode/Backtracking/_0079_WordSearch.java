package Leetcode.Backtracking;

public class _0079_WordSearch {
    public static void main(String[] args) {

        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        System.out.println(exist(board, word));
    }

    static boolean exist(char[][] board, String word) {

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {

                if (helper(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean helper(char[][] board, String word,
                          int row, int col, int index) {

        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        if (board[row][col] == word.charAt(index)) {

            if (index == word.length() - 1) {
                return true;
            }

        } else {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '.';

        boolean found =
            helper(board, word, row - 1, col, index + 1) ||
            helper(board, word, row + 1, col, index + 1) ||
            helper(board, word, row, col - 1, index + 1) ||
            helper(board, word, row, col + 1, index + 1);

        board[row][col] = temp;

        return found;
    }
}
