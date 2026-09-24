class Solution {
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        List<String> result=new ArrayList<>();
        String s="";
        func(open,close,n,s,result);
        return result;
        
    }
    void func(int open,int close,int n,String s,List<String> result){
        if(open==n&&close==n){
            result.add(s);
            return;
        }
        //open bracket add k code using backtracking
        if(open<n){//open bracket add krney k condition
            s=s+"(";//open bracket add
            func(open+1,close,n,s,result);
            s=s.substring(0,s.length()-1);//last character delete
        }
        if(close<open){//close bracket add krney k condition
            s=s+")";//close bracket add
            func(open,close+1,n,s,result);
            s=s.substring(0,s.length()-1);//last character delete

        }
        return ;
    }
}