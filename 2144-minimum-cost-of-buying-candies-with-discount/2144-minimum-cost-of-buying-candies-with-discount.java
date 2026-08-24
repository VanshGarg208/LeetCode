class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int j = cost.length-1;
        int total = 0;

        while (j >= 0) {
            total += cost[j];
            j--;
            if (j >= 0) {
                total += cost[j];
                j--;
            }
            if (j >= 0) {
                j--;
            }
        }
        return total;
    }
}