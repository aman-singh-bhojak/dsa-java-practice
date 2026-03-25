package Leetcode.Binary_Search_;

import java.util.Arrays;

public class _0034_FirstandLastPosition {

    public static int[] SearchRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        int Start = search(arr, target, true);
        int End = search(arr, target, false);
        
        ans[0] = Start;
        ans[1] = End;

        return ans;
    }

    static int search(int[] arr, int target, boolean FindStartIndex) {
        int ans = -1;
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                st = mid + 1;
            } else {
                ans = mid;
                if(FindStartIndex) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        } 
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int[] result = SearchRange(arr, 10);
        System.out.println("The Start and End Index: " + Arrays.toString(result));
    }
}
