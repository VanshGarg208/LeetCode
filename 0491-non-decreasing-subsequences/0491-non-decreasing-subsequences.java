class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int[] nums, int start, List<Integer> current,
List<List<Integer>> ans) {

        if (current.size() >= 2) {
            ans.add(new ArrayList<>(current));
        }

        HashSet<Integer> used = new HashSet<>();

        for (int i = start; i < nums.length; i++) {

            if (!current.isEmpty() &&
                nums[i] < current.get(current.size() - 1)) {
                continue;
            }

            if (used.contains(nums[i])) {
                continue;
            }

            used.add(nums[i]);

            current.add(nums[i]);

            backtrack(nums, i + 1, current, ans);

            current.remove(current.size() - 1);
        }
    }
}