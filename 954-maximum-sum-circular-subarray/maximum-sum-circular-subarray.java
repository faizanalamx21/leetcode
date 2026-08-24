class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minend=nums[0];
        int maxsum=nums[0];
        int maxend=nums[0];
        int minsum=nums[0];
        
        int sum=0;
        for(int i=1;i<nums.length;i++){
            minend=Math.min(minend+nums[i],nums[i]);
            minsum=Math.min(minsum,minend);
            maxend=Math.max(maxend+nums[i],nums[i]);
            maxsum=Math.max(maxsum,maxend);
            
        }
        for(int x:nums){
            sum+=x;
        }
        if(maxsum<0){
            return maxsum;

        }
        return Math.max(maxsum,sum-minsum);
    }
}