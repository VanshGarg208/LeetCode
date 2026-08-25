class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] changes = new int[1001];

        for (int[] trip : trips) {
            int pass = trip[0];
            int from = trip[1];
            int to = trip[2];

            changes[from] += pass;
            changes[to] -= pass;
        }

        int curr = 0;
        for (int x : changes) {
            curr += x;
            if (curr > capacity) return false;
        }
        return true;
    }
}