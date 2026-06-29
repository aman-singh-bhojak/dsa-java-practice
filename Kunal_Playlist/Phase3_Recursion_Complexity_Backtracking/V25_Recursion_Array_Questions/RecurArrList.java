package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V25_Recursion_Array_Questions;

import java.util.ArrayList;

public class RecurArrList {
    // static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(isFound(arr, target, 0, list));
        isFound(arr, target, 0, list);
        System.out.println(list);
        
    }

    // static void isFound(int[] arr, int target, int i) {

    //     if(i == arr.length) {
    //         return;
    //     }

    //     if (arr[i] == target) {
    //         list.add(i);
    //     }

    //     isFound(arr, target, i+1);
    // }

    static void isFound(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        isFound(arr, target, index+1, list);
        
    }
}
