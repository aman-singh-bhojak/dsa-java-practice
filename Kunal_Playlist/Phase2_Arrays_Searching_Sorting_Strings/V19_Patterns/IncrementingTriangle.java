package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V19_Patterns;

public class IncrementingTriangle {
    static void patta(int  n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patta(5);
    }
}
