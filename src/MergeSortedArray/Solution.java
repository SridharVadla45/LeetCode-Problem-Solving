package src.MergeSortedArray;

import java.util.PriorityQueue;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=0,j=0;
           PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
           for(int val2: nums2){
               priorityQueue.add(val2);
           }

           while(i<m && !priorityQueue.isEmpty()){
               int topElement = priorityQueue.peek();
               if(nums1[i]<=topElement)i++;
               else{
                   priorityQueue.add(nums1[i]);
                   nums1[i]=priorityQueue.poll();
                   i++;
               }
           }
           while(!priorityQueue.isEmpty()){
               nums1[i]=priorityQueue.poll();
               i++;
           }
    }
}