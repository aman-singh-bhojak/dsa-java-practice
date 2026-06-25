package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V22_BitwiseOperators;

import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int base = 10;
        int ans = (int)(Math.log(num) / Math.log(base)) + 1;

        System.out.println(ans);
        in.close();
    }
}
