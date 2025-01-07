package src.DefangingIP;

public class Solution {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        Solution solution = new Solution();
        System.out.println(solution.defangIPaddr(address));
    }

    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = address.toCharArray();
        for (char c : charArray) {
          if(c=='.') stringBuilder.append("[.]");
          else stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
