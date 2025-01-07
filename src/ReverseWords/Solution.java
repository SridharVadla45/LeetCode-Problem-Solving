package src.ReverseWords;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        char[] sChar = s.toCharArray();
        int n = s.length();
        int i = 0;
        while (i < n) {
            while (i < n && sChar[i] == ' ') i++;
            int j = i;
            StringBuilder sb = new StringBuilder();
            while (j < n && sChar[i] != ' ') {
                sb.append(sChar[j]);
                j++;
                i++;
            }
            if(!sb.isEmpty()) {
                stack.add(sb.toString());
            }
        }
        StringBuilder sbResult = new StringBuilder();
        while (!stack.isEmpty())
        {
            sbResult.append(stack.pop());
            if(!stack.isEmpty()){
                sbResult.append(" ");
            }
        }
        return sbResult.toString();
    }
}
