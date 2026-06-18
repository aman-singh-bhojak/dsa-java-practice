package Leetcode.Array_;

import java.util.Arrays;

public class _0283_MoveZeroes {
    static void moveZeroes(int[] nums) {
        int insertPos = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;

                insertPos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

    }
}
