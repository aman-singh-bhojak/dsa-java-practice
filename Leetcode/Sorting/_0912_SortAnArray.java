package Leetcode.Sorting;

import java.util.Arrays;

public class _0912_SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4, 2, 8, 7, 6};

        System.out.println("Before: " + Arrays.toString(arr));

        sortArray(arr);

        System.out.println("After : " + Arrays.toString(arr));
    }


    static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = low + (int)(Math.random() * (high - low + 1));
        int pivot = nums[pivotIndex];

        int lt = low;
        int i = low;
        int gt = high;

        while (i <= gt) {
            if (nums[i] < pivot) {
                swap(nums, lt++, i++);
            } else if (nums[i] > pivot) {
                swap(nums, i, gt--);
            } else {
                i++;
            }
        }

        quickSort(nums, low, lt - 1);
        quickSort(nums, gt + 1, high);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
