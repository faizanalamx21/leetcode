class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int index=0;
        int[] ans=new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&&dq.peekFirst()<=i-k){//ye window ke left side used element ko hata dega
                dq.removeFirst();
            }
            while(!dq.isEmpty()&& nums[dq.peekLast()]<=nums[i]){//ye dq k last me se smaller element ko hatayega
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                ans[index]=nums[dq.peekFirst()];//result me har window ki max value ko store krega
                index++;
            }
        }
        return ans;
        
    }
}