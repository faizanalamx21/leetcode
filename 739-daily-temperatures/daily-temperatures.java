import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] result=new int[n];
        result[n-1]=0;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(!st.isEmpty()&&temp[st.peek()]<=temp[i]){
                st.pop();
                count++;

            }
            if(st.isEmpty()){
                result[i]=0;
            }
            else{
                result[i]=st.peek()-i;
            }
            st.push(i);
        }
        return result;
        
    }
}
