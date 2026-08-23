class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            String binary = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
            sb.append(binary);
        }

        String str = sb.toString();
        return str.equals(sb.reverse().toString());
    }
}