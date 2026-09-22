package Leetcode.Recursion;

public class _0050_Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
    }

    static double myPow(double x, long n) {
        if(n == 0) {
            return 1;
        }

        long N = n;

        if(N < 0) {
            return (1 / myPow(x, -N));
        }

        if(n % 2 == 0) {
            return myPow(x * x, n / 2);
        }

        return x * myPow(x * x, n / 2);
    }

}
