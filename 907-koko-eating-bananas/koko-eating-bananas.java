class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;//minimum eating speed 1 to rhega hi 
        int high=0;
        int result=0;
        for(int pile:piles){//jo max eating speed rhegi wo maximum bananas wali pile ki value hi rhegi 
            high=Math.max(high,pile);
        }
        while(low<=high){
            int mid=low+(high-low)/2;//shuru me guess krney k liye mid speed s start krnege
            long hours=0;//testcase int p fail so long ues krneg
            for(int pile:piles){//condition k hissab s hours add krnege
                if(pile%mid==0){
                    hours+=pile/mid;
                }
                else{
                    hours+=(pile/mid)+1;
                }
            }
            if(hours>h){//is case m speed badhani pdegi to right side jynge
                low=mid+1;
            }
            else{
                result=mid;//is case m yes speed ki first occurence nikalnege kyiki ye minimum value of k maang rha h 
                high=mid-1;

            }
        }
        return result;
        
    }
}