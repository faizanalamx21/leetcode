class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){//uphill hai matlab peak right side m milega
                low=mid+1;
                
            }
            else{
                high=mid-1;//down hill matlab peak left side m milega 
            }
            
        }
        
        return low;//jab high aur low barabar hojye tb loew hi peak hoga

        
    }
}