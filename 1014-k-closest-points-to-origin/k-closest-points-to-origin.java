class Solution {
    class Pair{
        int distance;
        int [] point;
        Pair(int distance,int[]point){
            this.distance=distance;
            this.point=point;

        }

    }
    int distance(int[]point){
        int x=point[0];//origin s hai isliye directly x square+y sqyare
        int y=point[1];
        return x*x+y*y;
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)-> b.distance-a.distance//maxheap banayega
        );
        for(int[]point:points){
            pq.add(new Pair(distance(point),point));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().point;
        }
        return ans;
    }
}