class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;//after rotated part2 then part1
        int first=-1;
        while(low<=high){//pehley part 1 k first index nikaalenge 
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[nums.length-1]){
                low=mid+1;
            }
            
            else{
                first=mid;//ye part1 k first index dedega
                high=mid-1;
            }
        }
        low=first;//dono part m binary search laga denge
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=first-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
