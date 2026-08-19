class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;
        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            int boxes = Math.min(boxTypes[i][0], truckSize);
            totalUnits += boxes * boxTypes[i][1];
            truckSize -= boxes;
        }
        return totalUnits;
    }
}