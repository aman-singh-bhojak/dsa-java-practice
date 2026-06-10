package Leetcode.Binary_Search_;

public class _0852_PeakIndexInMountainArray {
    static int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while(st < end) {
            int mid = st + (end - st) / 2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }
        return st;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2};
        int result = peakIndexInMountainArray(arr);
        System.out.println("The peak index in mountain array is: " + result);
    }
}
