package Kunal_Playlist.Phase3_Recursion_Complexity_Backtracking.V31_RecursionGoogleAmazonQuestions;

import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padReturnValue("", "12"));
        System.out.println(Count("", "12"));
    }

    static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        
        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padReturnValue(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        
        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            list.addAll(padReturnValue(p + ch, up.substring(1)));
        }

        return  list;
    }

    static int Count(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + Count(p + ch, up.substring(1));
        }
        return count;
    }

}
