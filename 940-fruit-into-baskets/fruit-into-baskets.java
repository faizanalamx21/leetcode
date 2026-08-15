class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int low=0;
        int high=0;
        int n=fruits.length;
        int result=-1;
        for(high=0;high<n;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>2){
            map.put(fruits[low],map.get(fruits[low])-1);
            if(map.get(fruits[low])==0){
                map.remove(fruits[low]);
            }
            low++;
        }
        int length=high-low+1;
        result=Math.max(length,result);
        }
        return result;
        
        
    }
}