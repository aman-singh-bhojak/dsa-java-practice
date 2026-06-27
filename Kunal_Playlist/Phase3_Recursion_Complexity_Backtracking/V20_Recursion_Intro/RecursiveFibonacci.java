package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V20_Recursion_Intro;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        int ans = fibon(5);
        System.out.println(ans);
    }

    static int fibon(int n) {
        if(n < 2) {
            return n;
        }

        return fibon(n - 1) + fibon(n - 2);
    }
}
