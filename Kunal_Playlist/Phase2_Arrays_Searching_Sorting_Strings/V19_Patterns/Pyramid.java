package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V19_Patterns;

public class Pyramid {
    static void patta(int  n){
        for(int row = 1; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for(int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patta(5);
    }
}
