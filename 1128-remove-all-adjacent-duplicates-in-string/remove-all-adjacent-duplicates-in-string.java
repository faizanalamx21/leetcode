class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&&s.charAt(i)==st.peek()){//agar top aur current character same hojyega to skip krdenge aur top ko pop bhi kr denge 
                st.pop();
                continue;
            }
            else{
                st.push(s.charAt(i));//wrna push krtey jaao
            }
        }
        StringBuilder result=new StringBuilder();
        for(char ch:st){
            result.append(ch);//stack k character  ko result m jodtey jaao 
        }
        return result.toString();//last m string m covert kr k return krdo
    }
}