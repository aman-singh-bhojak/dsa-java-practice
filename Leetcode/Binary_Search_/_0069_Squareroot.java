package Leetcode.Binary_Search_;

import java.util.Scanner;
public class _0069_Squareroot {
    
    static int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }

        long start = 1;
        long end = x;

        while(start <= end) {
            long mid = start + (end - start) / 2;

            if(mid * mid == x) {
                return (int) mid;
            } else if(mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return (int) end;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int result = mySqrt(num);
        System.out.println("The sqrt or the closet srrt of the number is: " + result);
        in.close();
    }
}