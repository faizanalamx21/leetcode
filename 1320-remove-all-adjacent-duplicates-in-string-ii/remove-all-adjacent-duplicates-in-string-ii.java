class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st=new Stack<>();//stack k har element as an array rhega jo character aur uski frequesny ko store krega
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&&st.peek()[0]==ch){
                if(st.peek()[1]==k-1){//agar frequesncy k-1 hojye to pop kr denge
                    st.pop();
                }
                else{
                    st.peek()[1]++;//wrna frequesncy ek badha denge 
                }
            }
            else{
                st.push(new int[]{ch,1});//aagar character match hi na krey to usko push krenge with initial frequency of 1
            }
        }
        StringBuilder ans = new StringBuilder();

        for (int[] curr : st) {//stack m char aur uski frequesncy saath m hogi to usko normal string k form m krnwey k liye ye kr rhey h
            for (int i = 0; i < curr[1]; i++) {
                ans.append((char) curr[0]);//ye already rverse form m hi kr rha h to fr s reverse krney ki zrurat nhi h 
            }
        }

        return ans.toString();
        
    }
}