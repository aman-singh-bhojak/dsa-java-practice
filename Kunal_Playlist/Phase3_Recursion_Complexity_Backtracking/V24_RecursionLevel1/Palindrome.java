package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V24_RecursionLevel1;

public class Palindrome {
    public static void main(String[] args) {

        int n = 1;
        if(n == rev(n)) {
            System.out.println("It is a palindrome num.");
        } else {
            System.out.println("Its not.");
        }
    }

    static int rev(int n) {
        int digit = (int)(Math.log10(n) + 1);
        return helper(n , digit);
    }

    static int helper(int n, int digit) {
        if(n < 10) {
            return n;
        }

        int rem = n % 10;
        return rem * (int)(Math.pow(10, digit - 1)) + helper(n/10, digit - 1);
    }
}
