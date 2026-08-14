import java.util.*;


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            int target=-1*nums[i];
            
            while(left<right){
                if(nums[left]+nums[right]==target){
                    List<Integer> triplets=new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);
                    result.add(triplets);
                    left++;
                    right--;
                    while(left<n&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0&&nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(nums[left]+nums[right]<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
        
    }
}
