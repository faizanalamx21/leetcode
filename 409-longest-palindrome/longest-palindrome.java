class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int ans = 0;
        boolean odd = false;

        for (char c : map.keySet()) {
            int count = map.get(c);

            if (count % 2 == 0) {//agar even frequency hai to pura hi daal do
                ans += count;
            } else {
                ans += count - 1;//wrna 1 minus krkey resulyt m add kro
                odd = true;
            }
        }

        if (odd) {//agar odd hai to ans me 1 badha do
            ans++;
        }

        return ans;
    }
}