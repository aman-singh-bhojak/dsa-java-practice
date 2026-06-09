package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V12_BinarySearchInterviewQs;

public class SearchInInfiniteArray {

    // Simulates the infinite array
    static int get(int[] arr, int index) {
        if(index >= arr.length) {
            return Integer.MAX_VALUE; // out of bounds = infinity
        }
        return arr[index];
    }

    static int searchInfinite(int[] nums, int target) {
        int st = 0;
        int end = 1;

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
        return st;
    }

   
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        int target = 17;

        int result = searchInfinite(arr, target);
        System.out.println("Found at index: " + result);
    }
}

