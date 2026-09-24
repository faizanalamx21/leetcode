class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder s = new StringBuilder();

        func(digits, 0, map, s, result);

        return result;
    }

    void func(String digits, int index, HashMap<Character, String> map,
              StringBuilder s, List<String> result) {

        if (index == digits.length()) {
            result.add(s.toString());
            return;
        }

        String choices = map.get(digits.charAt(index));

        for (int i = 0; i < choices.length(); i++) {

            s.append(choices.charAt(i));

            func(digits, index + 1, map, s, result);

            s.deleteCharAt(s.length() - 1);
        }
    }
}