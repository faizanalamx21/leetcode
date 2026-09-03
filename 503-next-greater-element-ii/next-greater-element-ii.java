class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]result=new int[n];
        //kyuki ye circular array h to last element ka next greater _1 phley s declare nahi kr sktey
        Stack<Integer> st=new Stack<>();
        for(int i=n-2;i>=0;i--){//ismey shuru m stack m eleement push krna pdega 
            st.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){//loop last index s chlegi kyuki last index k result predefined nahi h 
            //baaki sb next grerater k code k trah same hi h
            while(!st.isEmpty()&& st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=st.peek();
                
            }
            st.push(nums[i]);
        }
        return result;
        
    }
}