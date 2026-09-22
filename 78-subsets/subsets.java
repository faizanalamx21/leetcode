class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        int idx=0;
        List<Integer> current = new ArrayList<>();
        func(nums,n,idx,result,current);
        return result;

        
    }
    void func(int[] arr,int length,int index,List<List<Integer>> answer,List<Integer> current){
        if(index==length){
            answer.add(new ArrayList<>(current));
            return;
        }
        func(arr,length,index+1,answer,current);//jab include nahi krenge tb next index p move krlenge

        //jab include krenge tb 
        current.add(arr[index]);//result m add krlo
        func(arr,length,index+1,answer,current);//next index call
        current.remove(current.size() - 1);//backtracing k liye answer remove
        

    }
}