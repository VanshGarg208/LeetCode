class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        solve(n, "", res);
        return res;
    }

    public void solve(int n, String curr, List<String> res) {
        if (curr.length() == n) {
            res.add(curr);
            return;
        }

        solve(n, curr+"1", res);

        if ((curr.length() == 0) || (curr.charAt(curr.length()-1) != '0')) {
            solve(n, curr+"0", res);
        }
    }
}