class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);//phley sb ko add kr denge
        }
        while(!pq.isEmpty()||pq.size()==1){//jbtk check krenge tbtk ya to heap khaali n hojye ya to 1 element n bechety
            if(pq.size()==1){//agar 1 hi element bachege to usi ko return kara denge
                return pq.peek();
            }
            int x=pq.poll();//1st  heavy stone
            int y=pq.poll();//2nd heavy stone
            if(x==y){//destroy both
                continue;
            }
            else{
                pq.add(Math.abs(x-y));//wrna dono k diffrence k absolute ko heap m wapas add krdo
            }
        }
        return 0;
        
    }
}