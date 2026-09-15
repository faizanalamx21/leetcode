class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;//bottom left s start krenge
        int col=0;
        while(row>=0&&col<matrix[0].length){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){//is case m row eliminate hoga kyuki agar row k pehla element hi bada h to us row k saarey element target s badey hi hongey 
                row--;
            }
            else{
                col++;//is case m column ko eliminate krenge kyuki agar colum k last value hi target s chota h to us colum k saarey element target s chotey hi honge to hmey agley column p dekhna h
            }
        }
        return false;
    }
}
