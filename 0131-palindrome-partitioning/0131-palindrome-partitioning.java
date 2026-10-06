class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(String s, int start, List<String> current, List<List<String>> ans) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String part = s.substring(start, i+1);
            if (isPalin(part)) {
                current.add(part);
                backtrack(s, i+1, current, ans);
                current.remove(current.size() - 1);
            }
        }
    }

    public boolean isPalin(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }
}