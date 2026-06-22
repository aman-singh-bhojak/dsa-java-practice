package Leetcode.Recursion;

public class _0509_Fibonacci_Number {
    public static void main(String[] args) {
        int ans = fibon(4);
        System.out.println(ans);
    }

    static int fibon(int n) {
        if(n < 2) {
            return n;
        }

        return fibon(n - 1) + fibon(n - 2);
    }
}
