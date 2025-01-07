package src.ClosestThreeSum;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
       return target;
    }


    private int brute(int [] nums,int target){
        int sum = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n; i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int tempSum = nums[i]+nums[j]+nums[k];
                    sum= Math.min(sum,Math.abs(tempSum-target));
                }
            }
        }
        return sum;
    }
}
