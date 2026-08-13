public class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] positive=new int[n];
        int[] negative=new int[n];
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                positive[x]=nums[i];
                x++;
            }
            else{
                negative[y]=nums[i];
                y++;
            }
        }
        for(int i=0;i<x;i++){
            positive[i]*=positive[i];
        }
        for(int j=0;j<y;j++){
            negative[j]*=negative[j];
        }
        int a=0;
        int b=y-1;
        
        while(a<b){
            int temp=negative[a];
            negative[a]=negative[b];
            negative[b]=temp;
            a++;
            b--;
        }
        int left=0;
        int right=0;
        int index=0;
        int [] result=new int[n];
        while(left<y&&right<x){
            if(negative[left]<=positive[right]){
                result[index]=negative[left];
                left++;
                index++;

            }
            else{
                result[index]=positive[right];
                right++;
                index++;
            }
        

        }
        while(left<y){
            result[index]=negative[left];
            left++;
            index++;
        }
        while(right<x){
            result[index]=positive[right];
            right++;
            index++;
            }
        return result;
    }
}
