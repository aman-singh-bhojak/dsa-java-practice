package Leetcode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class _0017_LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        _0017_LetterCombinationsOfPhoneNumber sol = new _0017_LetterCombinationsOfPhoneNumber();
        System.out.println(sol.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) {
            return ans;
        }

        String[] letters = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        StringBuilder list = new StringBuilder();

        backtrack(digits, letters, list, ans, 0);

        return ans;
    }

    public void backtrack(String digits, String[] letters, StringBuilder list, List<String> ans, int index) {

        if(list.length() == digits.length()) {
            ans.add(list.toString());
            return;
        }

        String current = letters[digits.charAt(index) - '0'];

        for(int i = 0; i < current.length(); i++) {
            list.append(current.charAt(i));
            backtrack(digits, letters, list, ans, index + 1);
            list.deleteCharAt(list.length() - 1);
        }
    }
}
