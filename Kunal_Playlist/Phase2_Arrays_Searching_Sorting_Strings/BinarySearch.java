// Topic: Binary Search
// Date: 10-11 Mar 2026

package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings;

import java.util.Scanner;
public class BinarySearch {

    // ── Lecture Method Code ──────────────────────────────────

    // 1. Ascending order Binary Search:

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // might be  possible that (start - end) exceeds the range of int.
            int mid = start + (end - start) / 2;

            if(target  < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // 2. Order Agnostic Binary Search:
    static int OrderAgnosticsBS(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        // To find wether the given data is in ascending or descending order
        boolean isAsc = arr[st] < arr[end];

        while(st <= end) {
            int mid = st + (end - st) /2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target  < arr[mid]) {
                end = mid - 1;
                } else {
                st = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        } 
        return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ── Lecture Code ──────────────────────────────────

        // 1. When the array is given in ascending:

        int[] arr = {-13, -10, -6, -1, 0, 2, 6, 7, 13, 17, 20};
        int target = 7;
        int result = binarySearch(arr, target);

        if(result == -1) {
            System.out.println("The element is not present in the array.");
        } else {
            System.out.println("The element is present at index: " + result);
        }

        // 2. When we don't know the order of the array:

        System.out.print("Enter the number of elements you want to store in array: ");
        int n = in.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Now enter the elements either in ascending or in descending order: ");

        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int find = in.nextInt();

        int ans = OrderAgnosticsBS(arr2, find);

        if(ans == -1) {
            System.out.println("The element is not present in the array.");
        } else {
            System.out.println("The element is present at index: " + ans);
        }
        in.close();
    }
}
