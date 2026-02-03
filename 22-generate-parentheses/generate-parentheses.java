class Solution {

    public void para(int n, int l, int r, String str, List<String> list) {
        if (r == n) {
            list.add(str);
            return;
        }
        if (l < n) para(n, l+1, r, str+"(", list); // left wala
        if (r < l) para(n, l, r+1, str+")", list); // rigth wala
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        para(n, 0, 0, "", list);
        return list;
    }
}