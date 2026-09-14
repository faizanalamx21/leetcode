class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //previous approach may fail in some interviews because it requires 2 times binary search
        int rows=matrix.length;
        int cols=matrix[0].length;
        int low=0;
        int high=(rows*cols)-1;//2D ko 1D k form m fr uska last index 
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid/cols][mid%cols]==target){
                return true;
            }
            else if(matrix[mid/cols][mid%cols]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
        
    }
}