package src.SortArrayByParity2;

public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int i=0,j=0;
       while(j<nums.length){
           if(nums[j]%2==0){
               int temp = nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               i++;
           }
           j++;
       }
       i=1;
       j= nums.length/2;
       while(i< nums.length && j< nums.length){
           int temp = nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
           i+=2;
           j+=2;
       }
       return nums;
    }
}
