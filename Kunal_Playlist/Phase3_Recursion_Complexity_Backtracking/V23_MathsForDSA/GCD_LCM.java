package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V23_MathsForDSA;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(111, 33));
        System.out.print(lcm(4, 7));
    }

    static int gcd(int x, int y) {

        if(x == 0) {
            return y;
        }
        return gcd((y%x), x);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
