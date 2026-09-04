class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();//phley text k saarey characte with frequency ek hashmap m store krenge 
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        HashMap<Character,Integer> need=new HashMap<>();//fr balloon k character aur uski frequency dusrey hashmao m daaalenge
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);
        int result=Integer.MAX_VALUE;//minimum possibnle nikalenge
        for(char c:need.keySet()){
            int available=map.getOrDefault(c,0);
            int req=need.get(c);
            result=Math.min(result,available/req);
        }
        return result;
    }
}