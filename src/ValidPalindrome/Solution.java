package src.ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] sChar = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (Character.isLetterOrDigit(sChar[i])) {
                sb.append(sChar[i]);
            }
        }
        return helper(sb.toString().toLowerCase());
    }

    private boolean helper(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] schar = s.toCharArray();
        while (start < end) {
            while (!Character.isLetterOrDigit(schar[start])) start++;
            while (!Character.isLetterOrDigit(schar[end])) end--;
            if (!String.valueOf(schar[start]).toLowerCase().equals(String.valueOf(schar[end]).toLowerCase())) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
