package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class _0046_Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permute(arr));
    }

    static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();

        int[] used = new int[nums.length];

        backtrack(outer, inner, nums, used);

        return outer;
    }

    static void backtrack(List<List<Integer>> ans, List<Integer> list, int[] arr, int[] used) {
        if(list.size() == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            if(used[i] == 0) {
                used[i] = 1;
                list.add(arr[i]);
                backtrack(ans, list, arr, used);
                list.remove(list.size() - 1);
                used[i] = 0;
            }
        }
    }
}
