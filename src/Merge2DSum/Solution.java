package src.Merge2DSum;

import java.util.ArrayList;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        ArrayList<int []> result = new ArrayList<int []>();

        int i=0,j=0;

        while(i<m && j<n){
            int id1=nums1[i][0];
            int id2 = nums2[j][0];
            if( id1<id2){
                int [] temp = {id1,nums1[i][1]};
                result.add(temp);
                i++;
            }else if(id1 == id2){
                int [] temp = {id1,nums1[i][1]+nums2[j][1]};
                result.add(temp);
                i++;
                j++;
            }else {
                int [] temp = {id2,nums2[j][1]};
                result.add(temp);
                j++;
            }
        }

        while(i<m){
            int id1=nums1[i][0];
            int [] temp = {id1,nums1[i][1]};
            result.add(temp);
            i++;
        }

        while(j<n){
            int id2 = nums2[j][0];
            int [] temp = {id2,nums2[j][1]};
            result.add(temp);
            j++;
        }

        return result.toArray(new int[0][]);



    }
}