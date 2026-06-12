package Leetcode.Binary_Search_;

public class _0033_SearchInRotatedSortedArray {
    static int rotatedsearch(int[] arr, int target) {
        int pivot = findpivot(arr);
        
        if(pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }

        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    static int findpivot(int[] nums) {

        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            
            int mid = st + (end - st) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if(mid > st  && nums[mid] < nums[mid - 1]){
                return mid-1;
            } 

            if(nums[mid] <= nums[st]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }

        return -1;
    }

    static int binarySearch(int[] arr, int target, int st, int end) {

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                st = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,0,1,2,3,4,5};
        int target = 0;
        int result = rotatedsearch(arr, target);
        if(result != -1) {
            System.out.println("The Target element is found at index : " + result);
        } else {
            System.out.println("The target element is not found");
        }
    }
}
