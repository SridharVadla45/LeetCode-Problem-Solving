package src.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k =j+1;k<n;k++){
                    for(int m=k+1;m<n;m++){
                        int sum = nums[i]+nums[j]+nums[k]+nums[m];
                        if(sum == target){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[m]);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }


    private
}
