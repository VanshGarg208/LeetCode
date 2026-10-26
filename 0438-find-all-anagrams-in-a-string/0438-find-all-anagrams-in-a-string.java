class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) return ans;

        int[] freq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']--;

            if (right - left + 1 > p.length()) {
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            if (right - left + 1 == p.length()) {
                boolean valid = true;

                for (int j = 0; j < 26; j++) {
                    if (freq[j] != 0) {
                        valid = false;
                        break;
                    }
                }

                if (valid) ans.add(left);
            }
        }

        return ans;
    }
}