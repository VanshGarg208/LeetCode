class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int over_width = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);
        int over_height = Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]);
        if (over_width > 0 && over_height > 0) return true;
        else return false;
    }
}