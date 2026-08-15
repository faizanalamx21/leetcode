class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int low=0;
        int high=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        while(high<n){
            sum+=nums[high];
            while(sum>=target){
                int length=high-low+1;
                minlength=Math.min(minlength,length);
                sum-=nums[low];
                low++;
            }
            high++;
        }
        if(minlength == Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return minlength;
        }

        
    }
}