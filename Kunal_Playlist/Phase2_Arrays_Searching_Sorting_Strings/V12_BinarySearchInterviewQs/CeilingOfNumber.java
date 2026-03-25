package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V12_BinarySearchInterviewQs;

public class CeilingOfNumber {
    static int Ceiling(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return st;

    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,10,23,56,78,90,100};
        int target = 55;

        int result = Ceiling(arr, target);

        System.out.println("Ceiling of " + target + " is: " + arr[result]);

    }
}
