class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){//pehley kya krenge ki ek hasmap banayenge fr usme saari character with its frequency daaal denge 
            char c=s.charAt(i);
            if(!map.containsKey(c)){//agar character nahi h to uskio daallenge with initial frequency of 1
                map.put(c,1);
            }
            else{
                map.put(c,map.getOrDefault(c,0)+1);//wrna frequency badhaynge
            }

        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);//fr yaha p check krenge ki jiska freuency 1 hai matlab wo unique hai 
            if(map.get(c)==1){
                return i;
            }
        }
        return -1;

        
    }
}