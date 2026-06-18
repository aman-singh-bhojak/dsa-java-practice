package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V19_Patterns;

public class InvertedLeftTriangle {
    static void patta(int  n){
        for(int i = 0; i < n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patta(5);
    }
}
