import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '(' ){
                st.push(')' );//agar opening mil to uskey respective closing ko push krnge for easy comparision
            }
            else if(ch == '[' ){
                st.push(']' );
            }
            else if(ch == '{' ){
                st.push('}' );
            }
            else{
                if(st.isEmpty()){//opening bracket s phley closing aagya to invalid hoga
                    return false;
                }
                char top=st.pop();//agar current character stack k top k barabar nahi h to invalid
                if(top!=ch){
                    return false;
                }
            }
        }
        return st.isEmpty();//last m check krenge ki tsack khaali hua ki nahi because number of opening must be equal to no: of closing
    }
}
