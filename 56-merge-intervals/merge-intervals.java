import java.util.*;

class Solution {
    public int[][] merge(int[][] a) {

        Arrays.sort(a, (x, y) -> x[0] - y[0]);

        List<int[]> res = new ArrayList<>();

        int start = a[0][0];
        int end = a[0][1];

        for (int i = 1; i < a.length; i++) {

            if (end >= a[i][0]) {
                end = Math.max(end, a[i][1]);
            } 
            else {
                res.add(new int[]{start, end});

                start = a[i][0];
                end = a[i][1];
            }
        }

        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][]);
    }
}