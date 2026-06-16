package Leetcode.Cyclic_Sort;

public class _0041_FirstMissingPositive {
    static int MissingPositive(int[] nums) {
        int i = 0;
        
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++)  {
            if(nums[index] != index + 1) {
                return index+1;
            }
        }

        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        int result = MissingPositive(arr);
        System.out.println("The first missing positive number is: "  + result);
    }
}
