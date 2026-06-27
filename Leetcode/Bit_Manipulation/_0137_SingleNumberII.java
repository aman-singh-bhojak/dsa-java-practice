package Leetcode.Bit_Manipulation;

public class _0137_SingleNumberII {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,99};
        int result = findsingle(arr);
        System.out.print("The element is: " + result);
    }

    static int findsingle(int[] arr) {

        int result = 0;
 
        for(int i = 0; i < 32; i++) {
            int count = 0;
            
            for(int num : arr) {
                if(((num >> i) & 1) == 1) {
                    count++;
                }
            }
            
            if(count % 3 != 0) {
                result = result | (1 << i);
            }
        }
        
        return result;
    }
}
