class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&&st.peek()[0]==ch){
                if(st.peek()[1]==k-1){
                    st.pop();
                }
                else{
                    st.peek()[1]++;
                }
            }
            else{
                st.push(new int[]{ch,1});
            }
        }
        StringBuilder ans = new StringBuilder();

        for (int[] curr : st) {
            for (int i = 0; i < curr[1]; i++) {
                ans.append((char) curr[0]);
            }
        }

        return ans.toString();
        
    }
}