// Topic: Linear Search
// Date: 08-09 Mar 2026

package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    // ── Lecture Method Code ──────────────────────────────────

    // 1. Target and search:
    static int Find(int[] nums, int key) {

        if(nums.length == 0) {
            return -1;
        }

        for(int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if(element == key) {
                return i;
            }
        }

        return -1;
    }


    // 2. Minimum Element:
    static int min(int[] minimum) {
        int result = minimum[0];
        for(int i = 0; i < minimum.length; i++) {
            if(minimum[i] < result) {
                result = minimum[i];
            }
        }
        return result;
    }
    

    // 3. Search in String:
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    // 4. Search in Range:
    static int in_range(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }

    // 5.Search element in 2-D array:
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // ── Lecture Code ──────────────────────────────────

        // 1. To Search an element is present or not:
        int[] arr = {12,42,433,654,23,87,98,64,93,26,65};
        int target = 64;

        int ans = Find(arr, target);
        System.out.println("Element found at index: " + ans);


        // 2. To find the minimum element:
        System.out.println("The minimum element of the array is: " + min(arr));


        // 3.To Search for element in String:
        System.out.print("Enter a String: ");
        String name = in.nextLine();
        System.out.print("Enter a character to find: ");
        char finding = in.next().charAt(0);
        System.out.println("Element present in string: " + search(name, finding));


        // 4. Linear Search by start and end index:
        System.out.print("Enter element to search in range: ");
        int check = in.nextInt();
        int returning = in_range(arr, check, 2, 7);

        if(returning == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element is stored at index: " + returning);
        }

        // 5. Searching in 2-D array:
        int[][] arrays = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        System.out.print("Enter element to find in 2-D array: ");
        int tofind = in.nextInt();
        int[] output = search(arrays,tofind);
        System.out.println(Arrays.toString(output));

        in.close();
    }
}
