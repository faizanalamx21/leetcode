class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low=matrix[0][0];
        int high=matrix[matrix.length-1][matrix[0].length-1];
        int result=0;
        if(low==0&&high==0){
            return matrix[low][high];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            //int count=0;
            int count=ispresent(matrix,mid);
            
            if(count>=k){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
        
    }
     int ispresent(int[][] arr, int target) {
        int row = arr.length - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < arr[0].length) {
            if (arr[row][col] <= target) {
                count += row + 1;
                col++;
            }
            else {
                row--;
            }
        }

        return count;
    }
}