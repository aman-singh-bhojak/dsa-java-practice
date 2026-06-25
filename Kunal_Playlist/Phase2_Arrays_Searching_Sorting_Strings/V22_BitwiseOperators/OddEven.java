package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V22_BitwiseOperators;

public class OddEven {

    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}

