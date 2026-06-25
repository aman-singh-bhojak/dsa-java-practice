package Leetcode.Bit_Manipulation;

public class _0231_Power_of_Two {
     public static void main(String[] args) {
        int n = 31;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
