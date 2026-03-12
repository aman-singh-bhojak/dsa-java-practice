package Leetcode.Binary_Search_;

public class _0704_BinarySearch {
    static int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while(st <= end) {
            int mid = st + (end - st) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) { 
                st = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 5;
        int index = search(arr, target);
        if(index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element is found at index: " + index);
        }
    }
}
