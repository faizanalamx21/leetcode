import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();//minheap banayenge
        for(int i=0;i<k;i++){//shuru m k element ko add krdenge 
            pq.add(nums[i]);//k size k largest element k arraybanayega ye
        }
        for(int i=k;i<n;i++){
            if(nums[i]>=pq.peek()){//agar naya element bada h to root kodeleete krkey isko add krnege
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
        
    }
}