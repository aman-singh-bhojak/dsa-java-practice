package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V28_QuickSort;

import java.util.Arrays;

public class quicksorting {
    public static void main(String[] args) {
        int[] arr = {5,12,6,9,10,15,7};
        recur_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void recur_sort(int[] nums, int low, int high) {

        if(low >= high) {
            return;
        }

        int st = low;
        int end = high;
        int mid = st + (end - st) / 2;
        int pivot = nums[mid];

        while (st <= end) {
            while (nums[st] < pivot) {
                st++;
            }

            while (nums[end] > pivot) {
                end--;
            }

            if(st <= end) {
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
            
        }

        recur_sort(nums, low, end);
        recur_sort(nums, st, high);
    }
}
