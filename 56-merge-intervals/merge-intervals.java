import java.util.*;

class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a, (x, y) -> x[0] - y[0]);//array ko start k basis p sort krnege

        List<int[]> result=new ArrayList<>();
        int start1=a[0][0];//pehla interval
        int end1=a[0][1];
        for(int i=1;i<a.length;i++){
            int start2=a[i][0];
            int end2=a[i][1];
            if(end1>=start2){//merge kara denge
                start1=start1;
                end1=Math.max(end1,end2);
                continue;
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