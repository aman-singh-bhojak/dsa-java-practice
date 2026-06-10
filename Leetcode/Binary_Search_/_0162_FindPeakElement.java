package Leetcode.Binary_Search_;

public class _0162_FindPeakElement {
    static int findPeakElement(int[] nums) {
       int st = 0;
        int end = nums.length - 1;

        while(st < end) {
            int mid = st + (end - st) / 2;

            if(nums[mid] < nums[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return st; 
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,4,3,2};
        int result = findPeakElement(array);
        System.out.println("The peak element index is: " + result);
    }
}
