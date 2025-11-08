class Solution {

    public int[] replace(int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;

        int[] res = new int[n];
        res[n-1] = -1;
        st.push(nums2[n-1]);

        for (int i = n-2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < nums2[i]) {
                st.pop();
            }
            if (st.size() == 0) res[i] = -1;
            else {
                res[i] = st.peek();
            }
            st.push(nums2[i]);
        }
        return res;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] nge2 = replace(nums2);
        int[] ans = new int[n1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[i] = nge2[j];
                    break;
                }
            }
        }
        return ans;
    }
}