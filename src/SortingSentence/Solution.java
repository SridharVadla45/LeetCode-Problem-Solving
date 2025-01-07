package src.SortingSentence;

public class Solution {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] words = new String[9];
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(charArray[i])) {
                int position = charArray[i] - 48;
                words[position - 1] = stringBuilder.toString();
                stringBuilder = new StringBuilder();
            } else {
                if (charArray[i] != ' ') stringBuilder.append(charArray[i]);
            }

        }
        StringBuilder result = new StringBuilder();
        result.append(words[0]);
        for (int i = 1; i < 9; i++) {
            if (words[i] != null) {
                result.append(" ");
                result.append(words[i]);
            }
        }
        return result.toString();

    }
}
