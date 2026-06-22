package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V21_TimeSpaceComplexity;

public class FibonacciFormula {
    public static void main(String[] args) {

        for (int i = 0; i <= 11; i++) {
           System.out.println(fiboFormula(i));
       }
    }

    static int fiboFormula(int n){
         // just for demo, use long instead
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
