package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V32_Backtracking;

import java.util.Arrays;

public class BackTrack{
    public static void main(String[] args) {
        
        boolean[][] boxes = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        pathTaken("", boxes, 0, 0);
        System.out.println("=============");

        int[][] path = new int[boxes.length][boxes[0].length];
        PathWithSteps("", boxes, path, 0, 0, 1);
    }

    static void pathTaken(String p, boolean[][] maze, int r, int c) {

        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if(r < maze.length - 1) {
            pathTaken(p + "D", maze, r + 1, c);
        }

        if(c < maze[0].length - 1) {
            pathTaken(p + "R", maze, r, c + 1);
        }

        if(r > 0) {
            pathTaken(p + "U", maze, r - 1, c);
        }

        if(c > 0) {
            pathTaken(p + "L", maze, r, c - 1);
        }

        maze[r][c] = true;

    }

    static void PathWithSteps(String p, boolean[][] maze, int[][] path, int r, int c, int steps) {

        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;

        if(r < maze.length - 1) {
            PathWithSteps(p + "D", maze, path, r + 1, c, steps + 1);
        }

        if(c < maze[0].length - 1) {
            PathWithSteps(p + "R", maze, path, r, c + 1, steps + 1);
        }

        if(r > 0) {
            PathWithSteps(p + "U", maze, path, r - 1, c, steps + 1);
        }

        if(c > 0) {
            PathWithSteps(p + "L", maze, path, r, c - 1, steps + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
