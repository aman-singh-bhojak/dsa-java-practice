package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V29_RecursionSubsets;

public class Stream {
    public static void main(String[] args) {
        String s = "abcdahasa";
        // Skip("", s);
        // System.out.println(Skip(s));
        // String check = "abcdappledaka";
        // System.out.println(SkipApple(check));
        String w = "applatekate";
        System.out.println(SkipAppNotApple(w));

    }

    // static void Skip(String p, String up) {
    //     if(up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     if(ch == 'a') {
    //         Skip(p, up.substring(1));
    //     } else {
    //         Skip(p + ch, up.substring(1));
    //     }

    // }

    // static String Skip(String up) {
    //     if(up.isEmpty()) {
    //         return "";
    //     }

    //     char ch = up.charAt(0);

    //     if(ch == 'a') {
    //         return Skip(up.substring(1));
    //     } else {
    //         return ch + Skip(up.substring(1));
    //     }
    // }

    // static String SkipApple(String up) {
    //     if(up.isEmpty()) {
    //         return "";
    //     } 

    //     char ch = up.charAt(0);

    //     if(up.startsWith("apple")) {
    //         return SkipApple(up.substring(5));
    //     } else {
    //         return ch + SkipApple(up.substring(1));
    //     }
    // }

    static String SkipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return SkipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + SkipAppNotApple(up.substring(1));
        }
    }
}
