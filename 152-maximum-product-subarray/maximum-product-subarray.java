class Solution {
    public int maxProduct(int[] nums) {
        int maxend=nums[0];
        int minend=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=nums[i];
            int b=nums[i]*maxend;
            int c=nums[i]*minend;
            maxend=Math.max(a,Math.max(b,c));
            minend=Math.min(a,Math.min(b,c));
            result=Math.max(result,Math.max(maxend,minend));
        }
        return result;
        
    }
}