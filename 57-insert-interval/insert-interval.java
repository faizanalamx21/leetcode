class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp=new ArrayList<>();//ek naya array banayenge jisme new interval bhi inserted rhega  
        boolean insert=false;//shuru me ye denote krega ki insert nahi hua h
        for(int i=0;i<intervals.length;i++){
            if(insert==false&& intervals[i][0]>=newInterval[0]){
                insert=true;
                temp.add(newInterval);
            }
            temp.add(intervals[i]);
        }
        if (insert == false) {//jab insert  ekdm last p hoga tb ye use hoga
            temp.add(newInterval);
        }
        int[][]a=temp.toArray(new int[temp.size()][]);//merged list ko wapas array me convert kiye hu yaha p 
        List<int[]> result=new ArrayList<>();
        int start1=a[0][0];
        int end1=a[0][1];
        for(int i=1;i<a.length;i++){
            int start2=a[i][0];
            int end2=a[i][1];
            if(end1>=start2){//merge condition 
                start1=start1;
                end1=Math.max(end1,end2);
            }
            else{
                result.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            }
        }
        result.add(new int[]{start1,end1});//array k form m insert krnege 
        return result.toArray(new int[result.size()][]);//result ko array k form m return krney k liye 
    }
}