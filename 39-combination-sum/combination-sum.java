class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();

        func(candidates, target, 0, diary, 0, result);

        return result;
    }

    void func(int[] a, int target, int index, List<Integer> diary,
              int sum, List<List<Integer>> result) {

        if (index == a.length) {
            if (sum == target) {
                result.add(new ArrayList<>(diary));
            }
            return;
        }

        // current index ko skip krenge aur next index p move means result m add nhi krenge
        func(a, target, index + 1, diary, sum, result);

        // current index ko lenge aur repeat krenge jbtk sum k barabar ya ussey chota n rhey
        if (sum + a[index] <= target) {
            diary.add(a[index]);
            sum = sum + a[index];

            func(a, target, index, diary, sum, result);

            diary.remove(diary.size() - 1);
            sum = sum - a[index];
        }
    }
}