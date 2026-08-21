class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=nums[i];
            int b=best+nums[i];
            best=Math.max(a,b);
            result=Math.max(result,best);
        }
        return result;
    }
}
