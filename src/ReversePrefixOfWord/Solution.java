package src.ReversePrefixOfWord;

import java.util.Arrays;

public class Solution {
    public String reversePrefix(String word, char ch) {
        char [] charWord = word.toCharArray();
        for(int i =0;i<charWord.length;i++){
            if(charWord[i]==ch){
                reverse(charWord,0,i);
                break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char i :charWord){
            stringBuilder.append(i);
        }

        return stringBuilder.toString();

    }


    private void reverse(char [] word ,int i ,int j ){
        while(i<=j){
            char temp = word[i];
            word[i]=word[j];
            word[j]=temp;
            i++;
            j--;
        }
    }

}
