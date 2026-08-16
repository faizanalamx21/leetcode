class Solution {
    int findmax(int[] alphabet){
        int maxlength=-1;
        for(int i=0;i<256;i++){
            maxlength=Math.max(maxlength,alphabet[i]);
            
        }
        return maxlength;
    }
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int low=0;
        int high=0;
        int result=-1;
        int[] alphabet=new int[256];
        for(high=0;high<n;high++){
            alphabet[s.charAt(high)]++;
            int maxlength=findmax(alphabet);
            int length=high-low+1;
            int diff=length-maxlength;
            while(diff>k){
                alphabet[s.charAt(low)]--;
                low++;
                maxlength=findmax(alphabet);
                length=high-low+1;
                diff=length-maxlength;

            }
            length=high-low+1;
            result=Math.max(result,length);
            
        }
        return result;
        
    }
}