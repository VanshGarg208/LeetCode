
class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();

        for (int i = k; i < n; i += k) {
            int j = 0;

            while (i + j < n && word.charAt(i + j) == word.charAt(j)) {
                j++;
            }

            if (i + j == n) {
                return i / k;
            }
        }

        return (n + k - 1) / k;
    }
}
