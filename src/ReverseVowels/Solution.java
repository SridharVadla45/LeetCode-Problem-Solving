package src.ReverseVowels;

import java.util.HashSet;
import java.util.Stack;

public class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char i : charArray) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'
           || i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
                stack.add(i);
            }
        }

        for(int i=0;i<charArray.length;i++){
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'
            || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O' || charArray[i] == 'U'
            ) {
                if(!stack.isEmpty()){
                    charArray[i]= stack.pop();
                }
            }
        }

        StringBuilder stringBuilder= new StringBuilder();
        for(char i:charArray){
            stringBuilder.append(i);
        }

        return stringBuilder.toString();

    }

    private String reverse(String s){
        int i=0;
        int j =s.length()-1;
        char [] charArray = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while(i<j){
            while(i<j && !vowels.contains(charArray[i])) i++;
            while(i<j && !vowels.contains(charArray[j])) j--;
            char temp = charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            i++;
            j--;
        }
        StringBuilder stringBuilder= new StringBuilder();
        for(char c:charArray){
            stringBuilder.append(c);
        }

        return stringBuilder.toString();

    }

}
