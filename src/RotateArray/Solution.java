package src.RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
         for(int i=0;i<k;i++){
             for(int j= nums.length-1;j>=0;j--){
                 int temp =nums[j];
                 nums[j]=nums[j-1];
                 nums[j-1]=temp;
             }
         }
    }


    private void betterSolution(int [] nums,int k ){
         int lastPosition = nums.length-1;
         reverse(nums,0,lastPosition);
         reverse(nums,0,k-1);
         reverse(nums,k,lastPosition);
    }


    private void reverse(int [] nums,int start ,int end ){
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
