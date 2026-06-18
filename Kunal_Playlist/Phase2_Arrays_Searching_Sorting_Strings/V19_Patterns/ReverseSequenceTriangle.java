package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V19_Patterns;

public class ReverseSequenceTriangle {
    static void patta(int  n){

        for(int row = 1; row <= n ; row++) { 

            int totalspace = n - row;
            
            for(int space = 0; space < totalspace; space++) {
                System.out.print("  ");
            }

            for(int rev = row; rev >= 1; rev--) {
                System.out.print(rev + " ");
            }

            
            for(int straight = 2; straight <= row ; straight++) {
                System.out.print(straight + " ");
            } 

            System.out.println();
        }
    }

    public static void main(String[] args) {
        patta(5);
    }
}
