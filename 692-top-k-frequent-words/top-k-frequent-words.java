class Solution {
    class Pair{//Sabse pehle Heap ke liye ek Pair class banayenge, jisme String word aur uski frequency ko declare karenge
        int freq;
        String word;
        Pair(int freq,String word){
            this.freq=freq;
            this.word=word;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){//HashMap mein array ke saare words aur unki frequency ko store karenge.
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {//Question ki condition ke basis pe comparator define karenge. Agar frequency match nahi karti hai, toh usko frequency ke sorted order mein heap mein insert karenge. Agar frequency match karti hai, toh phir usko lexicographical order ke basis par heap mein store karenge.
                if (a.freq != b.freq) {
                    return a.freq - b.freq;//Ye isliye karenge taaki jo chhoti frequency wala element ho, woh top par aaye aur phir usko easily hum pop kar saken.
                }
                return b.word.compareTo(a.word);//Ye isliye likhe hain taaki jo alphabetically baad mein aata hai, woh pehle heap mein store ho jaaye aur top par aaye, taaki hum usko easily pop kar saken. Aur jo alphabetically pehle aata hai, woh neeche rahe, taaki woh pop out na ho jaaye.
            
            }
        );

        for (String word : map.keySet()) {

            pq.add(new Pair(map.get(word), word));

            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll().word);
        }
        Collections.reverse(ans);//kyuki hmlog minheap bnaye h aur answer ko decreasing order m chahiye

        return ans;
        
    }
}