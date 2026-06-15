package Leetcode.Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class _0448_DisappearedNumberInArray {
    List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int i = 0;
        
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if(nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++)  {
            if(nums[index] != index + 1) {
                list.add(index+1);
            }
        }

        return list;
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        _0448_DisappearedNumberInArray obj = new _0448_DisappearedNumberInArray();

        System.out.println(obj.findDisappearedNumbers(arr));

    }
}
