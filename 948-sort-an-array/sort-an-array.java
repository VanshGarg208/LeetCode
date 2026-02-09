class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] arr, int s, int e) {
        if (s >= e) return;

        int mid = s + (e-s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        merge(arr, s, mid, e);
    }

    public void merge(int[] arr, int s, int mid, int e) {
        int n1 = mid - s + 1;
        int n2 = e - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[s + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid+j+1];
        }

        int i = 0, j = 0, k = s;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}