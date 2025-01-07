package src.ThreeSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> tripletTemp = new ArrayList<>();
                        tripletTemp.add(nums[i]);
                        tripletTemp.add(nums[j]);
                        tripletTemp.add(nums[k]);
                        Collections.sort(tripletTemp);
                        hashSet.add(tripletTemp);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> triplet : hashSet) {
//            List<Integer> tripletTemp = new ArrayList<>();
//            tripletTemp.add(triplet[0]);
//            tripletTemp.add(triplet[1]);
//            tripletTemp.add(triplet[2]);
//            Collections.sort(tripletTemp);
            result.add(triplet);
        }
        return result;
    }



    private List<List<Integer>> threeSumBetterSolution(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
          if(i>0 && nums[i]==nums[i-1]) continue;
          int j =i+1;
          int k=n-1;
          while (j<k){
              int sum = nums[i]+nums[j]+nums[k];
              if(sum<0){
                  j++;
              } else if (sum>0) {
                  k--;
              }else {
                  List<Integer> temp = new ArrayList<>();
                  temp.add(nums[i]);
                  temp.add(nums[j]);
                  temp.add(nums[k]);
                  result.add(temp);
                  j++;
                  k--;
                  while (j<k && nums[j]!=nums[j-1])j++;
                  while (j<k && nums[k]!=nums[k+1])k--;
              }
          }
        }
        return result;
    }
}
