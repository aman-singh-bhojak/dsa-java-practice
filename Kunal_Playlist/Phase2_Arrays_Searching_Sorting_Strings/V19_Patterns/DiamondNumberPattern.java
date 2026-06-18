package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V19_Patterns;

public class DiamondNumberPattern {
    static void patta(int  n){

        for(int row = 1; row <= 2 * n ; row++) { 

            int totalspace = row > n ? 2 * n - row: row;
            
            for(int space = 0; space < n - totalspace; space++) {
                System.out.print(" ");
            }


            for(int rev = totalspace; rev >= 1; rev--) {
                System.out.print(rev);
            }

            
            for(int straight = 2; straight <= totalspace ; straight++) {
                System.out.print(straight);
            } 

            System.out.println();
        }
    }

    public static void main(String[] args) {
        patta(5);
    }
}
