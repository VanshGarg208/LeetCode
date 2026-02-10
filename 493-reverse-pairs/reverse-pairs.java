class Solution {
    public int reversePairs(int[] nums) {
        if (nums.length == 0) return 0;
        return mergeSort(nums, 0, nums.length-1);
    }

    public int mergeSort(int[] nums, int s, int e) {
        if (s >= e) return 0;
        int mid = s + (e-s)/2;
        int count = 0;

        count += mergeSort(nums, s, mid);
        count += mergeSort(nums, mid+1, e);

        int j = mid + 1;
        for (int i = s; i <= mid; i++) {
            while ((j <= e) && (long)nums[i] > 2L * nums[j]) {
                j++;
            }

            count += (j - (mid+1));
        }

        merge(nums, s, mid, e);
        return count;
    }

    public void merge(int[] nums, int s, int mid, int e) {
        int[] temp = new int[e-s+1];
        int left = s, right = mid+1, k = 0;

        while (left <= mid && right <= e) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            }
            else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= e) {
            temp[k++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[s+i] = temp[i];
        }
    }
}