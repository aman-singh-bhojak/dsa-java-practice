package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings;

import java.util.Arrays;

public class V17_CyclicSort {
    static void Cyclic(int[] arr) {
        int i = 0;

        while(i < arr.length){
            int check = arr[i] - 1;

            if(arr[i] != arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }


        }
    }
 
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
