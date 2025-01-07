package src.ApplyOperationToArray;

public class Solution {

    public int[] applyOperations(int[] nums) {

        int i=0,j=1;
        while(j< nums.length){
            if(nums[i]==nums[j]){
                nums[i]*=2;
                nums[i+1]=0;
            }
            i++;
            j++;
        }

        i=0;
        j=0;
        while(j<nums.length){
            if(nums[j]>0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }


       return nums ;

    }
}
