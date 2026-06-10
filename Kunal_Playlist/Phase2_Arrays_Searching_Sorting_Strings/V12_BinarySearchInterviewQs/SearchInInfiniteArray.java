package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V12_BinarySearchInterviewQs;

public class SearchInInfiniteArray {

    static int InfArr(int[] arr, int target) {
        int st = 0;
        int end = 1;
        
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - st + 1) * 2;
            st = temp;
        }

        return BinarySearch(arr, target, st, end);
    }

    static int BinarySearch(int[] arr, int target, int st, int end) {

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
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        int result = InfArr(arr, target);
        System.out.println("Found at index: " + result);
    }
}

