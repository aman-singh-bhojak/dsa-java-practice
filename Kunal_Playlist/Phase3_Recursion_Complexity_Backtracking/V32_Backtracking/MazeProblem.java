package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V32_Backtracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println("The count is: " + count(3, 3));
        System.out.println(pathList("", 3, 3));
        System.out.println(pathDiagnoalAlso("", 3, 3));

        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        pathWithObstacle("", board, 0, 0);
    }

    static void path(String p, int r, int c) {

        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            path(p + "V", r - 1, c);
        }

        if(c > 1) {
            path(p + "R", r , c - 1);
        }

    }

    static int count(int r, int c) {
        if(r == 1 ||  c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;

    }

    static ArrayList<String> pathList(String p, int r, int c) {

        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1) {
            list.addAll(pathList(p + "V", r - 1, c));
        }

        if(c > 1) {
            list.addAll(pathList(p + "R", r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathDiagnoalAlso(String p, int r, int c) {

        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1) {
            list.addAll(pathDiagnoalAlso(p + "D", r - 1, c - 1));
        }

        if(r > 1) {
            list.addAll(pathList(p + "V", r - 1, c));
        }

        if(c > 1) {
            list.addAll(pathList(p + "R", r, c - 1));
        }

        return list;
    }

    static void pathWithObstacle(String p, boolean[][] maze, int r, int c) {

        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c]) {
            return;
        }

        if(r < maze.length - 1) {
            pathWithObstacle(p + "D", maze, r + 1, c);
        }

        if(c < maze[0].length - 1) {
            pathWithObstacle(p + "R", maze, r, c + 1);
        }
    }

}
