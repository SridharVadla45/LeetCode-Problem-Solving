package src.ReverseWord3;

public class Solution {
    public String reverseWords(String s) {
        int start =0;
        int n = s.length();
        char [] arr = s.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]==' '){
                reverse(arr,start,i-1);
            }
            start=i+1;
        }

        return String.valueOf(arr);

    }


    private void reverse(char [] arr ,int start ,int end ){
        while(start<end){
            char temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
}
