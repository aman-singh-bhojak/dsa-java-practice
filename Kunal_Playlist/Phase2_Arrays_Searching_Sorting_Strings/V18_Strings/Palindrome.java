package Kunal_Playlist.Phase2_Arrays_Searching_Sorting_Strings.V18_Strings;

public class Palindrome {
    static boolean isPalindrome(String str) {

        if(str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();

        for(int i = 0; i <= str.length() / 2; i++) {
            char Start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(Start != end) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String list = "abcba";

        System.out.println(isPalindrome(list));
    }
}
