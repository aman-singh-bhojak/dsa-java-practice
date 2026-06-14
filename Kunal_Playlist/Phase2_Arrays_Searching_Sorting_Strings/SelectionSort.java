package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings;

import java.util.Arrays;

public class SelectionSort {

    static void Selection(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxIndex = getmaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }

    }

    static int getmaxIndex(int[] arr, int start, int end) {
        int max = start;

        for(int i = start; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        
        return max;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {55, -9, 77, -1, 0};
        Selection(nums);
        System.out.println(Arrays.toString(nums));
    }
}
