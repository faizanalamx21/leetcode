class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]result=new int[n];
        result[n-1]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(nums[n-1]);
        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(!st.isEmpty()&& st.peek()<=nums[index]){
                st.pop();
            }
            if(st.isEmpty()){
                result[index]=-1;
            }
            else{
                result[index]=st.peek();
                
            }
            st.push(nums[index]);
        }
        return result;
        
    }
}