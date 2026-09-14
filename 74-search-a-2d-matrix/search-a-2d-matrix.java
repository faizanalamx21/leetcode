class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;//har row aur column sorted hai to har row k first value agar target s chota h to yes wrna no to pehley hm apna target row khojhney k liye last occurence of yes lagaynege
        int high=matrix.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid][0]<=target){
                res=mid;//yaha hmko target row miljyega using last occurence
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if (res == -1) {
            return false;
        }
        low=0;//fr hm us row p normal binary search lagaynge kyuki wo row ek 1D sorted array k tarah behave krega 
        high=matrix[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[res][mid]==target){
                return true;
            }
            else if(matrix[res][mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        
    }
}