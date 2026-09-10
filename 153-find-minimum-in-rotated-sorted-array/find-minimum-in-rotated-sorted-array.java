class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[nums.length-1]){//agar mid element last elemeent s bada h matlab wo part2 ka hai to hmlog right side m check krenge
                low=mid+1;
            }
            else{
                res=nums[mid];//agar mid element last element s chota h to hmlog part1 m h aur fr part1 k first occurence nikalnege 
                high=mid-1;
            }
        }
        return res;
        
    }
}