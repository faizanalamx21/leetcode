class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp=new ArrayList<>();
        boolean insert=false;
        for(int i=0;i<intervals.length;i++){
            if(insert==false&& intervals[i][0]>=newInterval[0]){
                insert=true;
                temp.add(newInterval);
            }
            temp.add(intervals[i]);
        }
        if (insert == false) {
            temp.add(newInterval);
        }
        int[][]a=temp.toArray(new int[temp.size()][]);
        List<int[]> result=new ArrayList<>();
        int start1=a[0][0];
        int end1=a[0][1];
        for(int i=1;i<a.length;i++){
            int start2=a[i][0];
            int end2=a[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
            }
            else{
                result.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            }
        }
        result.add(new int[]{start1,end1});
        return result.toArray(new int[result.size()][]);
    }
}