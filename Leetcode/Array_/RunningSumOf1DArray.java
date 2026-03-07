package Leetcode.Array_;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        runningsum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            runningsum[i] = runningsum[i-1] + nums[i];
        }
        return runningsum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}