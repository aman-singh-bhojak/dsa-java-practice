package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V27_MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(merge(arr)));
    }

    static int[] merge(int[] arr) {

        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));


        return sort(left,right);
    }

    static int[] sort(int[] first, int[] second) {
        int[] merge = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merge[k] = first[i];
                i++;
            } else {
                merge[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            merge[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            merge[k] = second[j];
            j++;
            k++;
        }

        return merge;
    }
}
