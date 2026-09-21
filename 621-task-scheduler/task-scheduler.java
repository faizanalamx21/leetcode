import java.util.*;

class Solution {

    class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : tasks) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> free = new HashMap<>();

        for (char ch : freq.keySet()) {
            free.put(ch, 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.freq - a.freq
        );

        int time = 1;
        int remaining = tasks.length;

        while (remaining > 0) {

            pq.clear();

            for (char ch : freq.keySet()) {
                if (freq.get(ch) > 0 && free.get(ch) <= time) {
                    pq.add(new Pair(ch, freq.get(ch)));
                }
            }

            if (!pq.isEmpty()) {

                Pair p = pq.poll();

                freq.put(p.ch, p.freq - 1);

                free.put(p.ch, time + n + 1);

                remaining--;
            }

            time++;
        }

        return time - 1;
    }
}