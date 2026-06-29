package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V25_Recursion_Array_Questions;

public class RecursionLinear {
    public static void main(String[] args) {
        int[] arr = {3,1,67,21,5,54};
        int target = 54;
        System.out.println(isFound(arr, target, 0));
    }

    static boolean isFound(int[] arr, int target, int i) {

        if(i == arr.length) {
            return false;
        }
        
        return arr[i] == target || isFound(arr, target, i+1);
    }
}
