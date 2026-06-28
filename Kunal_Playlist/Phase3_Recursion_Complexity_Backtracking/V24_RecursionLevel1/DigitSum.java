package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V24_RecursionLevel1;

public class DigitSum {
    public static void main(String[] args) {
        int n = 246546556;

        int ans = 0;

        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }

        System.out.println(ans);
    }
}
