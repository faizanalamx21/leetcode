 class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        int k=1;
        int j=1;
        while(j<n){
            if(nums[j]==nums[j-1]){
                j++;
            }
            else{
                nums[i+1]=nums[j];
                i++;
                k++;
                j++;
            }
        }
        return k;
    }
}
