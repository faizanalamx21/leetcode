class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0){
            return "";
        }
        int[] freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int low=0;
        int high=0;
        int n=s.length();
        int req=t.length();
        int result=Integer.MAX_VALUE;
        int start=0;
        for(high=0;high<n;high++){
            char r=s.charAt(high);
            if(freq[r]>0){
                req--;
            }
            freq[r]--;
            
            while(req==0){
                if(high-low+1<result){
                    result=high-low+1;
                    start=low;
                }
                char l = s.charAt(low);
                freq[l]++;

                if (freq[l] > 0) {
                    req++;
                }

                low++;
            }

        }
        return result == Integer.MAX_VALUE ? "" : s.substring(start, start + result);
        
    }
}