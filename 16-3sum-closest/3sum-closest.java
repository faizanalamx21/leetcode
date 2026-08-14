class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int result=0;
        int maxdiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    
                    left++;
                    right--;
                    return sum;
                }
                else if(sum<target){
                    int dif=Math.abs(sum-target);
                    if(dif<maxdiff){
                        maxdiff=dif;
                        result=sum;
                    }
                    left++;
                }
                else{
                    int dif=Math.abs(sum-target);
                    if(dif<maxdiff){
                        maxdiff=dif;
                        result=sum;
                    }
                    right--;

                }

            }
        }
        return result; 
    }
}