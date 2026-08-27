class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int result=0;
        int zero=0;
        int one=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }
            int diff=zero-one;
            if(diff==0){
                result=Math.max(result,i+1);
                continue;
            }
            if(!map.containsKey(diff)){
                map.put(diff,i);
            }
            int index=map.get(diff);
            int len=i-index;
            result=Math.max(len,result);
        }
        return result;
        
    }
}