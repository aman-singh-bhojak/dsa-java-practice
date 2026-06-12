package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V12_BinarySearchInterviewQs;

public class RotationCount {
    static int getpivot(int[] nums) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if(mid > st && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if(nums[mid] <= nums[st]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }

        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {8,10,15,2,4,6};
        int result = getpivot(arr);

        System.out.println("The Target element is rotated : " + (result + 1) + " times.");
        
    }
}
