package src.PivotParity;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] result = new int[nums.length];
        int count=0;
        int pivotcount=0;
        for(int i : nums){
            if(i<pivot) {
                result[count]=i;
                count++;
            } else if (i==pivot) {
                pivotcount++;
            }
        }

        while (pivotcount-->0){
            result[count]=pivot;
            count++;
        }

        for(int i:nums){
            if(i>pivot){
                result[count]=i;
                count++;
            }
        }
        return result;

    }



}
