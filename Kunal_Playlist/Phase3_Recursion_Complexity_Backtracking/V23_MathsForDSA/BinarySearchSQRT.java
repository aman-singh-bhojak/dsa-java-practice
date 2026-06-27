package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V23_MathsForDSA;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int num = 40;
        int point = 3;

        System.out.printf("%.3f",sqrt(num, point));


    }

    static double sqrt(int n, int p) { 
        int s = 0;
        int e = n;
        double r = 0.0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if(mid * mid == n) {
                return mid;
            }
            if(mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        double incr = 0.1;
        for(int i = 0; i < p; i++) {
            while (r * r <= n) {
                r += incr;
            }

            r-= incr;

            incr /= 10;
        }


        return r;
    }
}
