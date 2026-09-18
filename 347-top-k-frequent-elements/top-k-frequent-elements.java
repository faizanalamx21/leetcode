import java.util.*;
class Solution {
    class Pair{//heap for pairs 
        int freq;
        int num;
        Pair(int freq,int num){
            this.freq=freq;
            this.num=num;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();//phley hashmap m unique element aur uski frequency store krenge
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b) ->a.freq-b.freq//frequency k basis p min heap bnaynge
        );
        for(int num:map.keySet()){
            pq.add(new Pair(map.get(num),num));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().num;
        }
        return ans;
        
    }
}