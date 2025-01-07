package src.IsSentencePanagram;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(solution.checkIfPangram(sentence));
        System.out.println(solution.helper(sentence));
    }
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        char [] charArr = sentence.toCharArray();
        for(char c:charArr){
            set.add(c);
        }
        return set.size() == 26;
    }

    private   boolean helper(String sentence){
        int [] lowerCase = new int[26];
        char [] charArr = sentence.toCharArray();
        for(char c:charArr){
            int position = c-97;
            lowerCase[position]+=1;
        }
        for(int i:lowerCase){
            if(i==0) return false;
        }
        return true;
    }
}
