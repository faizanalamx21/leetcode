class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(!pq.isEmpty()||pq.size()==1){
            if(pq.size()==1){
                return pq.peek();
            }
            int x=pq.poll();
            int y=pq.poll();
            if(x==y){
                continue;
            }
            else{
                pq.add(Math.abs(x-y));
            }
        }
        return 0;
        
    }
}