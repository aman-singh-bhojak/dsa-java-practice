package Leetcode.Cyclic_Sort;

public class _0287_findDuplicate {

    static int DuplicateNum(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
    
                if(nums[i] != i+1) {
    
                    if(nums[i] < nums.length && nums[i] != nums[correct]) {
                        swap(nums, i, correct); 
                    } else {
                        return nums[i];
                    }
    
                } else {
                    i++;
                }
            }
    
            return -1;
    
        }
    
        static void swap(int[] arr, int first, int second) {
    
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    
        }
    
        public static void main(String[] args) {
            int[] arr = {1,3,4,2,2};
            int result = DuplicateNum(arr);
            System.out.println("The duplicate number is: " + result);
        }
}
    