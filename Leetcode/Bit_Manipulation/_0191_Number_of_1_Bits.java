package Leetcode.Bit_Manipulation;

public class _0191_Number_of_1_Bits {
    public static void main(String[] args) {
        int n = 234567;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n & (n-1);
        }

        return count;
    }
}
