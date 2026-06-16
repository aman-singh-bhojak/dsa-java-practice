package Leetcode.Cyclic_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _0442_FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] arr) {
        

        int i = 0;

         while (i < arr.length){
            int correct = arr[i] - 1;

            if(arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }


        }

        List<Integer> list = new ArrayList<>();

        for(int index = 0; index < arr.length; index++)  {
            if(arr[index] != index + 1) {
                list.add(arr[index]);
            }
        }

        Collections.sort(list);
        return list;

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        _0442_FindAllDuplicatesInArray obj = new _0442_FindAllDuplicatesInArray();
        System.out.println(obj.findDuplicates(arr));
    }
}
