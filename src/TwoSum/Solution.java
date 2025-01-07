package src.TwoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }


    public int [] betterTwoSum(int [] nums ,int target){
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for(int i=0;i<nums.length;i++){
             if (hashMap.containsKey(target-nums[i])) {
                int j = hashMap.get(target-nums[i]);
                return new int[]{j,i};
            }
                hashMap.put(nums[i],i );
        }
        return null;
    }
}
