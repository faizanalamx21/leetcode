class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int low=0;
        int high=0;
        int result=Integer.MAX_VALUE;
        int sum=0;
        for(high=0;high<n;high++){
            sum+=nums[high];
            while(sum>=target){
                int length=high-low+1;
                result=Math.min(result,length);
                sum-=nums[low];
                low++;
            }
            


        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }
        return result;
        
    }
}