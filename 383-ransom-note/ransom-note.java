class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){//pahley magazine k saarey character k frequency store krlenge 
            char c=magazine.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);//fr ransom k har character wise check krenge ki agar character map m hai aur uski frequency 0 szyada h to bs frequency 1 kam kr denge
            if(map.containsKey(c)&&map.get(c)>0){
                map.put(c,map.get(c)-1);
            }
            else{//agar koi ek single character bhi nahi mila to false
                return false;
            }
        }
        return true;//wrna last m true 
        
    }
}