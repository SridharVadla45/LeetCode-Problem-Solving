package src.LongestPalindrome;

import java.util.HashMap;

public class Solution {
    public int longestPalindrome(String s) {
        int count = 0;

        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        for (char c : charArray) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        boolean oddCharflag = false;
        for (Character c : charCount.keySet()) {
            int temp = charCount.get(c);
            if (temp % 2 == 0) {
                count += temp;
            } else {
                if (!oddCharflag) oddCharflag = true;
                count += temp - 1;
            }
        }


        return oddCharflag ? count + 1 : count;
    }
}
