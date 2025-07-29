class Solution {
public:
    int helper(int n, long long rev) {

        if (n == 0) {
            if (rev < INT_MIN || rev > INT_MAX) {
                return 0;
            }

            return rev;
        }

        rev = rev*10 + n%10;

        if (rev < INT_MIN || rev > INT_MAX) {
            return 0;
        }

        return helper(n/10, rev);
    }

    int reverse(int x) {
        return helper(x, 0);
    }
};