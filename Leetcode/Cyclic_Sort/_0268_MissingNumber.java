package Leetcode.Cyclic_Sort;

public class _0268_MissingNumber {
    static int  Missing(int[] arr) {
        int i = 0;

        while (i < arr.length){
            int check = arr[i];

            if(arr[i] < arr.length && arr[i] != arr[check]) {
                swap(arr, i, check);
            } else {
                i++;
            }


        }

        for(int index = 0; index < arr.length; index++)  {
            if(arr[index] != index) {
                return index;
            }
        }


        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    public static void main(String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = Missing(arr);
        System.out.println("The missing element is: " + ans);
    }
}
