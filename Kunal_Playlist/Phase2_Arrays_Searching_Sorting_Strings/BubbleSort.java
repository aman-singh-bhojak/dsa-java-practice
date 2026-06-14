package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings;

import java.util.Arrays;

public class BubbleSort {
    static void bubble(int[] arr) {

        boolean swapped;

        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;               
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {0, -4, 3, -1, 2};
        bubble(arr);

    }
}
