package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class _0051_NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];

        List<List<String>> ans = new ArrayList<>();
        queens(board, 0, ans);

        for(List<String> list : ans) {
            for(String row : list) {
                System.out.println(row);
            }
            System.out.println();
        }
        
    }

    static void queens(boolean[][] board, int row, List<List<String>> ans) {

        if(row == board.length) {

            List<String> list = new ArrayList<>();

            for(boolean[] r : board) {

                StringBuilder str = new StringBuilder();

                for(boolean element : r) {

                    if(element) {
                        str.append("Q ");
                    } else {
                        str.append("X ");
                    }
                }

                list.add(str.toString());
            }

            ans.add(list);

            return;
        }

        for(int col = 0; col < board.length; col++) {

            if(isSafe(board, row, col)) {

                board[row][col] = true;

                queens(board, row + 1, ans);

                board[row][col] = false;
            }
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // Vertical row
        for(int i = 0; i < row; i++) {

            if(board[i][col]) {
                return false;
            }
        }

        // Diagonal left
        int maxLeft = Math.min(row, col);

        for(int i = 1; i <= maxLeft; i++) {

            if(board[row - i][col - i]) {
                return false;
            }
        }

        // Diagonal right
        int maxRight = Math.min(row, board.length - col - 1);

        for(int i = 1; i <= maxRight; i++) {

            if(board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }
}
