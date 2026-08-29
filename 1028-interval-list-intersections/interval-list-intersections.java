class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length&&j<secondList.length){//jabtake hi check krenge jbtk ek list khatam n hojye
            int start1=firstList[i][0];//pehla list k first interval
            int end1=firstList[i][1];
            int start2=secondList[j][0];//second list k pehla interval
            int end2=secondList[j][1];
            if(start1<=start2){//jab start sahi order m sorted ho already
                if(end1>=start2){//sorted order k overlappig condition
                    int s=Math.max(start1,start2);//start intersection point
                    int e=Math.min(end1,end2);//end intersection point
                    result.add(new int[]{s,e});
                }
            }
            else{
                if(end2>=start1){//jab ulta sorted ho tb overlapping condition ulti ho jaati h
                    int s=Math.max(start1,start2);//same intersection point
                    int e=Math.min(end1,end2);
                    result.add(new int[]{s,e});

                }
            }
            if(end1<=end2){//agar phli list k interval khtm ho jye to next intyervla p move krjynge
                i++;
            }
            else{
                j++;//jb dusri list k intervla khtm hojye to next interval p move krjynge
            }

        }
        return result.toArray(new int[result.size()][]);//result list ko array k form m return kra denge
        
    }
}