package Leetcode.Bit_Manipulation;

import java.util.*;

public class _0040_CombinationSumII {
    public static void main(String[] args) {

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> ans = combinationSum2(candidates, target);

        System.out.println(ans);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, list, ans);

        return ans;
    }

    public static void backtrack(int[] arr, int target, int index, List<Integer> list, List<List<Integer>> ans) {

        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < arr.length; i++) {

            if(i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if(arr[i] > target) {
                break;
            }

            list.add(arr[i]);

            backtrack(arr, target - arr[i], i + 1, list, ans);

            list.remove(list.size() - 1);
        }
    }
}
