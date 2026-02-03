class Solution {
    public String getSmallestString(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length-1; i++) {
            int curr = arr[i] - '0';
            int next = arr[i+1] - '0';

            if ((curr % 2 == next % 2) && (arr[i] > arr[i+1])) {
                char temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                break;
            }
        }

        return new String(arr);
    }
}