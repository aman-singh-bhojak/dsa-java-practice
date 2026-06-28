package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V24_RecursionLevel1;

public class NumberPrint {
     public static void main(String[] args) {
        funBoth(3);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
